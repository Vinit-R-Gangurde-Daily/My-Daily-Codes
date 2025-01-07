

class Demo{

	void fun(float x,int y){
	
		System.out.println(x+" "+y);
	
	}

	void fun(int x,float y){
	
		System.out.println(x+" "+y);
	
	}
}


class Client{

	public static void main(String[] args){
	
		Demo obj=new Demo();
		obj.fun(10,10);
	
	}

}
