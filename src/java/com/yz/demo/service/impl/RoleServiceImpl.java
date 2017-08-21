package com.yz.demo.service.impl;

import com.yz.demo.domain.Role;
import com.yz.demo.mapper.RoleMapper;
import com.yz.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Override
    public void  createRole(Role role) {
           roleMapper.createRole(role);
    }

    @Override
    public void deleteRole(Long roleId) {

    }

    @Override
    public void correlationPermissions(Long roleId, Long... permissionIds) {

    }

    @Override
    public void uncorrelationPermissions(Long roleId, Long... permissionIds) {

    }
}
