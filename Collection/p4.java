/*
 
   b)linkList
   -size if not fixed
   -dyamic memory allocation
   -data is not store se
 
   
 */

import java.util.*;
class LinkedListDemo{

	public static void main(String[] args){
	
		LinkedList ll=new LinkedList();

		ll.add(20);
		ll.add(30.4);
		ll.add(45.5f);
		ll.add("vinit");

		System.out.println(ll);

		 //1)void linkLast(E);
		       //  ll.linkLast(45);
			 //System.out.println(ll);        errror
         
	

		 //2)public E getFirst();
		        System.out.println(ll.getFirst());

	      //public E getLast();
                     System.out.println(ll.getLast());

		//public E removeFirst();
                         System.out.println(ll.removeFirst());
			             System.out.println(ll);
	     
	         //public E removeLast();
		        System.out.println(ll.removeLast());
			 System.out.println(ll);
  
		//public void addFirst(E);
		                    ll.addFirst(20);
                                     System.out.println(ll);
  
		//public void addLast(E);
		                     ll.addLast("vinit");
                                     System.out.println(ll);
  
		//public boolean contains(java.lang.Object);
		 System.out.println(ll.contains(20));
  
		//public int size();
		   System.out.println(ll.size());
  
		//public boolean add(E);
		         System.out.println(ll.add);
  
  
		//public boolean remove(java.lang.Object);
		      System.out.println()
  
		//public boolean addAll(java.util.Collection<? extends E>);
  
		//public boolean addAll(int, java.util.Collection<? extends E>);
  
		//public void clear();
  
		//public E get(int);
  
		//public E set(int, E);
  
		//public void add(int, E);
  
		//public E remove(int);
  
		//java.util.LinkedList$Node<E> node(int);
 
	       //	public int indexOf(java.lang.Object);
  
		//public int lastIndexOf(java.lang.Object);
  
		//public E peek();
  //public E element();
 // public E poll();
  //public E remove();
  ///public boolean offer(E);
 // public boolean offerFirst(E);
 // public boolean offerLast(E);
  //public E peekFirst();
 // public E peekLast();
  //public E pollFirst();
  ///public E pollLast();
  //public void push(E);
  //public E pop();

	
	}


}
