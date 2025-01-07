


//map
//

//1)hashMap


import java.util.*;
class HashMapDemo{


	public static void main(String[] args){
	

		HashMap HM=new HashMap();

		//public V put(K, V); for insert value in map we use
		
		HM.put("Kanha","Infosys");
		HM.put("Sahish","Barclays");
		HM.put("Basdhe","Carpro");
		HM.put("Rahul","BMC");
		
		System.out.println(HM);

		System.out.println(HM.containsKey("Kanha"));

		HashMap HM1=new HashMap();
	//if we put the dublicate value for key it will replace first value(take upgraded value)	
	//but it allow the dublicate value for value 
		HM1.put(4,"Infosys");
		HM1.put(2,"Barclays");
		HM1.put(1,"Carpro");
		HM1.put(3,"BMC");
		HM1.put(4,"Googel");
		HM1.put(5,"BMC");
		
             	System.out.println(HM1);	
		
	
	
	}

}
