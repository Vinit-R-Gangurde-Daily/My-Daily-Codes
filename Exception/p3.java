


import java.io.*;
class Demo{


	void m1()throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int num=0;
		try{
		
		 num= Integer.parseInt(br.readLine());
	
		}catch(NumberFormatException obj){
		
			System.out.println(obj.getMessage());
			System.out.println(obj.toString());
			//System.out.println(obj.printStackTrace());
		}
	}

	void m2(){
	
	
	
	}
	
	
	public static void main(String[] args)throws IOException{
	
                    Demo obj=new Demo();
	          obj.m1();	    
	
	}


}
