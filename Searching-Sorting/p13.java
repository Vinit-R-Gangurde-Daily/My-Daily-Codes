

class CombineArray{

	public static void main(String[] args){
	     
		int arr1[]=new int[]{3,7,9,11};
		int arr2[]=new int[]{2,5,8};

		int p=arr1.length+arr2.length;
		System.out.println(p);
		int arr3[]=new int[p];

		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length){
		
			if(arr1[i]<arr2[j]){
			
				arr3[k]=arr1[i];
				i++;

			}else{
			
				arr3[k]=arr2[j];
				j++;


			}
		k++;
		}
	            while(i<arr1.length){
		    
			    arr3[k]=arr1[i];
			    i++;
			    k++;

		    }
		       while(j<arr2.length){

                            arr3[k]=arr1[i];
                            j++;
                            k++;

                    }
	
		
		for(int q=0;q<arr3.length;q++){
		
			System.out.print(arr3[q]+" ");
		}
		System.out.println();
	}


}
