



class Demo{

	public static void main(String[] args){
	
		int arr[]=new int[]{1,2,3};


		for(int i=0;i<arr.length;i++){
	int Sum=0;	
			for(int j=i;j<arr.length;j++){
			
				Sum=Sum+arr[j];
				System.out.println(Sum);
			
			}
		
		
		}
	
	
	}


}
