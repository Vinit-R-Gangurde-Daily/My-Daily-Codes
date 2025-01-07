
import java.io.*;
import arithemaoop.mypack;

class Demo{

    public static void main(String[] args)throws IOException{
    
                    
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   
	    int num1=Integer.parseInt(br.readLine());
	    int num2=Integer.parseInt(br.readLine());

	    mypack obj=new mypack(num1,num2);

                
	    obj.add();
	    obj.div();
    
    }


}
