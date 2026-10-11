package com.COMPLETABLEFUTURE;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor {

	public static void main(String[] args) throws Exception {

		ExecutorService e = Executors.newFixedThreadPool(2);
		Future<Integer> s = e.submit(() -> {
			System.out.println("submit+-*9");
			Thread.sleep(5000);

			return 20;
		});
		Integer integer = s.get();
		System.out.println(integer);

		e.shutdown();

		CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(() -> {
			return "hello";
		});

		CompletableFuture.runAsync(() -> {
			System.out.println("narendra");
		});

		CompletableFuture<String> thenApply = supplyAsync.thenApply(n -> n + "  narendra");

		thenApply.thenAccept(c -> System.out.println(c));

	CompletableFuture<Integer> s2 = CompletableFuture.supplyAsync(() -> {

			return 20;

		});
		
		 CompletableFuture<Integer> thenCompose = s2.thenCompose(n->CompletableFuture.supplyAsync(()-> 30+n));

		 thenCompose.thenAccept(p->System.out.println(p));
		 
		 
		 
		 
		 CompletableFuture<Integer> f1 =
			        CompletableFuture.supplyAsync(() -> {
			        
			        throw new ArithmeticException();
			        
			        });

			CompletableFuture<Integer> f2 =
			        CompletableFuture.supplyAsync(() -> 200);
		 
			f1.thenCombine(f2, (a,b)->a*b).thenAccept(f->System.out.println(f));
			
			
			f1.exceptionally(u->{
				System.out.println(u.getMessage());
				return 89;
			});
	}

}
