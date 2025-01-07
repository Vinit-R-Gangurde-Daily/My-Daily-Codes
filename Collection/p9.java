

/*

   collecton
  2) ListIterator
  -work only on list
  -will will tavel in both directio
 
 */

import java.util.*;
class ListIteratorDemo{

	public static void main(String[] args){
	
		LinkedList br=new LinkedList();

                      br.add("Rohit");
		      br.add(23);
		      br.add(23.4f);
		      br.add(33);
            
		    //  System.out.println(br);
		  
		                ListIterator Itr=br.listIterator();
		      while(Itr.hasNext()){
		      
			      System.out.println(Itr.next());
		      
		      
		      }

		         System.out.println(Itr.nextIndex());
                            
		         System.out.println(Itr.previousIndex());
                            
			 while(Itr.hasPrevious()){
			    
				    System.out.println(Itr.previous());
			    
			    }
                            

		
	
	
	}


}
