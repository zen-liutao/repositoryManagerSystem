package com.wudao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.wudao.entity.Log;

/**
 * 系统日志Repository接口
 * @author wudao 小锋 老师
 *
 */
public interface LogRepository extends JpaRepository<Log, Integer>,JpaSpecificationExecutor<Log>{

	
}
