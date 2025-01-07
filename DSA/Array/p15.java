




class Demo{

	public static void main(String[] args){
	
		int arr[]=new int[]{2,7,11,15};
                  int N=4;
		  int T=9;

             //int arr2[]=new int[2]
		  for(int i=0;i<N;i++){
		  
			  for(int j=i+1;j<N;j++){
			  
				  if(arr[i]+arr[j]==T){
				  
					  System.out.println("["+ i +","+ j + "]");
				  
				  }
			  }
		  
		  }

	
	}

}
