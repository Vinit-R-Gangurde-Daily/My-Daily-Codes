


class Demo{


	static{
	
		System.out.println("in static block1");
}


	public static void main(String[] args){                 // IN this scenario i will create the object of demo in clint 
								// 
	
		System.out.println("in Demo main");
	
	}


}


class Clint{

	static{
	
	
		System.out.println("in static block 2");
	
	}

	public static void main(String[] args){
	
	
	  System.out.println("in clint main");
	        
		Demo obj=new Demo();
	
	
	}

	static{
	
		System.out.println("in static block 3");
	
	
	
	}

}
