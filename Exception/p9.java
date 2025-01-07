/*
 
        User Define Exception

	throw key word
 
 */


import java.io.*;
class Demo{

	public static void main(String[] args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


	int a=Integer.parseInt(br.readLine());

	

	try{
		if(a==0){
		     throw new ArithmeticException();
		}

		System.out.println(10/a);
      }catch(ArithmeticException obj){
     
	     System.out.print("Exception in thread main"+ Thread.currentThread().getName()+" "); 
	   obj.printStackTrace();
	      
      
      }
	
   }


}
