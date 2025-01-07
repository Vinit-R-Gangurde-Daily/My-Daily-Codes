/*
 collection
 1)List
 -allow the dublicate data
 -preserves insetion orderv

   a)Arraylist 
   -size is fixed
   -data is store sequntialy

 */

import java.util.*;
class Demo extends ArrayList{

	public static void main(String[] args){
	
	                   ArrayList al=new ArrayList();

			   al.add(10);
		           al.add(20.5f);
		           al.add("shashi");
			   al.add(10);	
			System.out.println(al);  


			// 1)public int size();
		        System.out.println(al.size());

			//2)hashCode();
			  System.out.println(al.hashCode());

			//3) public boolean contains(java.lang.Object);
			 System.out.println(al.contains(10));

		        //4) public int indexOf(java.lang.Object);        
			 System.out.println(al.indexOf(20.5f));
		 
			//5)public int lastIndexOf(java.lang.Object);
			   System.out.println(al.lastIndexOf(10));   

			 //6) public E get(int);
                                System.out.println(al.get(2));
			   
			 //7)public E set(int, E);
			       System.out.println(al.set(2,"rahul"));
			       System.out.println(al);
	
	                  //8)public void add(int, E);
			      al.add(2,"Shashi");
			      System.out.println(al);

			   //9)public boolean remove(java.lang.Object);
			             System.out.println(al.remove("rahul"));
				     System.out.println(al);
			     
				     //10)public void clear();
				         

				   //11)public boolean addAll(java.util.Collection<? extends E>);
				          ArrayList al2=new ArrayList();
					     al2.add(23.3f);
					     al2.add("sakshi");
					     al2.add(45);
					     al.addAll(al2);
					     System.out.println(al);
  
				     //12)public boolean addAll(int, java.util.Collection<? extends E>);
                                              
                                             al.addAll(2,al2);
                                             System.out.println(al);

  
				     //13)protected void removeRange(int, int);
	                                    //   al.removeRange(2,3);
					      // System.out.println(al);
					      //

				 //14)  public java.lang.Object[] toArray();

				     Object arr[]=al.toArry();
                                       

				     for(object data:arr){
				     
					     System.out.print(data + " ");
				     }

				     System.out.println();

	}         



}
