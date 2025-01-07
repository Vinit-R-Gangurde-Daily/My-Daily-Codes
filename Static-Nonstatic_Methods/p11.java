

class Demo{

	
	int x=10;

	Demo(){
	
		System.out.println("In Constructor");
	}

	static{
	
		System.out.println("in static block 1");
	
	}

	{
	      System.out.println("in Instance block 1");
	
	}
	
	public static void main(String[] args){
	
	  System.out.println("in main");
		Demo obj=new Demo();
	  
	}

	  static{

                System.out.println("in static block 2");

        }


	{
              System.out.println("in Instance block 2");

        }

}
