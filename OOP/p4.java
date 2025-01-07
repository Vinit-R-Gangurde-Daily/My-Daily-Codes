

class Demo{


	Demo(){
	
		
		System.out.println("in no-arr constructor");
	
	}

	Demo(int x){

	          this(); 
		System.out.println("in para-constructor");
	
	//	this(); //give the error= call to this must be first statement in constructor becouse "this" always at first line
	}
	
	
	public static void main(String[] args){
	
	
		Demo obj=new Demo(10);
	}


}
