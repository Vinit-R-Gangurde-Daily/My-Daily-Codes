import java.io.*;
import arithfune.ArithematicOpp;
class Demo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	     int num1=Integer.parseInt(br.readLine());
	     int num2=Integer.parseInt(br.readLine());

                      ArithematicOpp obj=new ArithematicOpp(num1,num2);

		     obj.div();



	
	}


}
