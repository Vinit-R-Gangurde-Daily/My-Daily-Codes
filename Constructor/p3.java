/*
  
   num of time we create the object it will call the constructor
 
 */


class ConstDemo{

	ConstDemo(){
	
		System.out.println("I am in Constructor");
	
	}

	void fun(){

		ConstDemo obj3=new ConstDemo();
	
	}
	
	
	public static void main(String[] args){
	

		ConstDemo obj1=new ConstDemo();
                ConstDemo obj2=new ConstDemo();
		
	       
		obj1.fun();

		obj2.fun();
	
	}



}
