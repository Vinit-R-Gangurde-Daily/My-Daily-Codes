


//Queue

import java.util.*;
class QueueDemo{

	public static void main(String[] args){
	
		Queue que=new LinkedList();


		que.offer(10);
           	que.offer(20);
		que.offer(40);
		que.offer(30);
		System.out.println(que);

		//public abstract E remove();
                        System.out.println(que.remove());
                                                               //pic first element and remove from list
                        System.out.println(que);

		
		//public abstract E poll();
                          System.out.println(que.poll());
			    System.out.println(que);

			  // public abstract E element();
                                   System.out.println(que.element());    //only pic the elements does not remove
			               System.out.println(que);
                                  
			                   
					         

			    //public abstract E peek()
			      System.out.println(que.peek());
			        System.out.println(que);

	
	
	}


}
