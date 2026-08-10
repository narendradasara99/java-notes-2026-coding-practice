package com.example.demo;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
@Component
public class MybeanPostProcessor implements BeanPostProcessor {
	
	public MybeanPostProcessor() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public @Nullable Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub

        System.out.println("6. BeanPostProcessor Before Initialization : "
                + beanName);
		return bean;
	}
	
	@Override
	public @Nullable Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		 System.out.println("10. BeanPostProcessor After Initialization : "
	                + beanName);
		return bean;
	}

}
