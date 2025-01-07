


class Demo{

	int a=10;
      
      private int b=20;
        
       	static int c=30;

	void disp(){
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
	}

}


class MainDemo{


	public static void main(String[] args){
	
		Demo obj1=new Demo();
		Demo obj2=new Demo();

		obj1.disp();
		obj2.disp();
	
		System.out.println("---------------");
		obj1.a=100;
		obj2.c=300;

		obj1.disp();
		obj2.disp();
	
	}




}
