



class BubbleSortDemo{


	public static void main(String[] args){
	
		int arr[]=new int[]{7,3,9,4,2,5,6};
 
		 //int arr[]=new int[]{1,2,3,4,5,6,7};
		int count=0;
                        boolean swap;
                   for(int i=0;i<arr.length;i++){
                         
			   swap=false;
		
 			for(int j=0;j<arr.length-1-i;j++){
			
				if(arr[j]>arr[j+1]){
				
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			              
				       swap=true;	
				}
			     count++;
			

			}
		if(swap==false){

                                break;
                        }
		
		}
	
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		
		}
	
		System.out.println("num of eteration"+count);
	}

}
