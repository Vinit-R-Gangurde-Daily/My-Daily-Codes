

class Demo{

	public static void main(String[] args){
	
		int arr[]=new int[]{-3,4,-2,5,3,-2,8,2,1,4};

		int k=4;


		int start=0;
		int end=k-1;
                int MaxSum=Integer.MIN_VALUE;
		
	while(end<arr.length){	
		int sum=0;
		for(int i=start;i<=end;i++){
		
			sum=sum+arr[i];
		
			if(sum>MaxSum){
			
				MaxSum=sum;
			
			}
		
		}
             start++;
	     end++;
           }
	System.out.println(MaxSum);
	}

}
