

/*
  6)equals
 this method is use to compare to string if string is equal then retuen true other wise false
 
 
 *
 */

class Demo{


	public static void main(String[] args){
	
		String str1="Vinit";
                String str2="Vinit";
		 String str3="VInit";


		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals(str3));// false becoue it will do not ignore the case of character
	
	}

}
