

class BubbleRec{

 static int count=0;
	 void BubbleSort(int arr[],int size){
                
		
		if(size==1){

                        return;

                }
                         boolean flag=false;
                for(int i=0;i<arr.length-1-i;i++){


                        if(arr[i]>arr[i+1]){

                                int temp=arr[i];
                                arr[i]=arr[i+1];
                                arr[i+1]=temp;
                             flag=true;
                        }
                 count++;
                }
		if(flag==false){
		
			return;
		}
                BubbleSort(arr,size-1);
        }
     
	
	
	public static void main(String[] args){
	
		int arr[]=new int[]{7,3,9,4,2,5,6};

		BubbleRec obj1=new BubbleRec();
		obj1.BubbleSort(arr,arr.length);
	
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		
		
		}

		System.out.println("count is : "+count);
	
	}

	
}
