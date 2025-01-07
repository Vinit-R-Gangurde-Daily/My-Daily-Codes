

/*
         Method local Inner class
 */


class Outer{


             void m1(){
	
		     System.out.println("in m1");
		 class Inner{
			
		             

			void m2(){
		

			      System.out.println("in m2");	
			
			}
	      

	 	 }
	
		 Inner obj=new Inner();
	          obj.m2();
	
	}

}


class Client{

	public static void main(String[] args){
	
		Outer obj=new Outer(); 
		obj.m1();
	
	}



}
