package com.cjj.usercenter.service.user;

import com.cjj.usercenter.domain.entity.user.User;

public interface UserService {
    /**
     * 根据用户id查询用户
    * @param id
     * @return
     */
    User getUserById(Integer id);
}
