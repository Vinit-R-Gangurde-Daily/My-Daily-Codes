

  // for each loop
  
class Demo{

	public static void main(String[] args){

		char arr1[]={'V','I','N','I','T'};

	int arr[]={1,2,3,4,5,6,7,8,9,10};
		for(int x : arr){
		
			System.out.println(x);
			System.out.println(x[0]);// give the error becouse it do not have a index
	
		           System.out.println(arr[3]);	
		}

		System.out.println(arr);  // it will give the identityHashCode of array e.g= [I@1dbd16a6

		System.out.println(arr1); //arr1 is a character array so when we try to get the identityHashCode of character array it will give the
	}                                  // String as it is becouse string internaly work as character array 


}
