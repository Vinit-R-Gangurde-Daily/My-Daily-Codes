
     //object will be call the constructor which have same parameter list as that object


class Demo{

	Demo(){
	
		System.out.println("no arrgument constructor 1");

	
	}
 
	Demo(int x){      //Demo(Demo this,int x)
	
		System.out.println("in int para constructor 2");
	
	}

	Demo(char y){
	
		System.out.println("in char para constructor 3");
	
	}

	public static void main(String[] args){
	
	
		Demo obj1=new Demo(); // it will call const 1      Demo(obj1)
                                                                 
		Demo obj2=new Demo(10); // it will call const 2   Demo(obj2,10)                    
	
		Demo obj3=new Demo('A'); // it will call const 3   Demo(obj3,'A')
	}

}
