

 import java.util.*;

 class Demo{
 
	 public static void main(String[] args){
	 
	 
		 ArrayList Ar=new ArrayList();


                 //1)add 
		 Ar.add(23);
		 Ar.add(23.5);
	         Ar.add(23.4f);
                 Ar.add("rahul");	       

		 System.out.println(Ar);
		 
	
		//2) public boolean isEmpty(); 
	      
		 System.out.println(Ar.isEmpty());

		 //3)public int size();
		  
		         System.out.println(Ar.size());

	         //4) public void trimToSize();
		        Ar.trimToSize();

	       // 5)public void ensureCapacity(int) is use to increase the capacity of any array list
	                   Ar.ensureCapacity(3);
                       
	       // 6)public boolean isEmpty(); 
                         System.out.println(Ar.isEmpty());

	         // 7)public boolean contains(java.lang.Object);
		           System.out.println(Ar.contains("rahul"));

	        //8) public int indexOf(java.lang.Object);
		      System.out.println(Ar.indexOf(23.4f));

		   //9)public java.lang.Object[] toArray();
		                   Object arr[]= Ar.toArray();
                              
				   for(Object ar:arr){
				   
					   System.out.println(ar);
				   }

	      

                                				
	  
	 }
 
 
 }
