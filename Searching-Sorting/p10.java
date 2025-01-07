


//Selection Sort


 class SelectionSortDemo2{
 
	 public static void main(String[] args){
	 
		 int arr[]=new int[]{9,2,7,3,8,4,1,6};


		 for(int i=0;i<arr.length-1;i++){
		 
			 int MinIndex=i;
			 for(int j=i+1;j<arr.length;j++){
			 
				 if(arr[MinIndex]>arr[j]){
				 
					 MinIndex=j;
				 }
			 

			 }
		 
			 int temp=arr[i];
			 arr[i]=arr[MinIndex];
			 arr[MinIndex]=temp;
		 }
	 
		 for(int i=0;i<arr.length;i++){
		 
			 System.out.print(arr[i]+" ");
		 
		 }
	 
		 System.out.println();
	 }


 
 }
