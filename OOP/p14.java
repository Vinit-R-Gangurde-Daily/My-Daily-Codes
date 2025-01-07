


class parent{

	
	int x=20;
	static int y=30;
	
	
	parent(){
	
		System.out.println("in parent constructor");
	
	
	}


}

class child extends parent{


	int x=200;
	static int y=300;

	child(){
	
		System.out.println("in child constructor");
	
	}

	void access(){
	
	
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(x);
		System.out.println(y);
	
	}


}


class client{

	public static void main(String[] args){
	
	
		child obj=new child();
		obj.access();
	
	}



}
