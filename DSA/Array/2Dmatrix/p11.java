



class BorderDemo{

	public static void main(String[] args){
	
		int arr[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};


		int x=0;
		int y=0;


		for(int i=0;i<arr.length-1;i++){
		
			System.out.print(arr[x][y] +" ");

			y++;
		
		}
		
		for(int i=0;i<arr.length-1;i++){
		
			System.out.print(arr[x][y] +" ");

			x++;
		
		
		}


		for(int i=0;i<arr.length-1;i++){
		
			System.out.print(arr[x][y] +" ");
		y--;
		
		}

		for(int i=0;i<arr.length-1;i++){
		
			System.out.print(arr[x][y]+" ");
		
		x--;
		}
	
	}

}
