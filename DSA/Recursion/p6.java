

class Demo{

	int count=0;
	int fun(int num){
	
		if(num/10==0)
			return 1;
                
               
                  
	         return fun(num/10)+1;
	}

	public static void main(String[] args){
	  
		Demo obj=new Demo();
		System.out.println(obj.fun(123456));
	
	}

}
