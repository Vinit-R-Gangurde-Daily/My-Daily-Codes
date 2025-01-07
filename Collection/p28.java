



//WeekHashMap
//preserves the insertion order
import java.util.*;
class Demo{

	String name=null;
	
	Demo(String name){
	
		this.name=name;
	}

	public String toString(){
	
		return name;
	}


}
class WeekHashMapDemo{

	public static void main(String[] args){


		Demo obj1=new Demo("Rahul");
                 Demo obj2=new Demo("Pratik");
		Demo obj3=new Demo("Dhanu");
		Demo obj4=new Demo("Udhay");



		WeakHashMap WH=new WeakHashMap();

		WH.put(obj1,2012);
		WH.put(obj2,2015);
		WH.put(obj3,2017);
		WH.put(obj4,2013);
	
	System.out.println(WH);	
	

	WeakHashMap WH2=new WeakHashMap();
                     
                Demo obj5=new Demo("Rahul");
                 Demo obj6=new Demo("Pratik");
                Demo obj7=new Demo("Dhanu");
                Demo obj8=new Demo("Udhay");
                
		WH2.put(2012,obj5);
                WH2.put(2015,obj6);
                WH2.put(2017,obj7);
                WH2.put(2013,obj8);
	System.out.println(WH2);	
		
	
	}

}
