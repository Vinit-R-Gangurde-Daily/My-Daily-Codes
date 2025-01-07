


class Demo{
 
	static int a=10;  //static variable(class variable)

            static{        //static block
	    
		   static int b=20; //give the error           //it will give the error as = illegal start of expression
					       //becouse static variable is come in picture befor the static block (static variable having higest 
					       //perority) 
	    
	    }	

	    static void fun(){     // static method
	    
	    
		    static int c=30; //give the error
	    
	    }

	    void gun(){
	    
	    
		    static int d=40; // give the error 
	    
	    }

       	
	
	public static void main(String[] args){
	
	
	
	}



}
