package com.hc.spring6.di.object;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangChi
 * @since 2024/2/18
 */

@Slf4j
public class SchoolTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-map.xml");
        Student student = context.getBean("student", Student.class);
        log.info(student.toString());
    }
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-ref.xml");
        Student student = context.getBean("student", Student.class);
        log.info(student.toString());
    }
    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-ref.xml");
        Student student = context.getBean("student1", Student.class);
        log.info(student.toString());
    }
}
