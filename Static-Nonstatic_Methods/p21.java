
/*
     if we use this refferens in both constructor it will give the arrer as 
      error=recursive constructor invocation
 
 */


class Demo{


	Demo(){
	            this(10);
		System.out.println("in no-arrgu consti");
	
	}


	Demo(int x){
	
		this();
		System.out.println("in para-Constructor");
	}
	
	
	public static void main(String[] args){
	
		Demo obj1=new Demo();
	
	}

}
