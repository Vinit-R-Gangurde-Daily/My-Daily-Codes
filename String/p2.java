


class StringDemo{

	public static void main(String[] args){
	
	
		String str1="kanha"; // hashCode of both str1 & str2 will be same becouse when we initialize the string like this 
		String str2="kanha"; // string will be save on SCP and it will do not make diff object for same data

		String str3=new String("kanha");  //hashCode of both str3 & str4 is Differet even the data of both are same 
		String str4=new String("kanha"); //it will be happen becouse of new keyword when new keyword is use new object will 
						 //be form
              
	      	String str5=new String("rahul");// in the case of str5 &  str6 hashCode will be diff becouse str5 save on heap and
		String str6="rahul";             //str6 is on SCP

		
		 System.out.println(System.identityHashCode(str1));
		  System.out.println(System.identityHashCode(str2));
		
		System.out.println(System.identityHashCode(str3));  
		 System.out.println(System.identityHashCode(str4));

		  System.out.println(System.identityHashCode(str5));
		   System.out.println(System.identityHashCode(str6));
	
	}







}
