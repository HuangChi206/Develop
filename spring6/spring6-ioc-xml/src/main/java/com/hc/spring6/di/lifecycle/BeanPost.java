package com.hc.spring6.di.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author HuangChi
 * @since 2024/2/19
 */

@Slf4j
public class BeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("3、bean后置处理器，初始化之前");
        log.info(beanName + "::" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("5、bean后置处理器，初始化之后");
        log.info(beanName + "::" + bean);
        return bean;
    }
}
