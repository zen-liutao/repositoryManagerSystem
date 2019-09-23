package com.wudao.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wudao.entity.UserRole;
import com.wudao.repository.UserRoleRepository;
import com.wudao.service.UserRoleService;

/**
 * 用户角色关联Service实现类
 * @author wudao 小锋 老师
 *
 */
@Service("userRoleService")
@Transactional
public class UserRoleServiceImpl implements UserRoleService{

	@Resource
	private UserRoleRepository userRoleRepository;
	
	@Override
	public void save(UserRole userRole) {
		userRoleRepository.save(userRole);
	}



	@Override
	public void delete(UserRole userRole) {
		userRoleRepository.delete(userRole);
	}

	@Override
	public UserRole findById(Integer id) {
		return userRoleRepository.findOne(id);
	}

	@Override
	public void deleteByUserId(Integer userId) {
		userRoleRepository.deleteByUserId(userId);
	}

	@Override
	public void deleteByRoleId(Integer userId) {
		userRoleRepository.deleteByRoleId(userId);
	}

	

}
