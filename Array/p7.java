


// cammund line arrgument




class Demo{                                                 //java Demo rohit mohit
                                 
	public static void main(String[] args){           //but in the case of commend line arrgument what ever data same or different we give the                                                           Indentityhashcode is differed for both cases becouse every command is strate with key word                                                           new
	
	
		String arr[]={"vinit","vinit"};

	       System.out.println(System.identityHashCode(arr[0])); // when we creat the string array and give the same data as show in program and                                                                     try to acess the identity HashCode of this data then this code is same for both 
	       System.out.println(System.identityHashCode(arr[1]));



	      // System.out.println(System.identityHashCode(args[0]));
	      // System.out.println(System.identityHashCode(args[1]));
	     
	
	       System.out.println(args[0]);
	       System.out.println(args[1]);
	
	
	}



}
