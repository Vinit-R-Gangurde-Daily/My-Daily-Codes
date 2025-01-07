


class Demo{

    
	void m1(){
	
                   System.out.println("in m1");
 
		try{
		System.out.println(10/0);
		
		}catch(ArithmeticException obj){
		
                         System.out.println(obj.getMessage());
		}
		


         m2();

	}

	void m2(){

	System.out.println("in m2");

	}

}

class Client{

	public static void main(String[] args){
	
          Demo obj=new Demo();

	  obj.m1();
	
	
	}


}
