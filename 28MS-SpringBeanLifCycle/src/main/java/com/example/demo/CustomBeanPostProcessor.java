package com.example.demo;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
	
	   @Override
	    public Object postProcessBeforeInitialization(Object bean, String beanName) {
	        if(beanName.equals("beanLifeCycle")) {
	            System.out.println("5. BeanPostProcessor BEFORE initialization");
	        }
	        return bean;
	    }

	    @Override
	    public Object postProcessAfterInitialization(Object bean, String beanName) {
	        if(beanName.equals("beanLifeCycle")) {
	            System.out.println("9. BeanPostProcessor AFTER initialization");
	        }
	        return bean;
	    }
}
