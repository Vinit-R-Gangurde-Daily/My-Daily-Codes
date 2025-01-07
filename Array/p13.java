


 class Demo{
 
 
	 public static void main(String[] args){
	 
	 
		 int arr1[][]=new int[4][4];
		 int arr2[][]={{1,2,3,4},{5,6,7},{8,9},{10}};

		 arr1[0][0]=1;
		 arr1[0][1]=2;
		 arr1[0][2]=3;                                //jagged array can make avalable of memory for which element is presen
							       //but in normal array full memory can be allocate so where data is not
							       //present it will put an 0 it will west of memory
		 arr1[0][3]=4;
		
		 arr1[1][0]=5;
		 arr1[1][1]=6;
		 arr1[1][2]=7;

		 arr1[2][0]=8;
		 arr1[2][1]=9;
		
		 arr1[3][0]=5;
		
	 
		 for(int i=0;i<arr1.length;i++){
		 
			 for(int j=0;j<arr1[i].length;j++){
			 
			 
				 System.out.print(arr1[i][j]);
			 
			 
			 }
			 System.out.println();
		 
		 }
	 


		 System.out.println("using jagged array= ");
		  for(int i=0;i<arr2.length;i++){

                         for(int j=0;j<arr2[i].length;j++){


                                 System.out.print(arr2[i][j]);


                         }
                         System.out.println();

                 }

		 for(int[] x:arr2){
		 
			 for(int y:x){
			 
			 
				 System.out.print(y);
			 }

			 System.out.println();
		 
		 }
	 
	 }
 
 
 
 
 
 }

