package com.COMPLETABLEFUTURE;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Ex {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

		CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(() -> {
			return "hi";
		}).thenApply(String::toUpperCase); 

		System.out.println(supplyAsync.join());
		
	CompletableFuture.runAsync(()->{
		System.out.println("emdjdj");
	});
	
	ExecutorService executor = Executors.newFixedThreadPool(1);
	
	Future<String> future = executor.submit(() -> {
	    Thread.sleep(300);
	    return "Hello";
	});
	executor.shutdown();

	System.out.println(future.isDone());
	
	
	Future<String> future1 = executor.submit(() -> {
	    Thread.sleep(5000);
	    return "Hello";
	});
	executor.shutdown();

	future.get(2, TimeUnit.SECONDS);

	}
	
}
