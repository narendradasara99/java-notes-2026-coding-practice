package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderServiceTest {
	@Mock
	private OrderDetailsRepo repo;
	@InjectMocks
	private OrderService service;
	
	@Test
	void testGetOrder() {
		
		OrderDetails o = new OrderDetails();
		o.setId(90l);
		o.setCustomerName("Yashna");
		o.setStatus("active");
		
		when(repo.findById(90l)).thenReturn(Optional.of(o));
		
		OrderDetails order = service.getOrder(90l);
		assertEquals(90l, order.getId());
		assertEquals("Yashna", order.getCustomerName());
		assertEquals("active", order.getStatus());
		
		verify(repo).findById(90l);

		
		
	}
	
	
	@Test
	void testGetOrderNotFound() {
		
		
		when(repo.findById(20l)).thenReturn(Optional.empty());
		
		
		RuntimeException e=assertThrows(RuntimeException.class,()->service.getOrder(20l));
		
		assertEquals("order not found", e.getMessage());
		
	}
	
	

}
