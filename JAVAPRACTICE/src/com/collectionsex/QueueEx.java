package com.collectionsex;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class QueueEx {
	
	public static void main(String[] args) {
	 
		PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());

		PriorityQueue<Employee> pq = new PriorityQueue<>(Comparator.comparing(Employee::getSal).reversed());
		
		
		pq.offer(new Employee(1, "naren", 2000d));
	
		pq.offer(new Employee(1, "ram", 200d));
		pq.offer(new Employee(1, "naren", 89d));
		pq.offer(new Employee(1, "naren", 2000d));

		System.out.println(pq.poll());
	}

}
