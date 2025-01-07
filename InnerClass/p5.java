
/*
 
   Annonymous
 
 */ 



class Demo{


	void m1(){
	
	
		System.out.println("in m1");
	}

}


class Client{

	public static void main(String[] args){
	
		Demo obj=new Demo(){
		
                    void m1(){		
			System.out.println("in Annonymous Inner class");
		    }
		
		
		};
                   obj.m1();	
	}

}
