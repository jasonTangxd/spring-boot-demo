package com.cs.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cs.bean.UserInfo;
import com.cs.repository.UserInfoRepository;
import com.cs.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Resource
	private UserInfoRepository userInfoRepository;
	
	@Override
	public UserInfo findByUsername(String username) {
		System.out.println("UserInfoServiceImpl.findByUsername()");
		return userInfoRepository.findByUsername(username);
	}
}
