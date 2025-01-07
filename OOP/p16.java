


class Demo{


	void fun(int x){
	
		System.out.println(x);
	}

	void fun(float y){
	
	
		System.out.println(y);
	}
  
	void fun(Demo obj2){   //here we pass the object as an parameter 
	
		System.out.println("in object method ");
		System.out.println(obj2);
	
	}


}

class client{

	public static void main(String[] args){
	
		Demo obj=new Demo();
		obj.fun(10);           //object will be call method which having appropriate(matching) parameter type 
		obj.fun(10.3f);
		obj.fun(obj);

		
		Demo obj1=new Demo();
		obj1.fun(obj);
               System.out.println(obj);
		
	
	
	}

}
