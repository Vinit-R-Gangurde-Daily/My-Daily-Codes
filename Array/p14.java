

class Demo{

	public static void main(String[] args){
	

		int arr1[][]={{},{},{}}; // it is complite decleration of array due to this compiler knows the length of 
					 // rows and colums
	
		int arr2[][]=new int[2][]; // it will not complite decleration of array .compiler knows the length of 
					   // rows but it dont know the length of columns 
	


		System.out.println(arr1.length);
		System.out.println(arr1[0].length);


		System.out.println(arr2.length);
		System.out.println(arr2[0].length);  //it will give NullPointerException:
						    //becouse we are trying to acesses the funtionaly of object which is
						    //not paresent(not created)
	}




}
