
/*
 
   use of this refference

   1)we know that instace variable einitialize in constructor but for this it will take an help of "This Refference"

   2)using "this reference " we can directly jump on another constructor
 
 */ 




class Demo{


   int x=10; 

       Demo(){
       
                    
	       System.out.println("In no arrgument constructor");
       
       }

       Demo(int x){

	       this();  //// here using this we can jump on another constuctor directly

	       System.out.println("In para constructor");
       
       }
	
	
	public static void main(String[] args){
	

                Demo obj=new Demo(10);

	
	
	}


}
