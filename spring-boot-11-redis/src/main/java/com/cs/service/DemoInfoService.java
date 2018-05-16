package com.cs.service;

import com.cs.bean.DemoInfo;

/**
* demoInfo 服务接口
*/
public interface DemoInfoService {

	public DemoInfo findById(long id);
	
	public void deleteFromCache(long id);
	
	void test();
}
