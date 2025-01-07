

class Demo{


	public static void main(String[] args){
	
		int arr1[]={10,20,30,40,50};
		int arr2[]={9,18,27,36,45};

		int p=arr1.length + arr2.length;
		int arr3[]=new int[p];



		for(int i=0;i<arr1.length;i++){
		
			arr3[i]=arr1[i];
		
		
		}

		int d=0;
		for(int i=arr1.length;i<p;i++){
		
		   arr3[i]=arr2[d];

		   d++;
		
		}
	
		for(int i=0;i<p;i++){
		
		 System.out.println(arr3[i]);
		
		}
	
	}







}
