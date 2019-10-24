package com.cjj.usercenter.service.user.impl;

import com.cjj.usercenter.dao.user.UserMapper;
import com.cjj.usercenter.domain.entity.user.User;
import com.cjj.usercenter.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
