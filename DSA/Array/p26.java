
class Demo{

	public static void main(String[] args){
	
	
		int arr[]=new int[]{1,2,3};

                 int TotalSum=0;
		for(int i=0;i<arr.length;i++){
		      int Sum=0;
			for(int j=i;j<arr.length;j++){
			
				Sum=Sum+arr[j];
			    TotalSum=TotalSum+Sum;
			}
		
		
		}
		System.out.println(TotalSum);
	
	}


}
