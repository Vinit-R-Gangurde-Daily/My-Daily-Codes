


import java.io.*;
class Demo{


        public static void main(String[] args)throws IOException{

                BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("enter the size of array= ");
                int n=Integer.parseInt(obj.readLine());

                int arr[]=new int[n];

                System.out.println("enter the arrya element= ");
                
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++){

                        arr[i]=Integer.parseInt(obj.readLine());

                        if(arr[i]%2==0){
			

				even++;
			
			}else
				odd++;

                }

              System.out.println("num of even element is  = "+even);
	      System.out.println("num of odd element is = "+odd);
        }

}
