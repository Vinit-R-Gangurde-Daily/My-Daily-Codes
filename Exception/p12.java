

import java.io.*;

class OverFlowException extends RuntimeException{

	OverFlowException(String str){
	
		super(str);
	}
}

class DownFlowException extends RuntimeException{

	DownFlowException(String str){
	
		super(str);
	}
}

class Demo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the size of arr");
		int si=Integer.parseInt(br.readLine());

		int arr[]=new int[si];


                System.out.println("enter the array element");
		for(int i=0;i<arr.length;i++){
		
			int data=Integer.parseInt(br.readLine());

			if(data<0){
			
				throw new DownFlowException("data must be grater than 0");
			}
			if(data>100){
			
				throw new  OverFlowException("data must be less than 100");
			}

			 arr[i]=data;
		}
	

	 

	
	}

}
