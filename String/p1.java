



class Demo{

	public static void main(String[] args){
	
	

		String str1="Core2Web";  //when we Initialize the string like this then this string is store on scp
					 //(string constent pull) as a name constent dublication is not allode here
					 //it meanse it will do not make diff object for same string

		String str2=new String("Core2Web"); // when we Initialize the string like this as we know new key is 
						    // use due to this for every string have diff object even the 
						    // string is same 
				
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));


		String str3="Core2Web";
		String str4=new String("Core2Web");

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
	
	
	}


}
