/*
 
   same as constructor when we create the static block in parent class and child class it will exicute parent static block first
   it will be happen becouse we are using the static variable of parent in child and all static variable is initialize in static block

o/p
  in parent static block
  in child static block 
 */

class parent{

	static{
	
		System.out.println("in parent static block");
	
	}

}


class child extends parent{

	static{
	
		System.out.println("in child static block");
	
	}

}

class client{

     public static void main(String[] args){
     
	     child obj=new child();
     
     }

}
