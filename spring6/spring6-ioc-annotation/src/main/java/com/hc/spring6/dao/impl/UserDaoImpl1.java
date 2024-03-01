package com.hc.spring6.dao.impl;

import com.hc.spring6.dao.UserDao;
import com.hc.spring6.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Objects;

/**
 * @author HuangChi
 * @since 2024/2/26
 */

@Repository
public class UserDaoImpl1 implements UserDao {
    @Override
    public String addUser(User user) {
        return Objects.nonNull(user.getId()) && !user.getName().isEmpty() ? "添加成功" : "添加失败";
    }
}
