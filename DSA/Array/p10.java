

/*
 
   Carray forward
 
 */





class Demo{


	public static void main(String[] args){
	
		int arr[]=new int[]{3,4,5,1,2,7,9,5};
             
		int n=8;
		int j=3;

                      int max=Integer.MIN_VALUE;
	 
		for(int i=0;i<n;i++){
	
		       if(max<arr[i]){
		       
			       max=arr[i];
		       
		       }	

		
		}

         System.out.println(max);
	
	
	
	}

}
