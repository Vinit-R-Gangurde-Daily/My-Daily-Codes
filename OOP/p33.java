/*
 
   it is a example of method hidding here both the static method is work as difff
 
   o/p
      in parent fun
      in child fun
      in parent fun 
 */



class  Parent{


      static void fun(){
	
		System.out.println("in parent fun");
	
	}


}

class Child extends Parent{


	static void fun(){
	
	
		System.out.println("in child fun");
	
	}

}


class Client{


	public static void main(String[] args){
	
		Parent obj1=new Parent();
		obj1.fun();
	
		Child obj2=new Child();
		obj2.fun();
	
		Parent obj3= new Child();
	        obj3.fun();

	}






}
