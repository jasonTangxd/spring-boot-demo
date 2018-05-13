package com.cs.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cs.bean.Demo;
import com.cs.dao.DemoDao;
import com.cs.dao.DemoRepository;

@Service
public class DemoService {

	@Resource
	private DemoRepository demoRepository;
	
	@Resource
	private DemoDao demoDao;

	@Transactional
	public void save(Demo demo) {
		demoRepository.save(demo);
	}
	
	public Demo getById(long id){
		//demoRepository.findOne(id);//在demoRepository可以直接使用findOne进行获取.
		return demoDao.getById(id);
	}
}
