

//iterator on map
//first we have to convert the map into set using

import java.util.*;
class IteratorOnMapDemo{

	public static void main(String[] args){
	

	SortedMap SM1=new TreeMap();

                SM1.put("Ind","India");
                SM1.put("Pac","Pakisthan");
                SM1.put("SL","Shrilanka");
                SM1.put("Als","A");
                System.out.println(SM1);

		//public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();
		                 Set data=SM1.entrySet();
	
				 Iterator LS=data.iterator();

			 while(LS.hasNext()){
			 
				 System.out.println(LS.next());
			 
			 }	 
	}


}
