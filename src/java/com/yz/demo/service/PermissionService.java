package com.yz.demo.service;

import com.yz.demo.domain.Permission;

public interface PermissionService {

    public void createPermission(Permission permission);

    public void deletePermission(Long permissionId);
}
