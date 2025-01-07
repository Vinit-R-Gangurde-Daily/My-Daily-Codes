

class parent{


      static int x=20;
	static{
	
	
		System.out.println("in static block of parent");
	
	}

	static void access(){
	
	             System.out.println(x);
		System.out.println("in access method of parent");
	
	}

}

class child extends parent{



	static int y=50;
	static{
	
	        // super.access(); 'super' is non static method so it will give the error in static block
		System.out.println("in static block of child");
		System.out.println(x);
	        System.out.println(y);
		
	}

	static void access(){


                 	
                System.out.println("in access method of child");

        }



}


class client{

	public static void main(String[] args){
	
	
		child obj=new child();
	
                   parent.access(); //here we access static method access using the name of class	
	           child.access();
	}




}
