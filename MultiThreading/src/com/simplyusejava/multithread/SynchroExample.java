/**
 * 
 */
package com.simplyusejava.multithread;

/**
 * @author SimplyUseJava Team
 *
 */
public class SynchroExample implements Runnable {
	
	private int countA = 0;
	
	private int countB = 0;
	
	private static int staticCount = 0;
	
	public synchronized void printCntA() {
		System.out.println("Object Lock : " + Thread.holdsLock(this));
		System.out.println("Class lock : "+Thread.holdsLock(SynchroExample.class));
		System.out.println(++countA);
	}
	
	private void printcountB() {
		System.out.println("Object Lock : " + Thread.holdsLock(this));
		System.out.println("Class lock : "+Thread.holdsLock(SynchroExample.class));
		synchronized (this) {
			System.out.println("Object Lock : " + Thread.holdsLock(this));
			System.out.println("Class lock : "+Thread.holdsLock(SynchroExample.class));
			System.out.println(++countB);
		}
	}
	
	public static synchronized void printStaticCnt() {
		System.out.println("Class lock : "+Thread.holdsLock(SynchroExample.class));
		System.out.println(++staticCount);
	}
	
	public synchronized void multisyncMethod() {
		System.out.println("Object Lock : " + Thread.holdsLock(this));
		System.out.println("Class lock : "+Thread.holdsLock(SynchroExample.class));
		printCntA();
	}

	@Override
	public void run() {
//		printCntA();
//		printcountB();
//		printStaticCnt();
//		printStaticCnt();
		multisyncMethod();
	}
	
	public static void main(String[] args) {
		new Thread(new SynchroExample(),"ex Thrd").start();
	}
	

	
	
}
