




class Demo{

      static void fun(int x,int y){
	
	 	 System.out.println(x); 
	                                      
       		 System.out.println(y);      // it means when we try to change the value of variable in different method this changes do not display                                               in main becouse the scope of variable is different
	      
	        x=x+10;
		y=y+10;
                                                   
	      System.out.println(x);
	      System.out.println(y);
	}

	
	public static void main(String[] args){
	
		int x=10;
                int y=20;

		System.out.println(x);
		System.out.println(y);

	      
		fun(10,20);

		System.out.println(x);
		System.out.println(y);
	
	}


}
