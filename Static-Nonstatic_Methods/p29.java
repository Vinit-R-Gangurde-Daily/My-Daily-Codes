/*
 
   when we use 'super' it will find particular method or variable in parent class
   & when we use 'this' it will find in same class
 
 */ 

class parent{


	int x=10;

	parent(){	
	
	
		System.out.println("in parent constructor");
	}


	void process


}

class child extends parent{

	int x=20;

	child(){

	
		System.out.println("in child constructor");
		System.out.println(super.x); // when we use "super" keyword it will find x in parent class
		System.out.println(x); // when we use "this" keyword it will find x in same class we x and this.x both are same in this codition
	
	}

	child(int x){
	
	      super.x=x;
		System.out.println();
	
	
	}
}

class client{

	public static void main(String[] args){
	
	
		child obj=new child(100);

	
	
	}



}
