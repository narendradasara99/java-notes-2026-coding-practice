package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.PreDestroy;

@Component
public class BeanLifeCycle
		implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

	public BeanLifeCycle() {
		System.out.println("1. Constructor: Bean Instantiated");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("2. BeanNameAware: Bean Name = " + name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("3. BeanFactoryAware: BeanFactory injected");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("4. ApplicationContextAware: Context injected");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("6. @PostConstruct method called");
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println("7. InitializingBean afterPropertiesSet()");
	}

	public void customInit() {
		System.out.println("8. Custom init method");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("10. @PreDestroy method called");
	}

	@Override
	public void destroy() {
		System.out.println("11. DisposableBean destroy()");
	}

	public void customDestroy() {
		System.out.println("12. Custom destroy method");
	}
}
