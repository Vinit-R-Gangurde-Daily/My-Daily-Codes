/*
 
   here we make an object of child and take an reference of parent it will posible but reverce is not possible
   it meance make an object of parent and take an reference of child

   parent obj= new child passible
   child obj=new parent give the error

 
 
 */


class parent{


	parent(){
	
	
		System.out.println("in parent constructor");
	
	}

	void fun(){
	
		System.out.println("in parent fun");
	
	}
/*	void gun(){
	
		System.out.println("in parent gun");
	
	
	}*/


}



class child extends parent{

	child(){
	
		System.out.println("child constructor");
	
	
	}

	void fun(){
	
		System.out.println("in child fun");
	
	
	}


	void gun(){
	
	
		System.out.println("in gun");
	
	}
}




class Client{

	public static void main(String[] args){
	
	        parent obj=new child();  //here we create the object of child and take an reference of parent
               obj.fun();
              // obj.gun();	give the error becouse gun is present in child only not is parent

	      // child obj1=new parent(); parent cannot be converted to child
	       
	
	
		//	child obj=new child();
	
	}


}















