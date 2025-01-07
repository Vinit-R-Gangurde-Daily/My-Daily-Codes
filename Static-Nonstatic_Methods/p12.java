
/*
 
 
   in this scenario we will make the object of class demo in static block 
 
 */
class Demo{


	Demo(){
	
		System.out.println("in constructor");
	
	
	}

	static{
	
		//System.out.println("in static block");

		Demo obj=new Demo();

		System.exit(0);
	
	}
	
	
	
	public static void main(String[] args){
	
	
	
	}


}





