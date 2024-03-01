package com.hc.spring6.service.impl;

import com.hc.spring6.dao.UserDao;
import com.hc.spring6.entity.User;
import com.hc.spring6.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author HuangChi
 * @since 2024/2/21
 */

@Service
// @Service通常作用在业务层（Service 层），用于将业务层的类标识为Spring中的Bean，其功能与@Component相同。
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public String addUser(User user) {
        return userDao.addUser(user);
    }
}
