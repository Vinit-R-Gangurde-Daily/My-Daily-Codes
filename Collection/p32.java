

//Sortedmap is a interface and grand parent of treemap

import java.util.*;
class SortedMapDemo{

	public static void main(String[] args){
	
		SortedMap SM=new TreeMap();

		
		SM.put("Ind","India");	
		SM.put("Pac","Pakisthan");
		SM.put("SL","Shrilanka");
		SM.put("Als","A");
		System.out.println(SM);
		
	//public abstract java.util.SortedMap<K, V> subMap(K, K);	
		System.out.println(SM.subMap("IND","SL"));         //{Ind=India, Pac=Pakisthan}


	//public abstract java.util.SortedMap<K, V> headMap(K);
                 System.out.println(SM.headMap("SL"));       //{Als=A, Ind=India, Pac=Pakisthan}
				
	//public abstract java.util.SortedMap<K, V> tailMap(K);
                       System.out.println(SM.tailMap("Ind"));	 //{Ind=India, Pac=Pakisthan, SL=Shrilanka}

	
	//public abstract K firstKey();
                   System.out.println(SM.firstKey());   //Als

	
	
	//public abstract K lastKey();
	             System.out.println(SM.lastKey());  //SL

		     
		    // public abstract java.util.Set<K> keySet();
                              System.out.println(SM.keySet());
		     
		    //public abstract java.util.Collection<V> values();
                                    System.out.println(SM.values());
		     
		     
		     //public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();
                                  System.out.println(SM.entrySet()); //it will convert map to set
	
	
	
	}


}
