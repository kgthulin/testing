package com.test.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest3 {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		var future = executorService.submit(() -> {
			System.out.println("Asynchronous Task Runnable");
		});
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		var future2 = executorService.submit(() -> {
			System.out.println("Asynchronous Task Callable");
			return "Callable Result";
		});
		try {
			System.out.println(future2.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		executorService.shutdown();
	}

}
