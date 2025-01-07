 uh8class Demo{

	int x=10;
	public static void main(String[] args){
	
		Demo obj=new Demo();
		int x=5;
		int y=20;
		System.out.println("Core2web");

		float val1=7.7f;
		float val2=5.5f;

		System.out.println(val1);
		System.out.println(val2);

		
		System.out.println(obj.x);
                System.out.println(y);

		System.out.println(x>y);

	System.out.println("-------------");
	
		int ans=++x + y++ + x++;
	System.out.println(ans);


       
	x=6;
	y=3;

	
       	boolean ans1=x<y || y<x;
	 System.out.println(ans1);

	 System.out.println(x ^ y);

         System.out.println(x);
	 System.out.println(y);
	
	        
	}
}
