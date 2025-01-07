

import java.util.*;
class Movies implements Comparable{

	String MovName=null;
	float TotalColl=0;

	
	Movies(String MovName,float TotalColl){
	
		this.MovName=MovName;
	        this.TotalColl=TotalColl;
	
	}

	public int compareTo(Object obj){

		return (MovName.compareTo(((Movies)obj).MovName));
	
	}
	
	public String toString(){
	
		return "{"+ MovName + "=" + TotalColl +"}";
	
	}


}


class TreeSetDemo{

	public static void main(String[] args){
	
		TreeSet Ts= new TreeSet();

		Ts.add(new Movies("OppenHamer",50000f));
		Ts.add(new Movies("Gadder",400000f));
	        Ts.add(new Movies("Barbi",30000f));
                Ts.add(new Movies("OMG2",500000f));

		System.out.println(Ts);
	
	}

}
