

class Demo{


	int fun(int x){
	
		int y=x+50;
	
		return y;
	}

	static void gun(int x,double y){
	

		System.out.println(x);
		System.out.println(y);
	
	}


	public static void main(String[] args){
	
		Demo obj=new Demo();

		System.out.println(obj.fun(10));       

		// System.out.println(gun(10,20.3)); //it will give the error becouse gun is not have return type and we are trying to print it 
	
	     gun(10,20.3);

	     gun('A',30); // it do not get error becouse size of char is less than int it will print the ascii value of a
                      
	
	}


}
