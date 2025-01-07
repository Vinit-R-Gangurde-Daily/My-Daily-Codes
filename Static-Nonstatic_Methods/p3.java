

/*
 
      STATIC BLOCK

      until now we can say that main mathod is come first but in reality static block is block which come first in scnario which help to 
     enitializtion of static variable  
 
 
 */


class Demo{

	static {
	
		System.out.println("i am in static");
	
	}

	public static void main(String[] args){
	
	
		System.out.println("i am in main");
	
	}

}
