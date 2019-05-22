package com.yueqian.mapper;

import com.yueqian.pojo.SysPermission;
import com.yueqian.pojo.TreeMenu;

import java.util.List;

public interface SysPermissionCustomMapper {

	
	public List<TreeMenu> getTreeMenu();
	
	public List<SysPermission> getSubMenu(int id);
}
