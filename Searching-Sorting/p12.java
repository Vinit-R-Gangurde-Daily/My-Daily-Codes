//mergeSort part 1
class MergerDemo{

	void MergeSort(int arr[],int start,int end){

		if(start<end){
		
			int mid=(start+end)/2;

			System.out.println("Start:"+start+"mid:"+mid+"end:"+end);
		
			MergeSort(arr,start,mid);
			MergeSort(arr,mid+1,end);


		}
	
	
	
	}
	
	
	public static void main(String[] args){
	
		int arr[]=new int[]{9,1,8,2,7,3,6,4};
                
		int start=0;
		int end=arr.length-1;

		MergeSortDemo obj=new MergeSortDemo();
		obj.MergeSort(arr,start,end);
		

	
	}

}
