


class Demo{

	public static void main(String[] args){
	
		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};

                   int Prefixarr[]=new int[arr.length];

		   Prefixarr[0]=arr[0];

		   for(int i=1;i<arr.length;i++){
		   
			   Prefixarr[i]=Prefixarr[i-1]+arr[i];
		   
		   }

		   int TSum=Integer.MIN_VALUE;
		   for(int i=0;i<arr.length;i++){
		          int Sum=0;
			   for(int j=i;j<arr.length;j++){
			   
				  Sum=Sum+arr[j];

				  if(TSum<Sum){
				  
					  TSum=Sum;
				  }
			   
			   }
		   
		   }
		  System.out.println(TSum);
	
	
	}

}
