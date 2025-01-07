
/*
 
   when ever Garbage collector will call 
   it will notify the method known as finalize
 
 */


class Demo{

	String name=null;

	Demo(String name){
	
	
		this.name=name;
	
	}

	public String toString(){
	
		return name;
	
	
	}

	public void finalize(){ //when ever any garbage collector will revome any object it will notify the finalize
	
		System.out.println("notify");
	}

}

class GCDemo{

	public static void main(String[] args){
	
		Demo obj1=new Demo("Rahul");
		Demo obj2=new Demo("Pratik");
		Demo obj3=new Demo("Uday");


		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

	




		obj1=null;
		obj2=null;

		System.gc(); //use for call the grabage the collector
			

		System.out.println("in main");

	
	}



}

