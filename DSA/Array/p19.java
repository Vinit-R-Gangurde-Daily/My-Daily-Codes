


class Demo{


	public static void main(String[] args){
	
	
		 int arr[]=new int[]{-7,1,5,2,-4,3,0};

		   int N=7;


		   for(int i=0;i<N;i++){
		           
			   int rightsum=0;
			   int leftsum=0;
			 
			   for(int j=0;j<i;j++){
			   
				   leftsum=leftsum+arr[j];
			   }
		   
			   for(int j=i+1;j<N-1;j++){
			   
				   rightsum=rightsum+arr[j];
			   
			   }

			   if(rightsum==leftsum){
			   
				   System.out.println(i);
				   break;
			   
			   }
		   
		   }





	
	}

}
