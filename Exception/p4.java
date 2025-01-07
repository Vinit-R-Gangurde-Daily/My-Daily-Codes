
/*
 
   NumberFormat Execption excepton

   resone for genrating this arror= requre int and user put other data like string
 
 */

import java.io.*;
class Demo{

	public static void main(String[] args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          

          try{
        	int num=Integer.parseInt(br.readLine());
           }catch(NumberFormatException obj){
	   
		   System.out.println(obj.getMessage());
                   System.out.println(obj.toString());          
	   }
   
	} 



}
