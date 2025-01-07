/*
 
   using this program we can say that all instance variables of parent class is access in child class 
   
   in parent constructor
   In child
   20
   30
   in access
 
 */


class parent{


	int x=20;

	parent(){
	
	
		System.out.println("in parent constructor");
	
	}

	void access(){

                System.out.println("in access");

        }


}



class child extends parent{

	int y=30;

	child(){
	

		System.out.println("In child");
		System.out.println(x);
		System.out.println(y);
	
	}


}


class client{

	public static void main(String[] args){
	
              child obj=new child();
	
               obj.access();	
	
	}

}


