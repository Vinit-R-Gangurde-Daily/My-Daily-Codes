

import java.io.*;
class Demo{


	static int myStringlin(String str){
	
		char arr[]=str.toCharArray();

		  int count=0;

		for(int i=0;i<arr.length;i++){
		
			count++;
		}

		return count;
	
	}
	
	
	public static void main(String[] args)throws IOException{
           
	BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("enter the string");

	String str1=obj.readLine();

	String str2=obj.readLine();

   

	int len1=myStringlin(str1);
	int len2=myStringlin(str2);

            
	    if(len1==len2){
	    
		    System.out.println("length of string is same");
	    
	    }else{
	    
		    System.out.println("sorry the len of both the string is differet");
	    }


	}

}
