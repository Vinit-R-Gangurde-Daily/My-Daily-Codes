/*
        Excption in java
 
 
 */


class Demo{


	void m1(){
	
		System.out.println("in m1");
		System.out.println(10/0);

	m2();	
	}

	void m2(){
	
		System.out.println("in m2");
	}
}

class Client{

	public static void main(String[] args){
	
		System.out.println("main strate");
		Demo obj=new Demo();
		obj.m1();
	
		System.out.println("main end");
	}

}
