
// binary Search by recurrastion
import java.io.*;
class ReBinarySearch{

  static int BinarySearch(int arr[],int find,int start,int end){
	     
                 
	         
                if(start>end){
		
			return -1;
		}else{
		int mid=(start+end)/2;
		
		if(arr[mid]==find){
		
			return mid;
		}
		if(arr[mid]>find){
		
		       return BinarySearch(arr,find,start,mid-1);
		
		}else{
		
			return BinarySearch(arr,find,mid+1,end);
		
		}
            }
		
      // return -1;
			
	}
	
	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	     System.out.println("enter the size of array: ");
             int size=Integer.parseInt(br.readLine());

              int arr[]=new int[size];

            for(int i=0;i<arr.length;i++){
	    
	    
		   arr[i]=Integer.parseInt(br.readLine());
	    
	    }	      

	    System.out.println("enter the element which you want to search: ");
	    int find=Integer.parseInt(br.readLine());
	
	    int index=BinarySearch(arr,find,0,arr.length);
             
	    System.out.println(index);
	    if(index==-1){
	         System.out.println("element is do not parasent in array: ");
	    }else{
	            
		    System.out.println("element is found at: "+index);
	    }
	    
	
	}

}
