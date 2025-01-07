
//futhre program is in vim Addition.java

import java.io.*;
import arithfun.Addition;
class Demo{

	public static void main(String[] args)throws IOException{
	

    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                       int No1=Integer.parseInt(br.readLine());
		       int No2=Integer.parseInt(br.readLine());

		       Addition obj=new Addition(No1,No2);

		       System.out.println(obj.add());

	
		       


}
