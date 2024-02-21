package com.hc.spring6.di.field;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangChi
 * @since 2024/2/6
 */

@Slf4j
public class BookTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-field.xml");
        Book book = context.getBean("book1", Book.class);
        log.info(book.toString());
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-field.xml");
        Book book = context.getBean("book2", Book.class);
        log.info(book.toString());
    }
}
