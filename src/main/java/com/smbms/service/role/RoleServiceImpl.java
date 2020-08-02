package com.smbms.service.role;

import com.smbms.mapper.role.RoleMapper;
import com.smbms.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2020/5/28.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 获取角色列表
     * @return
     * @throws Exception
     */
    @Override
    public List<Role> getRoleList() throws Exception {
        List<Role> roleList = roleMapper.getRoleList();
        return roleList;
    }


}
