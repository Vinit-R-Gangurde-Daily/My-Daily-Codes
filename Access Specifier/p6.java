
/*
 
   Revegen of all
 
 
 */



//1.

/*
class Demo{

	public static void main(String[] args){
	
	
		int a=10;
		//float  b=5.5; //error=possible lossy conversion from double to float (it will consider 5.5 as double)     
		float b=5.5f; 
	
	}
}*/

//2.

/*
class Demo{

	int a=10;//instane (global) variable

	public static void main(String[] args){
	 
	     int b=30; //local variable
		   
	     System.out.println(a); //error=non-static variable a cannot be referenced from a static context
	     System.out.println(b);  

	
	}
}
*/


//3.operators
/*
class Operators{

	public static void main(String[] args){
	
	
		int b=12;
		int a=2;

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b);//quifishent
		System.out.println(a/b);//remnder
	
	}
}*/
/*
class Demo{

	public static void main(String[] args){
	
		int a=4;
		int b=5;
		int c=6;
	

		int ans=a+b*c+(a-b);

		System.out.println(ans);
	
	}



}*/

/*
class CompareOpp{


	public static void main(String[] args){
	
		int x=9;
		int y=5;
                                           
		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		System.out.println(x==y);
		System.out.println(x!=y);

   }


}*/



//4.coditinal operater if else

/*class Demo{

	public static void main(String[] args){
	
		int a=30;
		int b=50;
		
		if(a<b){  //if(a){ error= incompatible types: int cannot be converted to boolean
		
			System.out.println("hellow");
		}else{
		        System.out.println("hey");
		}
	
	
	}

}*/

//5.incremental or dicremental opperater

/*  class Demo{
  
	  public static void main(String[] args){
	  
	            int x=10;
		    int y=20;
		  
		  
		  //System.out.println(++x);
		  //System.out.println(++y);
		  
		  //System.out.println(--x);
		  //System.out.println(--y);
		  

		    //System.out.println(x++);
		    //System.out.println(y++);
                           //System.out.println(x);
		           //System.out.println(y);

	            System.out.println(x--);
		    System.out.println(y--);
		            System.out.println(x);
			    System.out.println(y);
                  
	  
	  }
  
  
  }*/

/*
class Demo{

	public static void main(String[] args){
	
		int x=20;
		int y=30;
		 
		//int ans1=++x + y++;
	        int ans2=--x + y--;
		
		//System.out.println(ans1); //51
	       System.out.println(ans2);//49
	
	}



}*/

//6.control statment

/*class Demo{

	public static void main(String[] args){
	
		int age=18;

		if(age>=18){
		
			System.out.println("yes , your are eligible to vote");
		
		}else{
		
		
			System.out.println("No,your are not eligible to vote");
		
		}

	}
}
*/
/*
class Demo{

        public static void main(String[] args){


		int x=10;
		int y=30;

		if(x>y){
		
			System.out.println(x);
		
		}else{
		
	       System.out.println(y);

                   }
		   
      }
}
*/

/*
class Demo{

        public static void main(String[] args){

            int c=20;
	    int d=20;

	    if(c>d){
	    
		    System.out.println("grater num is= "+ c);
	    
	    }else
	       if(c<d){
	    
		    System.out.println("grater num is= "+ d);
	    
	    }else{
	    
	    
		    System.out.println("both are eaual");
	    }

	}
}*/

/*
class Demo{

        public static void main(String[] args){
      
	 float tem=89.6f;

	 if(tem>98.6f){
	 
		 System.out.println("heigh temperture");
	 
	 }else
		 if(tem>=98.0f & tem<=98.6){
		 
			 System.out.println("normal temperature");
		 }else{
		 
			 System.out.println("low temperature");
		 }
          }
}
*/
/*
class Demo{
           public static void main(String[] args){
        
		int c=5;
          
	       if(c%4 == 0){
		System.out.println("num is divisible by four");
              }else{
	      
		      System.out.println("not divisible by 4");
	      }
	   }
}*/

/*class Demo{

        public static void main(String[] args){

               int num=3;

	       if(num%2==0){
	            
		       System.out.println("num is even");
	       
	       }else{
	       
		       System.out.println("num is odd");
	       
	       }
	 }
}*/

/*
class Demo{

        public static void main(String[] args){
             
		int num=15;

		if(num%3==0 & num%5==0){        //if(num%3==0) && if(num%5==0)
		
			System.out.println("fizzz-buzzz");
		}else
			 if(num%5==0){
			 
				 System.out.println("buzz");
			 }else
			        if(num%3==0){
			 
				 System.out.println("fuzz");
			 
			 }else
				 System.out.println("not divisible by both");
	}


}*/
/*
class Demo{
           public static void main(String[] args){

 
     int units=200;

             if(units>100){
	     
		     System.out.println( "bill is ="+ ((units-100)*2+100));

	     }else{
	     
		     System.out.println("bill is= "+ units );
	     }

     }
}*/




//7. loops


//while loop
/* 
class Demo{
           public static void main(String[] args){

                   \\\\\\\\\\\\\\\\\\\\int i=8;
		   while(i>=1){
		   
			   System.out.println(i);

		        i--;
		   }
        }
}*/
/*
class Demo{
           public static void main(String[] args){

		   int i=1;

		   while(i<=10){
		   
			   if(i%2==0){
			   
				   System.out.println(i);
			   }

                        i++;
		  }
          }
}*/
/*
class Demo{
           public static void main(String[] args){
            
		  int num=22;
		  int i=1;
		   while(i<=num){
		   
			   if(i%4==0){
			   
				   System.out.println(i);
			   }
		   i++;
		   }

           }
}*/

/*class Demo{
           public static void main(String[] args){

		  int num=6531;

		  while(num!=0){
		  
			  System.out.println(num%10);
			  num=num/10;
		  
		  
		  
		  }

           }
}*/

/*class Demo{
           public static void main(String[] args){


		   int num=6531;

               int sum=0;
		   while(num!=0){
		    
			   sum =sum+(num%10);

			   num=num/10;
		   
		   }
		   System.out.println(sum);
           }
}*/
/*
class Demo{
           public static void main(String[] args){
               
		   int num=30;
                    int i=0;                 
 
		   while(i*i<30){
		   
			   System.out.println(i*i);
		 
			  i++;
		   }
	}
}*/


//for loop


/*

class Demo{

	public static void main(String[] args){
	
		int num=10;

	
		for(int i=0;i<num;i++){
		
			if(i%2!=0){
			
				System.out.println(i);
			}
		}
	}
}
*/
/*
class Demo{

	public static void main(String[] args){
	
	
		int num=5;

		int Sum=1;

		for(int i=num;i>=1;i--){
		
			Sum=Sum*i;
		
		}
		System.out.println(Sum);
        }
}
*/

/*
class Demo{

        public static void main(String[] args){
         
		int num=6;
		
		for(int i=1;i<=num;i++){
		
			if(6%i==0){
			
				System.out.println(i);
			}
		}
	 }
}
*/



import java.io.*;
class Demo{


    static void fun(int a,int b){

	      int sum=a+b;
      
     
	     System.out.println(sum); 
      }	

   
       


	public static void main(String[] args)throws IOException{
         
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 

		float x=Integer.parseInt(br.readLine());

		float y=Integer.parseInt(br.readLine());

                   fun(x,y);       

        }


}


















   

















































