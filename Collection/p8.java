
/*
 
   collection1)
   1)iterator
 */


import java.util.*;
class CursorDemo{

	public static void main(String[] args){
	
		ArrayList Ar=new ArrayList();

		Ar.add("Pratik");
		Ar.add(23);
		Ar.add(12.4f);
		Ar.add(34.4);

		//Iterator applicable on all type of collection
	
		Iterator Itr=Ar.iterator();
	                
		      while(Itr.hasNext()){
			
			      if("Pratik".equals(Itr.next())){
			      
				      Itr.remove();
			      
			      }
                             
			      
			}
		      System.out.println(Ar);

		      //ListIterator   applicable on list only
		       
                               ListIterator  Litr=Ar.listIterator();
                               
			      

						 while(Litr.hasNext()){
						 
							 System.out.println(Litr.next());
						}


		

                          

			       //  public abstract boolean hasNext();
                                     System.out.println(Litr.hasNext());

				    //public abstract E next();
                                         System.out.println(Litr.next());
                                             

			 	    //public abstract boolean hasPrevious();
				         System.out.println(Litr.hasPrevious());
  
					 //public abstract E previous();
					   System.out.println(Litr.previous());
  
					   //public abstract int nextIndex();
					         System.out.println(Litr.nextIndex());
  
						 //public abstract int previousIndex();
						           
  //public abstract void remove();
  //public abstract void set(E);
  //public abstract void add(E);


						  
	}  



} 
