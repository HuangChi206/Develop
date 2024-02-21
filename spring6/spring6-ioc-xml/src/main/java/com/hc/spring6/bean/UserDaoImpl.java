package com.hc.spring6.bean;

/**
 * @author HuangChi
 * @since 2024/2/6
 */
public class UserDaoImpl implements UserDao {
    @Override
    public Boolean add(String name, Integer age) {
        return (name != null && !name.isEmpty()) || (age != null);
    }
}
