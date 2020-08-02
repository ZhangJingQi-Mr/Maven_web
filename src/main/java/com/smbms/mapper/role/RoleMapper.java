package com.smbms.mapper.role;

import com.smbms.pojo.Role;

import java.util.List;

public interface RoleMapper {

	// 	查询角色列表
	public List<Role> getRoleList()throws Exception;

}
