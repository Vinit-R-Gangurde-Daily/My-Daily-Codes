
//methods of map


import java.util.*;
class MapMethodDemo{

	public static void main(String[] args){
	
		HashMap Hm=new HashMap();


         		Hm.put("Java",".java");
                        Hm.put("Phython",".py");
                        Hm.put("Dart",".dart");
			
                        
         
			System.out.println(Hm);

			//public abstract V get(java.lang.Object);
			System.out.println(Hm.get("Phython"));


			//public abstract java.util.Set<K> keySet();
			System.out.println(Hm.keySet());

                         
			 //public abstract java.util.Collection<V> values();

			System.out.println(Hm.values());

			// public abstract V put(K, V);
			 System.out.println(Hm.put("Dart",".dart"));
	
	}


}
