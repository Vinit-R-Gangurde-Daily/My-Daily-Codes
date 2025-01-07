

//Sorted ser
//sorted set is a interface
//sorted set is a parent of Navigable Set(is also interface)
//& we can say that grandparent of tree

import java.util.*;
class SortedSetDemo{

	public static void main(String[] args){
	
        //SortedSet is interface so we can not make the objet but we can user as referance
		SortedSet ss=new TreeSet();

                  ss.add("Rahul");
	          ss.add("Ayush");
                  ss.add("Bhushan");
                  ss.add("Dhanu");
		
		System.out.println(ss);
		
		//public abstract java.util.SortedSet<E> subSet(E, E);
		
		           System.out.println(ss.subSet("Ayush","Dhanu"));
		
	       //public abstract java.util.SortedSet<E> headSet(E);
	                
			   System.out.println(ss.headSet("Bhushan"));

		 //public abstract java.util.SortedSet<E> tailSet(E);

			   System.out.println(ss.tailSet("Bhushan"));

                    //public abstract E first();
		   
			   System.out.println(ss.first());

			   //public abstract E last();
			   
			    System.out.println(ss.last());
	}




}
