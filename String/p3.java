



class StringDemo{

	public static void main(String[] args){
	
		String str1="kanha";        // hashcode of str1 & str2 is same becouse both are store on SCP and str1 data is copied
		String str2=str1;          //str2 due to this data is also same   
		String str3=new String(str2); // but in the case of str3 even the data is same but the initializtion is use new key 
					      // word due to this new object is for on heap for str3

		 System.out.println(System.identityHashCode(str1));
		  System.out.println(System.identityHashCode(str2));
		   System.out.println(System.identityHashCode(str3));
	
	
	}






}
