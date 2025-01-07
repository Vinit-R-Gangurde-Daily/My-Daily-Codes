//uset define object in hashmap

import java.util.*;

class AddDemo{

	
	String Name=null;
	
	AddDemo(String Name){
	
		this.Name=Name;

	
	
	}

	public String toString(){
	
		return Name;
	
	}



}

class IdentityHashMapDemo{

	public static void main(String[] args){
	

		/*
		IdentityHashMap IH=new IdentityHashMap();
	

		 IH.put("Java",".java");
                  IH.put("Phython",".py");
                   IH.put("Dart",".dart");
                    IH.put("Java",".java");
		System.out.println(IH);
    */





		IdentityHashMap IH1=new IdentityHashMap();
	
		IH1.put(new AddDemo("Rahul"),3033);
		IH1.put(new AddDemo("Pratik"),2022);
		IH1.put(new AddDemo("Uday"),2012);
	
		System.out.println(IH1);
	}


}
