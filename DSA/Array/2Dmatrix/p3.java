



class Demo{

	public static void main(String[] args){
	
		int arr[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};


		for(int i=0;i<arr.length;i++){
		
			int Sum=0;
			for(int j=0;j<arr[0].length;j++){
			

				Sum=Sum+arr[i][j];
			
			
			}
		System.out.println(Sum);
		
		}
	
	
	
	}


}