

/*
 
   Overriding
 */


class Parent{

	char fun(){
	
	
		System.out.println("parent fun");
	

		return 'A'; //when return type other than void we have to return somethin otherwis it will give the error
	}
}

class Child extends Parent{

	

	 int fun(){


                System.out.println("in child fun");


                return 0; //when return type other than void we have to return somethin otherwis it will give the error
        }

}


class Client{

	public static void main(String[] args){
	
	
	    Parent obj2=new Child();
	
		Child obj=new Child();


		obj.fun();
	}


}
