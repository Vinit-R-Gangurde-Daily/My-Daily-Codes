/*
 
   =====Instance Block=========
 
   same as static block if we right more than one instance block in single class this all instance block will be marge & work as
   single instance block
 */



class Demo{



	Demo(){         //constructor
	
		int x=500;
		System.out.println("in Constructor 1");
	
	}

	{         //instance block 1
	
		//System.out.println(x);  local variable of constructor do not acess in Instance block
		System.out.println("in Instance block 1");
	
		
	
	}


	public static void main(String[] args){
	
		Demo obj=new Demo();
	
		System.out.println("In main");

	
	
	}

	{       //instance block 2
	   
	
		System.out.println("in instance block 2");
	
	}



}














