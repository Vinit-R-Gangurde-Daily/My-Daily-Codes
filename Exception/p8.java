
/*
  gest for try 
 
 */
import java.io.*;
class Demo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int a=0;
		try{
			 a=Integer.parseInt(br.readLine());
                   
	       	} catch(NumberFormatException obj){
	   
		       System.out.println("in NumberFormatException");	
	    }

	    try{
                  
		    System.out.println(10/a);
	    
	    } catch(ArithmeticException obj){
	    
		    System.out.println("in arithematic");

	    }
	}


}
