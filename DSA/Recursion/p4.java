


class Demo{

	void fun(int num){
	
		if(num==0){
		
			return;
		}
	 
		fun(num-1);
                 System.out.println(num);
	}
	
	public static void main(String[] args){
	
           Demo obj=new Demo();
	   obj.fun(10);
 
	
	}

}
