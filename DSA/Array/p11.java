





class DemoLeet1{

	
	public static void main(String[] arga){
	
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};

		int N=10;

		int Maxarr[]=new int[N];

                     int max=Integer.MIN_VALUE;	

		for(int i=0;i<N;i++){
		
			
			
			for(int j=0;j<=i;j++){
			
			       if(max<arr[j]){
			       
				       max=arr[j];			       
			       }	

			Maxarr[i]=max;
			
			}
		
		}
	
		for(int i=0;i<N;i++){
		
		   System.out.println(Maxarr[i]);
		
		}
	
	}


}
