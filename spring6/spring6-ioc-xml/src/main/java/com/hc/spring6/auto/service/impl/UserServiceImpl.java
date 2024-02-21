package com.hc.spring6.auto.service.impl;

import com.hc.spring6.auto.dao.UserDao;
import com.hc.spring6.auto.service.UserService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author HuangChi
 * @since 2024/2/20
 */

@Slf4j
@Setter
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public void add() {
        log.info("UserServiceImpl.add() execute...");
        userDao.add();
    }
}
