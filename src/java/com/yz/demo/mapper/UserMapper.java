package com.yz.demo.mapper;

import com.yz.demo.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Component
public interface UserMapper {
    public void createUser(User user);
    public void updateUser(User user);
    public void deleteUser(Long userId);

    public void correlationRoles(Long userId, Long... roleIds);
    public void uncorrelationRoles(Long userId, Long... roleIds);

    User findOne(Long userId);

    User findByUsername(String username);

    Set<String> findRoles(String username);

    Set<String> findPermissions(String username);
}
