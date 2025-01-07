/*
 
    Inheritance Imp topic
 
 
    even we create the object of BCCI it will print the ICC constructor first 
    becouse when we create the object first constructor will be call and first line of constructor is super(call the constructor of parent class)

      in ICC Constructor
      IN BCCI Constrictor

*/

class ICC{


	ICC(){
	
		System.out.println("in ICC Constructor");
	}


}

class BCCI extends ICC{

	BCCI(){
	
		System.out.println("IN BCCI Constrictor");
	
	
	}


}

class client{

	public static void main(String[] args){
	
		BCCI obj=new BCCI();
	
	
	}


}










