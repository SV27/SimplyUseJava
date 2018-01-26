package com.simplyusejava.multithread;

/**
 * This class is created to explain how synchronization in java works.
 * The detailed article can be found in www.simplyusejava.com
 * @author SimplyUseJava Team
 *
 */
public class Synchronization implements Runnable {
   private int countA = 0;
   private int countB = 0;

   public static int staticCnt = 0;
   
   
   @Override
   public void run() {
   	// TODO Auto-generated method stub
	   incrementCountA();
	   incrementCountB();
	   incrementStaticCnt();
	   incrementStaticCnt();
   }

   public synchronized void incrementCountA(){
	   System.out.println(Thread.currentThread().getName() + " locks incrementCountA");
	   
	   System.out.println(" * Class Lock : " +Thread.holdsLock(Synchronization.class) + " * ");
	   System.out.println(" * Object Lock : " +Thread.holdsLock(this) + " * ");
	   
   			System.out.println(++this.countA);
   	   System.out.println(Thread.currentThread().getName() + " releases lock on incrementCountA");
   }

   public void incrementCountB(){
	   System.out.println("------- Inside incrementCountB Method ----- ");
	   System.out.println(" * Class Lock : " +Thread.holdsLock(Synchronization.class));
	   System.out.println(" * Object Lock : " +Thread.holdsLock(this));
   		synchronized(this){
   		 System.out.println(" ++++++++ Inside synchronized BLOCK Method ++++++ ");
   		   System.out.println(" * Class Lock : " +Thread.holdsLock(Synchronization.class));
   		   System.out.println(" * Object Lock : " +Thread.holdsLock(this));
   			System.out.println(Thread.currentThread().getName() + " locks incrementCountB synchronized block ");
   				System.out.println(++countB);
   			System.out.println(Thread.currentThread().getName() + " releases lock on incrementCountB synchronized block ");
   		 System.out.println(" ++++++++++++++++ ++++++++ ++++++++ ++++++++ ++++++ ");
   		}
   		System.out.println("------------------------------------------------ ");
   }

   public static synchronized void incrementStaticCnt(){
	   System.out.println(" *********** Inside incrementStaticCnt Method *********** ");
	   System.out.println(Thread.currentThread().getName() + " locks incrementStaticCnt -- Class Object lock");
	   System.out.println(" * Class Lock : " +Thread.holdsLock(Synchronization.class));
	   	System.out.println(++staticCnt);
	   System.out.println(Thread.currentThread().getName() + " releases lock on incrementStaticCnt");
	   System.out.println("*******************************************");
   }

   public synchronized void printCnt(){
	   System.out.println(Thread.currentThread().getName() + " locks  printCnt");
	   System.out.println(" * Class Lock : " +Thread.holdsLock(Synchronization.class));
	   System.out.println(" * Object Lock : " +Thread.holdsLock(this));
        incrementCountA(); // calling synchronized method inside a synchronized method.  
       System.out.println(Thread.currentThread().getName() + " releases lock on  printCnt");
   }
   
   public static void main(String[] args) {
	  new Thread(new Synchronization(), "First Thread : ").start();
   }

}
