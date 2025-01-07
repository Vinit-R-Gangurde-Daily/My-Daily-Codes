


import java.util.*;
class Demo{

	public static void main(String[] args){
	
		Scanner br=new Scanner(System.in);

               int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
                 int N=10;
		 int Q=3;

		 for(int i=1;i<N;i++){
		 

			 arr[i]=arr[i-1]+arr[i];
		 
		 
		 }

		 
   
		 
		 for(int i=0;i<Q;i++){
		     
			 int sum=0;
			 System.out.print("enter a start index: ");
			 int startIndex=br.nextInt();
			System.out.println("enter a end index: ");
			 int endIndex=br.nextInt();

			 if(startIndex==0){
			 
				 sum=arr[endIndex];
				 System.out.println(sum);
			 }else{

			 sum=arr[endIndex]-arr[startIndex-1];
			 System.out.println("sum is: "+sum);
		    }
		 }

		 
	
	
	}


}
