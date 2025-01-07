

class TransposeMatrixDemo{

	public static void main(String[] args){
	
		int arr[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

		for(int i=0;i<arr.length;i++){
		
		       int p=i;
			int q=i+1;

			while(q<arr.length){
			
				int temp=arr[p][q];
				arr[p][q]=arr[q][p];
				arr[q][p]=temp;
	
			q++;	
			}
		
		
		}
               
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr.length;j++){
			
				System.out.print(arr[i][j] +"  ");
			
			}
		System.out.println();
		}
	
	}

}
