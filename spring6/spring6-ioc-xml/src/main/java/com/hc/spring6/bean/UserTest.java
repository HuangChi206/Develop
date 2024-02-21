package com.hc.spring6.bean;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangChi
 * @since 2024/2/5
 */

@Slf4j
public class UserTest {

    @Test
    public void test1() {
        // 通过读取类路径下的XML配置文件创建IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 1.通过id获取
        User user1 = (User) context.getBean("user");
        log.info(user1.toString());
        // 2.根据类型获取
        // 根据类型获取bean时，IOC容器中指定类型的bean只能有一个
        User user2 = context.getBean(User.class);
        log.info(user2.toString());
        // 3.根据id和类型获取
        User user3 = context.getBean("user", User.class);
        log.info(user3.toString());
    }

    @Test
    public void test2() {
        // 通过读取类路径下的XML配置文件创建IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 根据类型获取bean
        UserDao userDao = context.getBean(UserDao.class);
        log.info(userDao.add("张三", 18).toString());
        log.info(userDao.toString());
    }
}
