/*
 
     ArithmeticException
 
 */

import java.io.*;
class Demo{

	public static void main(String[] args)throws IOException{
	  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		 
             int a=Integer.parseInt(br.readLine());

           	    
	    try{
	       System.out.println(10/a);
         }catch(ArithmeticException obj){
	
                      System.out.println(obj.toString());
		      System.out.println(obj.getMessage());
		      System.out.println("in arithmeticException handler");

	 }/*catch(IOException obj){ it will we give the error becouse this error never be come 
	 
	 }*/

	}

}
