


class Demo{

	
	
	void fun(int arr1[]){
	
		arr1[1]=80;
		arr1[2]=90;
	
	}
	
	
	public static void main(String[] args){
	
		int arr[]={10,20,30,40};

		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));
	

		Demo obj=new Demo();
		obj.fun(arr);


		for(int x : arr){
		
			System.out.println(x);
		
		}
                      int x=80;
		      int y=90;

                   System.out.println(System.identityHashCode(x)); 
		   System.out.println(System.identityHashCode(y));
		      
		      
		      System.out.println(System.identityHashCode(arr[1]));
		   System.out.println(System.identityHashCode(arr[2]));

	
	
	
	}

}



