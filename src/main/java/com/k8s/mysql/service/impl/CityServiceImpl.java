package com.k8s.mysql.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.k8s.mysql.common.entity.City;
import com.k8s.mysql.common.entity.CityExample;
import com.k8s.mysql.common.mapper.CityMapper;
import com.k8s.mysql.service.CityService;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	CityMapper cityMapper;

	@Override
	public long countByExample(CityExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(CityExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(City record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(City record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<City> selectByExample(CityExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public City selectByPrimaryKey(Integer id) {
		
		return cityMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(City record, CityExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(City record, CityExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(City record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(City record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
