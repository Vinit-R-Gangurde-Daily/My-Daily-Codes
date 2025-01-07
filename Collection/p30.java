

import java.util.*;

class Platform implements Comparable{

	String plat=null;
	int year=0;
	Platform(String plat,int year){
	
		this.plat=plat;
		this.year=year;
	}
     
	public String toString(){
	
		return "{" + plat + ":" + year;
	
	
	}

	public int compareTo(Object obj){
	
		//return  (plat.compareTo(((Platform)obj).plat)); //compares the string

		return year -((Platform)obj).year;
	
	}


}
class TreeMapDemo{

	public static void main(String[] args){
	
		TreeMap TM=new TreeMap();

         TM.put(new Platform("Youtube",2013),"Google");
	 TM.put(new Platform("Instagram",2015),"Meta");

		System.out.println(TM);
	
	
	}

}
