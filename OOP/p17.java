/*
 
   Overriding
 
 */







class parent{

	parent(){
	
	
		System.out.println("in a patent constructor");
	}

	void property(){
	
	
		System.out.println("cold,car");
	}

	void marry(){
	
	
		System.out.println("dipika");
	
	}
}



class child extends parent{

	child(){
	
		System.out.println("in child constructor");
	
	
	}

/*	void property(){
	
		System.out.println("cold,car");
	}
*/
	void marry(){
	
	
		System.out.println("alia");
	
	}

}




class client{

	public static void main(String[] args){
	
	
		child obj=new child();
		obj.property();
		obj.marry();
	
	}

}
