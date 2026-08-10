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
@Component(value="employee")
public class Employee
		implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
	private String name;

	public Employee() {
		System.out.println("1.constructor called");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("2.setter injection called");

		this.name = name;
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("3. bean name aware" + name);

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destory");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("8. afterPropertiesSet()");

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("5. ApplicationContextAware");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("4. BeanFactoryAware");

	}

	@PostConstruct
	public void post() {
		System.out.println("post construct");
	}

	public void initMethod() {
		System.out.println("9. Custom Init Method");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("12. @PreDestroy");
	}

	public void customDestroy() {
		System.out.println("14. Custom Destroy Method");
	}
}
