

/*
      Same as constuctor all method of java also have hidden this Reference

      o/p    
             in fun
             10
             10
             Demo@251a69d7
             Demo@251a69d7
 
   
 */


class Demo{
       
	int x=10;  //instance variable

	void fun(){  // internaly  fun(Demo this)
	
		System.out.println("in fun");
	
		System.out.println(this.x); //both lines
		System.out.println(x);      //give the same output
	

		System.out.println(this);      // here we print the address of object same as in main 
	}
	
	
	public static void main(String[] args){
	
		Demo obj=new Demo();

		obj.fun();  // internaly  fun(obj)

		System.out.println(obj);
	
	}


}
