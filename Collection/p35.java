

import java.util.*;
class HashTableDemo{

	public static void main(String[] args){
	
		Dictionary BT=new Hashtable();
	
		BT.put(10,"Sachin");
		BT.put(7,"MSD");
		BT.put(18,"Virat");
		BT.put(1,"KLRahul");

		System.out.println(BT);


	//	public abstract java.util.Enumeration<K> keys(); 
        /*             
		     Enumeration itr1=BT.keys(); //here we convert hashtable to list

		     while(itr1.hasMoreElements()){     //and the apply the curser         //public abstract boolean hasMoreElements();
                                                                                             //public abstract E nextElement();
		                                                   
			     System.out.println(itr1.nextElement());
		        }
	  */         	
	       
	//	public abstract java.util.Enumeration<V> elements();
	
		                 Enumeration itr2=BT.elements();

				 while(itr2.hasMoreElement()){
				 
					 System.out.println(itr2.nextElements());
				 
				 }
	
	
	
	
	}


}
