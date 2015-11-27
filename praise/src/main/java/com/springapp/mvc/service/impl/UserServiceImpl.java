package com.springapp.mvc.service.impl;

import com.springapp.mvc.dao.UserDao;
import com.springapp.mvc.model.User;
import com.springapp.mvc.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhouxianwu on 2015/7/29.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(String userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
}
