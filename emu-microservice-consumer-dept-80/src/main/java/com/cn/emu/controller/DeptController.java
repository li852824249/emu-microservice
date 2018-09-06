package com.cn.emu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cn.emu.entities.Dept;

@RestController
public class DeptController {
	
	private static final String REST_URLPREFIX = "http://localhost:8001";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/consumer/dept/add",method=RequestMethod.POST)
	public boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URLPREFIX+"/dept/add", dept, Boolean.class);
	}
	
	@RequestMapping(value="/consumer/dept/get/{id}",method=RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URLPREFIX+"/dept/get/"+id, Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/consumer/dept/list",method=RequestMethod.GET)
	public List<Dept> list(){
		return restTemplate.getForObject(REST_URLPREFIX+"/dept/list", List.class);
	}
}
