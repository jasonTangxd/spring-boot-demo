package com.cs.repository;

import org.springframework.data.repository.CrudRepository;

import com.cs.bean.DemoInfo;

/**
* DemoInfo持久化类
*/
public interface DemoInfoRepository extends CrudRepository<DemoInfo,Long>{

}
