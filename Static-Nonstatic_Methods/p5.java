/*
   
   we know that the static block is a block which come first in whole program after that main come in picture 
   but In this Sconario we will wright the two differet static block in such a condition both diff static block in program is internaly work as        single static block and it will exicute according to their sequence

   o/p  
             Static block 1
	     Static block 2
             main method
	     10
 
 
 */

class Demo{

	int x=10;
	static int y=20;

	static{
	
		System.out.println("Static block 1");
	
	}
	
	
	
	public static void main(String[] args){
	
		System.out.println("main method ");

		Demo obj=new Demo();
               System.out.println(obj.x);
	
	}

	static{
	
		System.out.println("Static block 2");
	
	
	}

}
