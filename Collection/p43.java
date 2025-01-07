


//Dequeue

import java.util.*;
class DequeueDemo{

	public static void main(String[] args){
	
		Deque que=new ArrayDeque();
	
                 que.offer(20);
		 que.offer(10);
                 que.offer(30);
                 que.offer(40);

		 System.out.println(que);

		           //public abstract boolean offerFirst(E);
                           //public abstract boolean offerLast(E);

		                     que.offerFirst(50);
				     que.offerLast(60);
				     System.out.println(que);


				        //public abstract E removeFirst();
                                        // public abstract E removeLast();

				     que.removeFirst();
				     que.removeLast();
				     System.out.println(que);


				      //public abstract E pollFirst();
                                      //public abstract E pollLast();

				     que.pollFirst();
				     que.pollLast();
				     System.out.println(que);


				     //public abstract E getFirst();
                                       //public abstract E getLast();
                                                que.getFirst();
						que.getLast();
						System.out.println(que);

				    //public abstract E peekFirst();
                                     //public abstract E peekLast();

						que.peekFirst();
						que.peekLast();

						System.out.println(que);


					Iterator data=que.iterator();	

					while(data.hasNext()){
					
						System.out.println(data.next());
					
					}



					Iterator data2=que.descendingIterator();

					 while(data2.hasNext()){

                                                System.out.println(data2.next());

                                        }
	}

}
