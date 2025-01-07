


class StringDemo{


	public static void main(String[] args){
	
		String str1="Vinit";
		String str2="Rajput";
    
       String str3=str1+str2;   //+ will be call the append method internaly(append is the method of string bilder)
       String str4=str1.concat(str2); //even the work of + & concte is same but both are internaly goes with differed way
	     
	       
	     System.out.println(str3);
	     System.out.println(str4);
            
	     System.out.println(System.identityHashCode(str3)); //even the output of both str3 & str4 same but internaly 
	      System.out.println(System.identityHashCode(str4));//it will goes differet ways





	
	
	}




}



