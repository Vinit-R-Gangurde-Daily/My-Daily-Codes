

class Demo{

	void fun(int num){
	
		if(num==0){
		
			return;
		}

		System.out.println(num);
		fun(num-1);
	
	}
	
	public static void main(String[] args){
	
          Demo obj=new Demo();
	  obj.fun(10);

	}

}
