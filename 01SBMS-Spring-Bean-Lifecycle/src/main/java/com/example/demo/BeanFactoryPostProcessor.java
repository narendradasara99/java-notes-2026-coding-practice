package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
@Component
public class BeanFactoryPostProcessor implements org.springframework.beans.factory.config.BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
        System.out.println("BeanFactoryPostProcessor Executed");
        
        BeanDefinition bd = beanFactory.getBeanDefinition("employee");
        bd.getPropertyValues().add("name", "narendra");

        
        
	}

}
