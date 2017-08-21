package com.yz.demo.service.impl;

import com.yz.demo.domain.User;
import com.yz.demo.mapper.UserMapper;
import com.yz.demo.service.PasswordHelper;
import com.yz.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper mapper;
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Resource
    private PasswordHelper helper;

    public void setHelper(PasswordHelper helper) {
        this.helper = helper;
    }

    @Override
    public void createUser(User user) {
        PasswordHelper helper=new PasswordHelper();
        helper.encryptPassword(user);
        mapper.createUser(user);

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public void correlationRoles(Long userId, Long... roleIds) {

    }

    @Override
    public void uncorrelationRoles(Long userId, Long... roleIds) {

    }

    @Override
    public User findOne(Long userId) {
        return null;
    }

    @Override
    public User findByUsername(String username) {

        return mapper.findByUsername(username);
    }

    @Override
    public Set<String> findRoles(String username) {

        return mapper.findRoles(username);
    }

    @Override
    public Set<String> findPermissions(String username) {
        return null;
    }
}
