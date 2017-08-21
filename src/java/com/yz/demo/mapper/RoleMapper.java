package com.yz.demo.mapper;

import com.yz.demo.domain.Role;
import com.yz.demo.domain.User;

import java.util.Set;

public interface RoleMapper {
    public void  createRole(Role role);
    public void deleteRole(Long roleId);

    public void correlationPermissions(Long roleId, Long... permissionIds);
    public void uncorrelationPermissions(Long roleId, Long... permissionIds);
}
