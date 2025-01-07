


class Demo{

	public static void main(String[] args){
	
		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};


                        int TSum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
		
			for(int j=i;j<arr.length;j++){
			
			      int Sum=0;
				for(int k=i;k<=j;k++){
				
				 Sum=Sum+arr[k];

				
				}
			    if(TSum<Sum){
			    
				    TSum=Sum;
			    
			    }
			}
		
		}
	System.out.println(TSum);
	
	}

}
