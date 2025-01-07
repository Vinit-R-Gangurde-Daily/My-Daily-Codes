

class Rotate90Demo{

	public static void main(String[] args){
	
		int arr[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		for(int i=0;i<arr.length;i++){
		
			int p=i+1;
                        int q=i;

			while(p<arr.length){
			
				int temp=arr[q][p];
				arr[q][p]=arr[p][q];
				arr[p][q]=temp;
				 
				p++;
			
			
			}

               }

	  int q=arr.length-1;
	       for(int i=0;i<=arr.length/2;i++){
	       
		      int p=0;
		      // q=arr.length-1;

		       while(p<arr.length){
		       
			      int temp=arr[p][i];
			       arr[p][i]=arr[p][q];
			       arr[p][q]=temp;


			p++;	       
		       
		       
		       }
	          q--;
	       }

                  for(int i=0;i<arr.length;i++){
		  
			  for(int j=0;j<arr.length;j++){
			  
				  System.out.print(arr[i][j] + " ");
			  
			  }

			  System.out.println();
		  }


	}
}
