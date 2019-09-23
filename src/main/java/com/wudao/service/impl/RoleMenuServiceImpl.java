package com.wudao.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wudao.entity.RoleMenu;
import com.wudao.repository.RoleMenuRepository;
import com.wudao.service.RoleMenuService;

/**
 * 角色权限菜单关联Service实现类
 * @author wudao 小锋 老师
 *
 */
@Service("roleMenuService")
@Transactional
public class RoleMenuServiceImpl implements RoleMenuService{

	@Resource
	private RoleMenuRepository roleMenuRepository;

	@Override
	public void deleteByRoleId(Integer roleId) {
		roleMenuRepository.deleteByRoleId(roleId);
	}

	@Override
	public void save(RoleMenu roleMenu) {
		roleMenuRepository.save(roleMenu);
	}
	
	
}
