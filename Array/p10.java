


   // Multi Dimention array (2'array)

class Demo{

	public static void main(String[] args){
	
		int arr[][]=new int[2][3];             // in this method first [] braket will repesent the num of row and second will                                                         represent the num of column
                                                        

		arr[0][0]=1;              
		 arr[0][1]=23;
		  arr[0][2]=3;
		   arr[1][0]=4;
		    arr[1][1]=5;
		     arr[1][2]=6;
	
       System.out.println(arr[0][2]);      // we can prent this way
       System.out.println(arr[0]); //[I@1dbd16a6 it will give the address of 1'D array (0th column)
       System.out.println(arr[1]);
       System.out.println(arr);      // [[I@7ad041f3  it will give the address of 2'D (array) 
       
       for(int i=0;i<arr.length;i++){        //print using for loop
	     
		     for(int j=0;j<arr[i].length;j++){
		     
		     
			     System.out.println(arr[i][j]);
		     
		     }
	     
	     
	     }
	
	
	
	}





}
