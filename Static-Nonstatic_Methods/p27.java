

/*
 
   using this program we can say that all the instance mehthod of parent is inharit into child class

        
       o/p 
        In parent constructor
        in child constructor
        car,gold,farm

*/


class parent{

	parent(){
	
		System.out.println("In parent constructor");
	
	}

	void parentproperty(){
	
		System.out.println("car,gold,farm");
	
	
	}


}
   

    class child extends parent{
   
              child(){
	      
	      
		      System.out.println("in child constructor");
	      
	      }
   
   
   }


      class client{
      
	      public static void main(String[] args){
	      
	      
		      child obj=new child();

	              obj.parentproperty();	      
	      
	      }
      
      
      }
