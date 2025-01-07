
import java.io.*;
class Demo{


	public static void main(String[] args)throws IOException{
	
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the size of array= ");
		int n=Integer.parseInt(obj.readLine());

		int arr[]=new int[n];

	      System.out.println("Enter the array element= ");

	      
	      
	      for(int  i=0;i<arr.length;i++){
	      
	      
		     arr[i]=Integer.parseInt(obj.readLine());

		 
	      
	      
	      }
               
	for(int i=0;i<arr.length;i++){
	

                int temp=arr[i];

	        int sum=0;	
		
		while(temp!=0){

                             int temp1=temp%10;
                              sum=sum+temp;

                              temp=temp/10;


                      }

	if(sum%2==0){
	
		System.out.println(arr[i]);
	
	
	}	
	
	}
	
	
	
	}



}
