
import java.io.*;

class IDException extends RuntimeException{

	IDException(String str){
	
		super(str);
	}

}



class Defence{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				
               System.out.println("Enter ID");
	
	         String idd="vinit";   
	       
	        for(int i=0;i<3;i++){ 
	                 String id = br.readLine();   
			      if(id != idd){
			    
	                     throw new IDException("please enter valid id");		    
			 }
		}	    
	
                 //int pass=Integer.parseInt(br.readLine());

	}


}
