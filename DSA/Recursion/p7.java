/*
import java.io.*;
class Demo{

	
	int VowelsCount(char arr[]){
	    int count=0;
		for(char i=0;i<arr.length;i++){
		
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
			  
				count++;
			
			}
		
		}
	return count;
	}

	
	
	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
		System.out.println("enter a string ");
		String str=br.readLine();
		Demo obj=new Demo();

		char arr[]=str.toCharArray();
                    
                  int count =obj.VowelsCount(arr);
		  System.out.println("num of vowels is: "+count);
	            	
	
	}

}
*/

import java.io.*;
class Demo{

        int count=0;
        int VowelsCount(String str){
            
              

                        if(str=='a' || str=='e' || str=='i' || str=='o' || str=='u'){

                                count++;

                        }

                
        return VowelsCount(str.charAt(0));
        }



        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("enter a string ");
                String str=br.readLine();
                Demo obj=new Demo();

                //char arr[]=str.toCharArray();

                  int count =obj.VowelsCount(str);
                  System.out.println("num of vowels is: "+count);


        }

}
