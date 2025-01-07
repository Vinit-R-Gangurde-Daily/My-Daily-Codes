/*
 
 
   Access Specifier
 
 */


class Parent{


      public void fun(){
	
		System.out.println("in parent fun");
	}

}

class Child extends Parent{

        void fun(){ //error= attempting to assign weaker access privileges; was public 
		    //becouse access spicefre in child alway grater than parent
 	
	
		System.out.println("in child fun");
	}


}


class Client{


	public static void main(String[] args){


		Parent obj=new Child();
		obj.fun();
		
	}


}
