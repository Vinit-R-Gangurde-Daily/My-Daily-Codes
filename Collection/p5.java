

/*
 
   CURSOR
        cursor is use as an traversar in any list

     1)Iterator 
     -it will work on all type of collection

         
 
 
 */

import java.util.*;
class Demo{

	public static void main(String[] args){
	
		ArrayList ar=new ArrayList();
	
		ar.add("Rohit");
		ar.add("kandekar");
		ar.add("pratik");

	             Iterator itr = ar.iterator();

		     //System.out.println(itr.hasNext());   
	
		     //System.out.println(itr.next());
	
		     while(itr.hasNext()){
		     
			     if("kandekar".equals(itr.next())){
			    // System.out.println(itr.next());
			      itr.remove(); 
			     }
		     
		     }System.out.println(itr);
	
	}



}
