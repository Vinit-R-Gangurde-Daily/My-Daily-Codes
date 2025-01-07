

class Parent{


       final void fun(){
       
	       System.out.println("in parent fun");
       
       }

}

class Child extends Parent{

/*	void fun(){
                                                              // error= overridden method is final	
		System.out.println("in child parent");
	}*/


}

class Client{

	public static void main(String[] args){
	
		Parent obj=new Child();
               obj.fun();
	
	
	}
}
