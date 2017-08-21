package com.yz.demo.mapper;

import com.yz.demo.domain.Permission;
import com.yz.demo.domain.Role;

public interface PermissionMapper {
    public void createPermission(Permission permission);

    public void deletePermission(Long permissionId);
}
