
/*
 
5) compareToIgnoreCase


this method is work same as compareTo but diff is this it will ignore the case of string and compare the string

 
 
 */



class Demo{


	public static void main(String[] args){
	
		String str1="VINIT";
		String str2="vinit";
		String str3="ViNip";


		 System.out.println(str1.compareToIgnoreCase(str2));//0 Ignore the case	
	         System.out.println(str1.compareToIgnoreCase(str3));// diff between t and p is 4 so o/p is 4
	}



}
