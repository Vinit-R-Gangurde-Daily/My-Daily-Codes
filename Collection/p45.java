

import java.util.concurrent.*;
import java.util.*;
class BlockingQueueDemo{

	public static void main(String[] args)throws InterruptedException{
	
		BlockingQueue BQ=new ArrayBlockingQueue(3);

		BQ.put(10);
		BQ.put(20);
		BQ.put(30);

		 
		System.out.println(BQ);

		//public boolean offer(E, long, java.util.concurrent.TimeUnit) throws java.lang.InterruptedException;

		 //public E poll();
                   BQ.poll();
	
	  	  BQ.offer(40,5,TimeUnit.SECONDS);
		   System.out.println(BQ);		

		   BQ.take();
                   
		   System.out.println(BQ);

		   ArrayList al=new ArrayList();
		    System.out.println("arrayList" + al);

		    BQ.drainTo(al);

		    System.out.println(al);
	
      }


}
