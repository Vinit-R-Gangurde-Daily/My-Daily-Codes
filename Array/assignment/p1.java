

import java.io.*;
class Demo{


	public static void main(String[] args)throws IOException{
	
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("enter the size of array= ");
		int n=Integer.parseInt(obj.readLine());

		int arr[]=new int[n];

		System.out.println("enter the arrya element= ");

		int sum=0;
		for(int i=0;i<arr.length;i++){
		
			arr[i]=Integer.parseInt(obj.readLine());

			sum=sum+arr[i];
		
		}

	      System.out.println("sum of array is = "+sum);	
	}

}
