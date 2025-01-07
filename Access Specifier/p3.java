


class Demo{

	int x=10;
	private int y=20;


	static void fun(){
	
		System.out.println(obj.x);
	
		System.out.println(obj.y);
	
	
	}


}


class MainDemo{

	public static void main(String[] args){
	
	
		Demo obj=new Demo();

		/* System.out.println(x);      this 2 line will give the error becouse without object we do not capable to access the x & y
		  System.out.println(y);
		*/
		
	
		System.out.println(obj.x); // x do not have any access specifer so default access specifer is default which have a 
					   // scope any class or diff class is in same file 
		//System.out.println(obj.y); // error here even we create the object of class Demo it will give the error becouse 
					   // y is private & private element is only accessable in that perticular class only
	
	         obj.fun();   //here we access the method fun which contain the private variable y but it will do not gate any error becouse 
			      //when we call fun . fun is the method of same class
	
	
	}



}
