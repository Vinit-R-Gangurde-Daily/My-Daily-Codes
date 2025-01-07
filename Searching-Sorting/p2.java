


import java.io.*;
class Binarysearch{


	
	static int arraySearch(int arr[],int search){
	
	     int start=0;
	     int end=arr.length-1;
	     
	     while(start<=end){
	     
		     int mid=(start+end)/2;

		     if(arr[mid]==search){
		     
			     return mid;
		     }
	             if(arr[mid]>search){
		     
		     end=mid-1;

		     }
		     if(arr[mid]<search){
		     
			     start=mid+1;
		     
		     }
		   
	     
	     }
    return -1;
	   
	}

	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	         System.out.println("enter the size of array");
	         int size=Integer.parseInt(br.readLine());	

		int arr[]=new int[size];

	      for(int i=0;i<arr.length;i++){
	      
		      arr[i]=Integer.parseInt(br.readLine());
	      
	      }

             System.out.println("enter the element which you want to search: ");
              int ele=Integer.parseInt(br.readLine());
	      
	     int index=arraySearch(arr,ele);

	     if(index==-1){
	     
		     System.out.println("element do not find in this array: ");
	     
	     }else{
	     
		     System.out.println("element find at : "+index);
	     }

        	     
	}

 
}
