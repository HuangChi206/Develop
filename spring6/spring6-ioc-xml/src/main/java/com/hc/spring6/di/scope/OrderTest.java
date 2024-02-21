package com.hc.spring6.di.scope;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangChi
 * @since 2024/2/19
 */
@Slf4j
public class OrderTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-scope.xml");
        Order order = context.getBean("order", Order.class);
        Order order1 = context.getBean("order", Order.class);
        log.info(order.toString());
        log.info(order1.toString());
    }
}
