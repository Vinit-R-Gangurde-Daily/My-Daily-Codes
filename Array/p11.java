


class Demo{


	public static void main(String[] args){
	
	
		int arr[][]=new int[2][3]; //the length of both the arrays are same becouse the length of 2'D array is equal to num 
					   //of row in that pertiqular array and length of 1'D array is equal to num of element in it 
		int arr1[]=new int[2];
		
	
		System.out.println(arr.length);
		System.out.println(arr1.length);
	

	        int arr2[][]=new int[2][]; // it will do not get error if we give only num of rows(in this codition java will make 2
					   // rows and wating for num of colums)	
	        
		int arr3[][]=new int[][3];  // it will give the error if we give only num of columns
	
	}    






}
