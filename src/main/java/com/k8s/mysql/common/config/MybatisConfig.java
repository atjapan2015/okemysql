package com.k8s.mysql.common.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@MapperScan(basePackages = "com.k8s.mysql.common.mapper")
public class MybatisConfig {

	@Autowired
	DataSourceProperties dataSourceProperties;

	@Bean(destroyMethod = "close")
	@Primary
	DataSource mysqlDataSource() throws Exception {

		HikariDataSource ds = new HikariDataSource();
		ds.setDriverClassName(this.dataSourceProperties.getDriverClassName());
		ds.setJdbcUrl(this.dataSourceProperties.getUrl());
		ds.setUsername(this.dataSourceProperties.getUsername());
		ds.setPassword(this.dataSourceProperties.getPassword());
		ds.setMaxLifetime(1000);
		return ds;
	}

	@Bean
	public SqlSessionFactory getSqlSessionFactory(DataSource ds) throws Exception {

		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(ds);
		factoryBean.setTypeAliasesPackage("com.k8s.mysql.common.entity");
		factoryBean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("classpath:com/k8s/mysql/common/mapper/*.xml"));

		return factoryBean.getObject();
	}
}
