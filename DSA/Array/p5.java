
import java.io.*;
class Demo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
		int arr[]=new int[]{1,2,3,4,5,6,7};

		 System.out.println("Enter a starting index");
		    int start=Integer.parseInt(br.readLine());

		 System.out.println("ending Index");
		 int end=Integer.parseInt(br.readLine());

		 int sum=0;
		 for(int i=start;i<=end;i++){
		 
			 sum=sum+arr[i];
			 
		 
		 }
              System.out.println(sum);
	        
	
	
	}


}
