package com.hc.spring6.auto;

import com.hc.spring6.auto.controller.UserController;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangChi
 * @since 2024/2/20
 */

@Slf4j
public class UserTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-auto.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.add();
    }
}
