

/*
#linear Searching
 */
import java.io.*;
class Demo{

	static int arrsort(int arr[],int ele){
	
 
		for(int i=0;i<arr.length;i++){
		
		     if(arr[i]==ele){
		     
			       return i;
		     }
		
		}
	return -1;	
	}
	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		//Scanner br=new Scanner(System.in);
	System.out.println("enter the num of array element you want: ");
	  int size=Integer.parseInt(br.readLine());

	  int arr[]=new int[size];
	     
          
	 System.out.println("enter the elements of array: "); 
	  for(int i=0;i<arr.length;i++){
	   
		   arr[i]=Integer.parseInt(br.readLine());
	   
	   }	

	  System.out.println("enter the element which you want to search: ");
	   int ele=Integer.parseInt(br.readLine());

	      int value=arrsort(arr,ele);
         
	
	   if(value==-1){
	  
		   System.out.println("element is not fund in array");
	   
	   }else{
	   
		   System.out.println("element is found at index: "+value);
	   
	   }
	   
	
	}


}
