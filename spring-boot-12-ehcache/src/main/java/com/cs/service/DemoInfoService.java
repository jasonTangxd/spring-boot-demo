package com.cs.service;

import javassist.NotFoundException;

import com.cs.bean.DemoInfo;

public interface DemoInfoService {
	
	DemoInfo save(DemoInfo demoInfo);
	
	void delete(Long id);
	
	DemoInfo update(DemoInfo updated) throws NotFoundException;
	
	DemoInfo findById(Long id);
}
