
/*
 
   Final Block

  excption will be occure or not final block will be exicute  
 */
import java.io.*;
class Demo{


	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


		int a=Integer.parseInt(br.readLine());


		try{
		
			System.out.println(10/a);
		
		}catch(ArithmeticException obj){
		
	               System.out.println("in arithmetic exception");       
		
	          }finally{
		  
			  System.out.println("in finally block");
		  
		  }
	
	}

}






