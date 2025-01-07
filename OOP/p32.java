


class Parent{


     static void fun(){
	
		System.out.println("in parent fun");
	
	}


}

class Child extends Parent{

	void fun(){  //error= overridden method is static we can not overide the static method
	
	
		System.out.println("in child fun");
	
	}

}


class Client{


	public static void main(String[] args){
	
	
	
		Child obj=new Child();
		obj.fun();
	
	}


}
