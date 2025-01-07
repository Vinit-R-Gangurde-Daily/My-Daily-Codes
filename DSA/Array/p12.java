


class Demoleet1{

	public static void main (String[] args){
	
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};

		  int N=10;

		  int arr2[]=new int[N];
		  
                     arr2[0]=arr[0];
		  for(int i=1;i<N;i++){
		  
			  if(arr2[i-1]<arr[i]){
			  
				  arr2[i]=arr[i];
			  
			  }else{
			  
				  arr2[i]=arr2[i-1];
			  }
		  
		  
		  }

		  for(int i=0;i<N;i++){
		  
		  
			  System.out.println(arr2[i]);

		  }
	
	}


}
