/**
 * 
 */
package com.simplyusejava.collections.intro;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * This class shows the various Java Collections framework implementations.
 * @author SimplyUseJava Team
 *
 */
public class CollectionsIntro {
	
	public static void main(String[] args) {
		
		/*
		 * "List"
		 * creating a list of String objects using List.
		 * ArrayList is an implementation of List.
		 */
		
		List<String> list = new ArrayList<>(); 
		list.add("Simply");  // adding a string element to list
		list.add("use java"); // adding another element to the list.
		list.add("Simply"); // add a duplicate element to list.
		list.add(null); // adding null object to list
		for(String s : list) {
			System.out.println("element from list : " +s);
		}
		/**
		 * you can see the from the below output that "list" allows duplicate object 
		 * and null objects to be stored in it.
		 * Output:
		 * 	element from list : Simply
		 *	element from list : use java
		 *	element from list : Simply
		 *	element from list : null
		 * 
		 */
		
		/*
		 * "Set" example.
		 * Creating a "set" of String objects.
		 * "HashSet" is one of the implementation of "Set" interface.
		 */
		
		Set<String> set = new HashSet<>();
		set.add("Simply"); // adding a string object to this "set"
		set.add("use java"); // adding another string object to this "set"
		set.add("Simply"); // adding the duplicate string object.
		set.add(null); // adding null object to this "set"
		
		for(String s : set) {
			System.out.println("Element from Set : " + s);
		}
		/**
		 * you can see from the output below that "set" only contains unique objects.
		 * Output:
		 * Element from Set : null
		 * Element from Set : Simply
		 * Element from Set : use java
		 */
		
		
		/*
		 * "Queue" example
		 * Creating a queue of integer object
		 */
		Queue<Integer> que = new LinkedList<>();
		
		que.add(1); // adding an Integer value to the queue
		que.add(2); // adding another integer value.
		que.add(1); // adding duplicate value to the queue.
		que.add(3);
		que.add(null);  // adding null value to the queue.
		
		while(!que.isEmpty()) {
			// poll() method will retrieve the first element from the queue and deletes it from queue after read.
			System.out.println("values from queue : " +que.poll()); 
		}
		/**
		 * from the output, you can observe these following about queue.
		 * 	==> it allows duplicate values
		 *  ==> it works in FIFO manner.
		 *  ==> it allows  NULL object. 
		 * Output:
		 * values from queue : 1
		 * values from queue : 2
		 * values from queue : 1
		 * values from queue : 3
		 */
		
		/*
		 * "Queue" example
		 * Creating a Deque of integer object
		 */
		Deque<Integer> deq = new LinkedList<>();
		
		deq.add(1); // adding an integer object to Deque.
		deq.add(2); // adding another element
		deq.addFirst(3); // adding this element "First" to deque
		deq.add(1);
		deq.add(1);
		deq.addLast(0); // adding this integer "last" in the deque
		deq.add(null);
		
		while(!deq.isEmpty()) {
			System.out.println("First Element in the queue : " +deq.pollFirst()); 
			System.out.println("Last Element in the queue : " + deq.pollLast()); 
		}
		
		/** 
		 * From the output, we can understand the followings:
		 * 	==> It allows duplicate values.
		 *  ==> it allows us to access both ends of the queue.
		 *  ==> It also allows NULL object.
		 *  ==> when the accessed element is not available, then it will return NULL. 
		 * Output:
		 * First Element in the queue : 3
		 * Last Element in the queue : null
		 * First Element in the queue : 1
		 * Last Element in the queue : 0
		 * First Element in the queue : 2
		 * Last Element in the queue : 1
		 * First Element in the queue : 1
		 * Last Element in the queue : null
		 */
		
		
		/*
		 * "Map" Example.
		 * "HashMap" is one of the implementation of "Map" interface.
		 * Map allows us to add "key-value" pairs.
		 * In this example, key is integer and value is also String.
		 */
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Simply"); // addding a key value pair
		map.put(2, "use"); // adding another key value pair
		map.put(2, "use Java"); // adding an element with the existing key. This will override the existing key-value pair.
		map.put(3, "Simply"); // adding another key value pair which is equal to the existing value and not equal to the key.
		map.put(null, "null key");
		map.put(4, null);
		
		System.out.println("Map  : key : " + 1 + " : value : " +map.get(1));
		System.out.println("Map  : key : " + 2 + " : value : " +map.get(2));
		System.out.println("Map  : key : " + 3 + " : value : " +map.get(3));
		System.out.println("Map  : key : " + null + " : value : " +map.get(null));
		System.out.println("Map  : key : " + 4 + " : value : " +map.get(4));
		
		
		/**
		 * From the output, we can understand the followings:
		 *  ==> Map allows us to store values with keys.
		 *  ==> It allows us to add duplicate value with same keys.
		 *  	==> But the recently added key-value will override the existing key-value pair.
		 *  ==> If we add duplicate value with different key, then it will not override any value.
		 *  ==> from the above two facts, we understood that Map should have unique key.
		 *  ==> It allows null object as key.
		 *  ==> it allows null object as value. 
		 * output:
		 * Map  : key : 1 : value : Simply
		 * Map  : key : 2 : value : use Java
		 * Map  : key : 3 : value : Simply
		 * Map  : key : null : value : null key
		 * Map  : key : 4 : value : null
		 */
	}

}
