package com.cn.emu.service;

import java.util.List;

import com.cn.emu.entities.Dept;

public interface DeptService {

	public boolean add(Dept dept);
	
	public Dept get(Long id);
	
	public List<Dept> list();
}
