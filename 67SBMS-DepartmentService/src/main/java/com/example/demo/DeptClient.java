package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@FeignClient(name = "66SBMS-EmployeeService",fallback = DeptClientFallBack.class)
public interface DeptClient {
	@Retry(name="empService")
	@RateLimiter(name = "paymentService")
	@GetMapping("/emp/get")
	public String getEmp();
}