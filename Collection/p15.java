

//collection

import java.util.*;

class Players{

	String str=null;
	int jerNo=0;

	Players(String str,int jerNo){

		this.str=str;
		this.jerNo=jerNo;
	
	}

	public String toString(){
	
		return str +"="+ jerNo;
	
	}

}

class HashSetDemo{

	public static void main(String[] args){
	
		HashSet hs=new HashSet();

		     hs.add(new Players("rohit",45));
	              hs.add(new Players("dhoni",5));
		      hs.add(new Players("hardik",46));
	System.out.println(hs);
	}

}
