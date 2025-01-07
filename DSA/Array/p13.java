

class DemoRightShift{

	public static void main(String[] args){
	
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
                     
		 int N=10;
            
		 int RightShift[]=new int[N];

		 RightShift[N-1]=arr[N-1];

		 
		 for(int i=N-2;i>=0;i--){
		 
			
			 if(RightShift[i+1]<arr[i]){
			 
				 RightShift[i]=arr[i];
			 
			 }else{
			 
				 RightShift[i]=RightShift[i+1];
			 
			 }
		    
		 }

		 for(int i=0;i<N;i++){
		 
			 System.out.println(RightShift[i]);
		 
		 }

	
	}




}
