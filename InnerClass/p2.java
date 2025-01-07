/*
          1.all static and non static variable & method of Outer class is acess in inner class
          2.jari inner class outer class chy potate aasela tari outer class chy byte code mathe inner class disat nahi
	  3.pan inner class ha konachy tari potate aahe he Inner class Chy byte code madhe represent hote = Outer$Inner
	  4.Constructor of inner class having 2 parameter  Outer$Inner(Outer$Inner this,Outer this)
	                                                          Inner(obj1,obj)  
*/

class Outer{

	int x=10;
	static int y=20;
	class Inner{	
		
		
		void fun1(){
		
	
		System.out.println("in inner fun");	
                    System.out.println(x);
		     System.out.println(y);
		     fun();
		}
	
	
	}


      static void fun(){
	
		System.out.println("in outer fun");
	
	}


}


class Client{

	public static void main(String[] args){
	
		Outer obj=new Outer();
		obj.fun();


                    Outer.Inner obj1=obj.new Inner();
		    obj1.fun1();
                            
		 
	}


}
