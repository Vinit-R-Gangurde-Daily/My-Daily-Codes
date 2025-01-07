



class parent{

	parent(){
	
		System.out.println("in parent constructor");
	
	}

	void fun(){

		System.out.println("in fun method");
	
	}



}


class child extends parent{


	child(){
	
		System.out.println("in child constructor");
	
	}


      void gun(){
	
             	           System.out.println("in gun method of child");	
	
	}

}


class client{
          
	public static void main(String[] args){
	
		child obj=new child();
                obj.fun();
		obj.gun();
		
		parent obj2=new parent();

		obj2.fun();
		obj2.gun(); // give the arror as =cannot find symbol becouse parent do not able to access method which only present in child

	
	}


}

