/*
 
   4)compareTo
    
   it will comapre each and every digit or character of string if the string is same it will give o.p as 0 other wise give the diff between th
   askii value of both 
 
 
 */


class Demo{


	public static void main(String[] args){
	
		String str1="vinit";
		String str2="vinit";
		String str3="Vinit";
                String str4="Gangured";


		System.out.println(str1.compareTo(str2));//0 becouse the str1 & str2 is same
	         System.out.println(str1.compareTo(str3));// in str1 V is capital and in str3 v is small so it will return the diff between the 
							  // ascii value of V & v

		                                         // ascii value of V is 86 and v is 118 so out put is 32
               System.out.println(str1.compareTo(str4));//47	
	}

}

