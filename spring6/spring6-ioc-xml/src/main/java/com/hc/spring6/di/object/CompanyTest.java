package com.hc.spring6.di.object;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangChi
 * @since 2024/2/6
 */

@Slf4j
public class CompanyTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-object.xml");
        Emp emp = context.getBean("emp", Emp.class);
        log.info(emp.toString());
        Dept dept = context.getBean("dept", Dept.class);
        log.info(dept.toString());
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-object.xml");
        Emp emp = context.getBean("emp1", Emp.class);
        log.info(emp.toString());
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-array.xml");
        Emp emp = context.getBean("emp", Emp.class);
        log.info(emp.toString());
        Dept dept = context.getBean("dept", Dept.class);
        log.info(dept.toString());
    }

    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-list.xml");
        Dept dept = context.getBean("dept", Dept.class);
        log.info(dept.toString());
    }
}
