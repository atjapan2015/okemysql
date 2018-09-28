package com.k8s.mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.k8s.mysql.common.entity.City;
import com.k8s.mysql.service.CityService;

@RestController
public class CityController {

	@Autowired
	CityService cityService;

	@RequestMapping(value = "/city/{id}")
	public City getCity(@PathVariable("id") Integer id) {

		City city = cityService.selectByPrimaryKey(id);
		return city;
	}
}
