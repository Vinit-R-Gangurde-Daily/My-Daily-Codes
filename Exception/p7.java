/*
 
   Multipal catch blocks

   we can write a multiple catch block for single try block
   but condition is that it will follow the hierachy of exception means = first catch block contain child exception then parent exception
 
 */

import java.io.*;
class Demo{


        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


                int a=Integer.parseInt(br.readLine());


                try{

                        System.out.println(10/a);

                }catch(ArithmeticException obj){

                       System.out.println("in arithmetic exception");

                  }catch(RuntimeException obj){

                          System.out.println("in runtimeException");

                  }finally{

                          System.out.println("in finally block");

                  }

        }

}
