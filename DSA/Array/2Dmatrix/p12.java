




class SpiralDemo{

	public static void main(String[] args){
	
		int arr[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		int N=arr.length;
                 int x=0;
		 int y=0;

            while(N>1){
		 for(int i=0;i<N-1;i++){
		 
			 System.out.print(arr[x][y] + " ");

		 y++;
		 }

		 for(int i=0;i<N-1;i++){
		 
			 System.out.print(arr[x][y] + " ");

			 x++;
		 
		 }

		 for(int i=0;i<N-1;i++){
		 
			 System.out.print(arr[x][y] + " ");

			 y--;
		 
		 }

		 for(int i=0;i<N-1;i++){
		 
			 System.out.print(arr[x][y] + " ");
			 x--;
		 
		 }
	     x++;
	     y++;
	     N=N-2;
	   
	    }
	    if(N==1){
	    
		    System.out.println(arr[x][y]);
	    
	    }
	
	}


}
