


import java.util.*;
class MyDemo implements Comparable{

	String str=null;

	MyDemo(String str){
	
		this.str=str;
	  
	}


	public int compareTo(Object obj){
	
             return (str.compareTo(((MyDemo)obj).str));
	
	}
	
	public String toString(){
	
		return str;
	
	}

}


class TreeSetDemo{

	public static void main(String[] args){
	
		TreeSet tr=new TreeSet();

                tr.add(new MyDemo("rahul"));	      
	
	
	}

}
