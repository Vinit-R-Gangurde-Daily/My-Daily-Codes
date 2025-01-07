

import java.util.*;
class App{

	String Name=null;
	int year=0;

	App(String Name,int year){
	
		this.Name=Name;
		this.year=year;
	
	}

	public String toString(){
	
		return "{" + Name + ":" + year + "}";
	
	}

}

class SortByName implements Comparator{

	public int compare(Object obj1,Object obj2){
	
		return ((App)obj1).Name.compareTo(((App)obj2).Name);
	
	}


}


class TreeSetDemo{

	public static void main(String[] args){
	
	
		TreeMap TS=new TreeMap(new SortByName());


		TS.put(new App("Youtube",2003),"Google");
		TS.put(new App("Instagram",2011),"Meta");

			System.out.println(TS);
	
	}


}
