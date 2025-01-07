

class Demo{

	int x=10;
	Demo(){  //Demo(Demo this) // so if this pararmeter is realy present then here this is also contain the same address
	
		System.out.println("in constructor");

		System.out.println(this);

		System.out.println(this.x);
	
	}
	
	public static void main(String[] args){
	

		Demo obj=new Demo();  //Demo(obj) // here obj contain the address of object according to our information 
				    
                   System.out.println(obj);
	
	}

}                   /* o/p   in constructor
                             Demo@251a69d7
                             Demo@251a69d7 */
