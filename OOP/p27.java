


class Parent{

	
	Object fun(){
	
		System.out.println("in parent fun");
	
		return new Object();
	
	}

}


class Child extends Parent{


	String fun(){
	
		System.out.println("in child fun");
	
		return "vinit";
	}

}

class Client{

	public static void main(String[] args){
	
		Parent obj=new Child();
		obj.fun();
	
	}

}
