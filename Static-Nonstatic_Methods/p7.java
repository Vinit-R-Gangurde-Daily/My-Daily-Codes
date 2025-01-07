/*

  here in this scenario we will right 2 different class which contain diff main method in both 
  so in this case o/p will depend on which class we are passin as java class name

  o/p  java Demo = in static block 1
                   in Demo main
       
       java Clint = in static block 2
                    in static block 3
                    in client main 



*/


class Demo{

	
	static{
	
		System.out.println("in static block 1");
	
	}
	
	public static void main(String[] args){
	
         System.out.println(" in Demo main");
	
	}

}

class Clint{


	static{
	
		System.out.println("in static block 2");
	
	
	}
	
	
	public static void main(String[] args){
	
	
		System.out.println("in client main");

		//Demo obj=new Demo();
	
	}

	static{
	
		System.out.println("in static block 3");
	
	}

}
