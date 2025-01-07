

class Demo{

	public static void main(String[] args){
	
		int arr[][]=new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};

		for(int i=arr[0].length-1;i>=0;i--){
		
			int p=0;
			int q=i;
			
		    while(p<arr.length && q>=0){
		
                              System.out.println(arr[p][q]);
			
		
                     p++;
                     q--;		     
		
		    
		    }
	      }
	
	}
}
