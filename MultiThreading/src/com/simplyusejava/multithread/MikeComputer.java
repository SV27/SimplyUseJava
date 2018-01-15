package com.simplyusejava.multithread;

/**
 * This class represents the behaviors of MikeComputer. 
 * It provides method to read book and play music.
 * 
 * @author SimplyUseJava Team
 *
 */
public class MikeComputer implements Runnable {
	
	private int readBook = 0;
	
	private int playMusic = 0;
	
	public MikeComputer(int taskStatus) {
		// TODO Auto-generated constructor stub
		if(1 == taskStatus) {
			this.readBook = taskStatus;
			System.out.println("Read Book task - created ");
		}else if(2 == taskStatus) {
			this.playMusic = taskStatus;
			System.out.println("Play Music task ** Created ");
		}
	}

	@Override
	public void run() {
		try {
			if(1 == this.readBook) {
				readBook();
			}
			if(2 == this.playMusic) {
				playMusic();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private synchronized void readBook() throws InterruptedException {
		System.out.println("Read Book task - started ");
		for(int i=1; i<=200; i++) {
			System.out.println("Reading line " + i);
			Thread.sleep(50L);
		}
		System.out.println("Read Book task - end ");
	}
	
	private synchronized void playMusic() throws InterruptedException {
		System.out.println("Play Music ** started ");
		for(int i=1; i<=100; i++) {
			System.out.println(" ********  bla bla bla bla ************ ");
			Thread.sleep(100L);
		}
		System.out.println("Play Music ** ends ");
	}
	
	

}
