

/*
 //using for loop
class Demo{

	public static void main(String[] args){
	
		int arr[]=new int[]{8,4,1,3,9,2,6,7};
                    int N=8;
		 int trans[]=new int[N];

		 int i=0;
		 int j=N-1;
		     while(i<N){
		    
			    trans[i]=arr[j];
                           
			    i++;
			      j--;
		    }
		  
		    for(int p=0;p<N;p++){
		    
		    System.out.println(trans[p]);
		    
		    }
	
	}

}
*/


class Demo{

	public static void main(String[] args){
	
		int arr[]=new int[]{8,4,1,3,9,2,6,7};
		int N=8;

	        int i=0;
	        int j=N-1;	
		
		while(i<j){
		
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;

			i++;
			j--;
		   
		}
	    for(int p=0;p<N;p++){
	    
		    System.out.println(arr[p]);
	    
	    }
	}

}










