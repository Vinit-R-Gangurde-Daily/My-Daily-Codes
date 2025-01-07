

class Demo{
     
	
	static void fun(int arr1[]){
	
	                                               // it means in the case of array when we make a change in array from any methoid this change                                                        will be display in every other place where we acess this array this will be happen becouse                                                           java make a single object for this array all other methoid see over this object 
	                                                               
	
		for(int i=0;i<arr1.length;i++){
		
		
			arr1[i]=arr1[i]+10;

		}
	
		System.out.println("in fun method= ");
	
		for(int x : arr1){
		
			System.out.println(x);
		
		}
	
	}
	

	
	
	public static void main(String[] args){
	

		int arr[]={1,2,3,4,5,6};

		for(int x : arr){
		
			System.out.println(x);
		
		}

		fun(arr);
	
	System.out.println("after fun method call in main");       
		for(int x : arr){

                        System.out.println(x);

                }
	
	}

}
