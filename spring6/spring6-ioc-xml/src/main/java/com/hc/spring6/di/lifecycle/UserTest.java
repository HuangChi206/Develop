package com.hc.spring6.di.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangChi
 * @since 2024/2/19
 */
@Slf4j
@SuppressWarnings("all")
public class UserTest {
    @Test
    public void test1() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean-di-lifecycle.xml");
        User user = context.getBean("user", User.class);
        log.info(user != null ? "6、对象创建完成" : "对象为null");
        context.close();
    }
}
