package com.hc.spring6;

import com.hc.spring6.config.SpringConfig;
import com.hc.spring6.controller.UserController;
import com.hc.spring6.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangChi
 * @since 2024/2/21
 */

@Slf4j
public class UserTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = context.getBean(UserController.class);
        User user = new User();
        log.info(userController.addUser(user));
    }

    @Test
    public void test2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean(UserController.class);
        User user = new User();
        log.info(userController.addUser(user));
    }
}
