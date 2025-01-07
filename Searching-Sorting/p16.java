
//quick sort


class QuickSortDemo{


	int partition(int arr[],int start,int end){
	
		int pivot=arr[end];
                int i=start-1;
		for(int j=start;j<end;j++){
		
			if(arr[j]<=pivot){
			      i++;
			      int temp=arr[i];
			      arr[i]=arr[j];
			      arr[j]=temp;

			}
		
		}
	      int temp=arr[i+1];
	      arr[i+1]=arr[end];
	      arr[end]=temp;

	      return i+1;
	
	}

	void quickSort(int arr[],int start,int end){
	
		if(start<end){
		
			int pivotIdx=partition(arr,start,end);
		     partition(arr,start,pivotIdx-1);
		     partition(arr,pivotIdx+1,end);
		
		
		}
	
	}
	

	
	public static void main(String[] args){
	
		int arr[]=new int[]{12,7,6,14,5,15,10};

		QuickSortDemo obj=new QuickSortDemo();
                
		for(int i=0;i<arr.length;i++){
		
			System.out.print(arr[i]+" ");
		
		}
		System.out.println();
		int start=0;
		int end=arr.length-1;
		obj.quickSort(arr,start,end);

		for(int i=0;i<arr.length;i++){
		
			System.out.print(arr[i]+" ");
		
		}
	           System.out.println();
	}
}
