/*
 
   INNER CLASS 
   1.Normal Inner class
 
 */


class Outer{


	class Inner{
	
		void fun2(){
		
			System.out.println("in inner fun");
		
		
		}
	
	}



	void fun(){
	
		System.out.println("in outer class");
	
	}

}

class Client{

	public static void main(String[] args){
	
		Outer obj=new Outer();
                   obj.fun();
		   //obj.fun2(); error = cannot find symbol

		   Outer.Inner obj1=obj.new Inner();  // in this method we create only objent for inner class not for outer gest use object of 
                   obj1.fun2();                       // outer class jo aapan pahile create kela aahe to
           
		   
         Outer.Inner obj2=new Outer().new Inner();//in this method we create two different object for both outer class as will as for inner class
                obj2.fun2();

           

		
	
                  

    
	}

}

