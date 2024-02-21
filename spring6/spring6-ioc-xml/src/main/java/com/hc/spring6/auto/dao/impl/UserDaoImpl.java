package com.hc.spring6.auto.dao.impl;

import com.hc.spring6.auto.dao.UserDao;
import lombok.extern.slf4j.Slf4j;

/**
 * @author HuangChi
 * @since 2024/2/20
 */

@Slf4j
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        log.info("UserDaoImpl.add() execute...");
    }
}
