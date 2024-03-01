package com.hc.spring6.dao.impl;

import com.hc.spring6.dao.UserDao;
import com.hc.spring6.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Objects;

/**
 * @author HuangChi
 * @since 2024/2/21
 */

@Repository("userDao")
// @Repository通常作用在数据访问层（dao 层），用于将数据访问曾的类标识为Spring中的Bean，其功能与@Component 相同。
public class UserDaoImpl implements UserDao {

    @Override
    public String addUser(User user) {
        return Objects.nonNull(user.getId()) && !user.getName().isEmpty() ? "添加成功" : "添加失败";
    }
}
