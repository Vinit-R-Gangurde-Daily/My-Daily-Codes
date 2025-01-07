
//selection Sort using recusion



class SelectionSortRec{

	void Selection(int arr[],int Index){

		  if(Index<0){
		  
			  return;
		  }
	        
	                 int MinIndex=Index;
                         for(int j=Index+1;j<arr.length;j++){

                                 if(arr[MinIndex]>arr[j]){

                                         MinIndex=j;
                                 }


                         }

                         int temp=arr[Index];
                         arr[Index]=arr[MinIndex];
                         arr[MinIndex]=temp;
                 	
                      Selection(arr,Index-1);
	
	}

	public static void main(String[] args){
	
		int arr[]=new int[]{9,2,7,3,8,4,1,6};

	  SelectionSortRec obj=new SelectionSortRec();
	
	      obj.Selection(arr,0);

	      for(int i=0;i<arr.length;i++){
	      
		      System.out.print(arr[i]+" ");
	      }
	      System.out.println();
	}

}
