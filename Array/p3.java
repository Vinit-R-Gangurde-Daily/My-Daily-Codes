
// passing array as an parameter


class Demo{


	void fun(){
	
	
		System.out.println("i am in fun");
	}

	public static void main(String[] args){
	
           //      fun(); //it will give the arror as=non-static method fun() cannot be referenced from a static context becouse fun is non static
                         //method and we are tring to acess this from static context
    
               Demo obj=new Demo();

             obj.fun();   //for resolve this problem we have to make an object of this class	     

	
	}
}
