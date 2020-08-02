package com.smbms.service.role;

import com.smbms.pojo.Role;

import java.util.List;

/**
 * Created by Administrator on 2020/5/28.
 */
public interface RoleService {

    //获取角色列表
    public List<Role> getRoleList() throws Exception;


}
