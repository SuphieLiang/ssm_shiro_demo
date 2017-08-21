package com.yz.demo.service.impl;

import com.yz.demo.domain.Permission;
import com.yz.demo.mapper.PermissionMapper;
import com.yz.demo.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper mapper;
    @Override
    public void createPermission(Permission permission) {
       mapper.createPermission(permission);
    }

    @Override
    public void deletePermission(Long permissionId) {
       mapper.deletePermission(permissionId);
    }
}
