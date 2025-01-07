

import java.io.*;
class Demo{


      void fun(String str1){
      
	      System.out.println("in string");

      
      }
      void fun(StringBuffer str2){
      
      
	      System.out.println("Stringbuffer");
      }

}

class Client{


	public static void main(String[] args){
	
	
		Demo obj=new Demo();

		obj.fun("vinit");
		obj.fun(new StringBuffer("vinit"));
	
	}

}
