/*

class Outer{

	int x=100;
	static int y=200;
       
	class Inner{
	
		int a=600;
                static int b=500;

	      
	
	
	}



}

class Client{


	public static void main(String[] args){
	
                 	
	
		Outer obj=new Outer();

		Outer.Inner obj1=obj.new Inner();
	          
	
	//	System.out.println(Outer.y);
              System.out.println(Outer.Inner.b);

	}

}

*/



class Outer{


       int x=10;
       static int y=20;

	class Inner{
	
                   int a=30;
		  final static int b=50; // error = Illegal static declaration in inner class Outer.Inner(befor version 8 in java it will allowed to 
				    // write a static variable or method in java but after 8 it will allowed)
	          
	 }




}

class Client{

	public static void main(String[] args){
	
		Outer obj=new Outer();

		System.out.println(Outer.y);
                System.out.println(obj.x);	

		
	          System.out.println(obj.new Inner().b);
	         System.out.println(Outer.Inner.b);	  
	}


}




























