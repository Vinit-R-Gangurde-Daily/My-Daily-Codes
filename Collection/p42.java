

//Priority Queue

import java.util.*;
class PriorityQueueDemo{

	public static void main(String[] args){
	

		PriorityQueue PQ=new PriorityQueue();

		PQ.offer(20);
               PQ.offer(10);
		PQ.offer(30);
		PQ.offer(50);
		PQ.offer(40);
		PQ.offer(60);
	
		System.out.println(PQ);
                   

		PriorityQueue pq1=new PriorityQueue();
                
		pq1.offer("Bhushan");
               pq1.offer("Anu");
                pq1.offer("Dhanu");
                pq1.offer("Vinit");
                pq1.offer("Tanu");
                pq1.offer("Uday");
	System.out.println(pq1);
	
	
	
	}

}
