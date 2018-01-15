package com.simplyusejava.multithread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * This class represents the behaviors of a Person- Mike. 
 * He uses his computer to read and play music.
 * He always play soothing music when he reads a book.
 * @author SimplyUseJava Team
 *
 */
public class Mike {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("*************************");
			
			ExecutorService executor = Executors.newFixedThreadPool(5); // can executes five therads simultaneously.
			
			for(int i = 1; i <= 2 ; i++) {
				/**
				 * if i == 1 ==> it creates a task to read the book
				 * i == 2, creates a task to play music
				 */
				executor.submit(new MikeComputer(i));
			}
			
			executor.shutdown(); // to shutdown all the thread after execution.
			
			boolean isCompleted;
			
			isCompleted = executor.awaitTermination(10, TimeUnit.SECONDS);
			System.out.println(isCompleted);
			
			System.out.println("*************************");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
}
