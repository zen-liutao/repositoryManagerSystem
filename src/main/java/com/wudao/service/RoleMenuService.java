package com.wudao.service;

import com.wudao.entity.RoleMenu;

/**
 * 角色权限关联Service接口
 * @author wudao 小锋 老师
 *
 */
public interface RoleMenuService {

	/**
	 * 根据角色id删除所有关联信息
	 * @param id
	 */
	public void deleteByRoleId(Integer roleId);
	
	/**
	 * 保存
	 * @param roleMenu
	 */
	public void save(RoleMenu roleMenu);
}
