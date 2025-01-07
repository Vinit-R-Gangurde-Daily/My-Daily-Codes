// loops in java 

// class p3{

//     public static void main(String[] args){

//         int i=8;

//         while(i>=1){
//             System.out.print(i);
        
//             i--;
//         }


//     }
// }


//1)------------------------------

// class p3{

//     public static void main(String[] args){

//         int N=10;
//         int i=1;

//         while(i<=N){


//             if(i%2!=0){
//                 System.out.println(i);
//         }
//         i++;
//     }

//    }
// }

//2)-------------------

// class p3{

//     public static void main(String[] args){

//         int N=10;
//         int i=1;

//         while(i<=N){

//             if(i%4==0){

//                 System.out.println(i);
//             }
//             i++;
//         }


//     }
// }

//3)-----------------

// class p3{

//     public static void main(String[] args){


//         int N=123;

//         while(N!=0){
            
//             System.out.println(N%10);
//             N=N/10;
//         }

//     }
// }

//4)----------
// class p3{
//     public static void main(String[] args){

//         int N=6531;
//         int sum=0;

//         while(N!=0){

//             int rem=N%10;
//             sum=sum+rem;

//             N=N/10;
//         }
//         System.out.println("sum of all digit in the num is: " + sum);
//     }
// }


//------------------------------






//************************************************ */

// For loop

//5)----------------lets begin------------------
// class p3{

//     public static void main(String[] args){

//         for(int i=0;i<=10;i++){

//             System.out.println(i);
//         }


//     }


// }

//6)-------------------odd num------------------------------

// class p3{

//     public static void main(String[] args){

//         int N=6;

//         for(int i=0;i<=6;i++){

//             if(i%2!=0){

//                 System.out.println(i);
//             }
//         }
//     }
// }


//7)------------------------factoral-------------------

// class p3{

//     public static void main(String[] args){

//         int n=6;
//         int sum=1;
//         for(int i=n;i>=1;i--){

//             sum=sum*i;
//         }

//         System.out.println("Factorial of "+ n + " is " + sum);
//     }
// }




//8)-------------------facters-------

// class p3{

//     public static void main(String[] args){

//         int N=6;

//         for(int i=1;i<=N;i++){

//             if(N%i==0){
//                 System.out.println(i);
//             }
//         }

//     }
// }



//9)-----------print the count of facters-----------

// class p3{

//     public static void main(String[] args){

//         int N=6;
//         int count=0;
//         for(int i=1;i<=N;i++){
                
//             if(N%i==0){
//                 count++;
//             }
//         }
//         System.out.println("num of facters is: " + count);
//     }
// }



//10)----------prime number------------------

// class p3{
//     public static void main(String[] args){

//         int num=5;
//         int count=0;

//         for(int i=1;i<=num;i++){

//             if(num%i==0){
//                 count++;
//             }
//         }

//         if(count==2){
//             System.out.println(num + " is a prime num");
//         }else{
//             System.out.println(num + " is not an prime num");
//         }
//     }
// }



//11)--------perfect number-------------------------



// class p3{
//     public static void main(String[] args){

//         int Num=6;
//         int sum=0;
//         for(int i=1;i<Num;i++){

//             if(Num%i==0){
//                   sum=sum+i;
//             }
//         }
        
//         if(sum==Num){
//             System.out.println(Num + " is a prime number");
//         }
//     }
// }



//12)----------Armstrong number---------------


// class p3{

//     public static void main(String[] args){

        
//         int N=1634;
//         int comp=N;
//         int count=0;
//         int temp=N;
//         int sum=0;
        
//         while(N!=0){
//             count++;
//             N=N/10;
//         }
        
//         while(temp!=0){
                   
//             int mult=1;
//             int last=temp%10;
//             for(int i=1;i<=count;i++){
      
//                mult=mult*last;
               
//         }
//         sum=sum+mult;
//         temp=temp/10;
        
//       }
      
//       if(sum==comp){
//         System.out.println("yes a Armstrong");
//       }else{
//         System.out.println("no it is not armstrong");
//       }
//     }
// }


//13)---------composite----------which having more thean one factorial


// class p3{

//     public static void main(String[] args){

//         int N=5;
//         int count=0;

//         for(int i=1;i<=N;i++){

//             if(N%i==0){
//                 count++;
//             }
//         }
//         if(count>1){
//             System.out.println(N + " is a composite number");
//         }else{
//             System.out.println(N + " is not a composite number");
//         }

//     }
// }


//14)-----------automarphic number ------the squate of this num will ends with this num itself


// class f3{

//     public static void main(String[] arts){

//         int N=25;
//         int comp=N;
//         int sque=N*N;
//          int count1=0;
//          int count2=0;
       
//          while(comp!=0){
//           count1++;
//           comp=comp/10;
//         }

//         while(N!=0){
            
//            int Ncomp=N%10;
//            int squecom=sque%10;
//             if(Ncomp==squecom){
//                 count2++;
//             }
//             N=N/10;
//             sque=sque/10;
   
//         }
   
//          if(count1==count2){
//             System.out.println("number is automorphic");
//          }else{
//             System.out.println("number is not automorphic");
//          }
//     }


// }



//15)-------------strong number-----145=1!+4!+5! =145----------

// class p3{
//     public static void main(String[] args){

//         int N=145;
//         int temp=N;
//         int sum=0;
//         while(N!=0){

//             int comp=N%10;
//             int fac=1;
//             for(int i=comp;i>=1;i--){
//                 fac=fac*i;
//             }
//            sum=sum+fac;
//            N=N/10;
//         }
      
//         if(temp==sum){
          
//             System.out.println(temp + " is a strong number");
//         }else{
//             System.out.println(temp + " is not a storng number");
//         }

//     }
// }

//16)-----------scope of variable---------

// class Demo{

//     public static void main(String[] args){
             
//         {
//             int x=10;
//              x=20;
//             System.out.println(x);
//         }

//         {
//             int x=20;
//             System.out.println(x);
//         }

//     }
// }

//----------------------Break and Continue-------------

// class f3{

//     public static void main(String[] args){
    
//         int N=96;
//         int count=0;
//         int etteration1=0;
//         for(int i=1;i<=N;i++){
         
//             if(N%i==0){
//                 count++;
//             }
//            etteration1++;
//            if(count>2){
//             break;
//            }
//         }
//         if(count==2){
//             System.out.println(N + " is prime number");
//         }else{
//             System.out.println(N + " is not an prime number");
//         }
//      System.out.println(etteration1);
//     }
// }


//----------divisible by 3 and 5

// class f3{

//     public static void main(String[] args){

//         int N=40;
//         int count=0;
//         for(int i=1;i<=N;i++){

//             if(i%3==0 & i%5==0){
//                 System.out.println(i + " is divisible by both 3 and 5");
//                 break;
//             }
//             count++;
//         }
//         System.out.println(count);
//     }
// }

//------divisible by 3 & 5 or 4-------

// class f3{
//     public static void main(String[] args){

//         int N=50;
        
//         for(int i=1;i<=N;i++){

//             if(i%3==0 && i%5==0 || i%4==0){
//                 System.out.println(i+" divisible");
//                 break;
//             }
        
//         }


//     }
// }


