// Exception


//1]-------------------------

//NumberFormatException
//expection the int and we give them the string
// import java.io.*;

// class Demo{

//     public static void main(String[] args)throws IOException{
        
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("enter the number: ");
//         int i=Integer.parseInt(br.readLine());
//         System.out.println(i);
//     }
// }


//2]-----------------------
//ArrayIndexOutOfBoundsException
// class Demo{

//     public static void main(String[] args) {
        
//         int arr[]=new int[]{1,2,3,4,5};

//         for(int i=0;i<=arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


//3]---------------------

//ArithmeticException
// class Dmeo{

//     void fun(int num){

//         System.out.println(num/0);
//     }

// }

// class Client{

//     public static void main(String[] args) {
        
//         Dmeo obj=new Dmeo();

//         obj.fun(2);

//     }
// }

//4]----------------------
//NullPointerException


// class Demo{

//     void fun(){
//         System.out.println("in Demo fun");
//     }

//     void gun(){
//         System.out.println("in Demo gun");
//     }
// }

// class Client{

//     public static void main(String[] args) {
        
//         Demo obj1=new Demo();
//         obj1.fun();
//         System.out.println(obj1.toString());
//         obj1.printStackTrace();
//          //obj1=null;
//        // obj1.gun();

//     }
// }


//5]-------------------------

//exception handel using try catch and finally


// class Demo{

//     public static void main(String[] args) {
        
//         System.out.println("start main");

//         try{
//         System.out.println(10/0);
//         }catch(ArithmeticException obj){

//             System.out.println("exception catch");
//         }
//     }
// }


//6]---------------
//we can put mutiple catch but only one try block
// class Demo{

//     public static void main(String[] args) {
        
//         int arr[]=new int[]{1,2,3,4,5};

//     try{
//         for(int i=0;i<=arr.length;i++){
//             System.out.println(arr[i]);
//         }
//       }catch(ArrayIndexOutOfBoundsException obj){

//         System.out.println("array exception handle");
//       }catch(Exception obj1){

//         System.out.println("in second catch");
//       }
//     }
// }

//7]------------------


//finally


// import java.io.*;
// class ExceptionDemo{

//     public static void main(String[] args)throws IOException{
       
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


//         System.out.print("inter the integer: ");
//     try{
//         int i=Integer.parseInt(br.readLine());
//     }catch(NumberFormatException obj){
//         System.out.println("number format exception handle");
//        }catch(NullPointerException obj){

//           System.out.println("in excepiton");
//        }finally{
//         System.out.println("in finally box");
//        }

//     }
// }

//8]--------------

//User Define Exception

// import java.util.*;
// class ExcptionDemo{

//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);

//         System.out.println("enter the number: ");
//         int i=sc.nextInt();
   
//         try{

//             if(i==0){
//                 throw new ArithmeticException("supries supries mother fuker :)");
//             }
//             System.out.println(10/i);
//         }catch(ArithmeticException obj){

//             System.out.print("Exception in thread main"+ Thread.currentThread().getName()+" "); //gives the name of current thread
//             obj.printStackTrace();  //give the stracktrace(num of line where error occures and many more))
//         }finally{
//             System.out.println("in finaly");
//         }
   
//     }

// }



//9]---------------

// import java.io.*;
// class userDefineException{

//     public static void main(String[] args)throws IOException{
        
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter the size of array: ");
//         int x=Integer.parseInt(br.readLine());

//         int arr[]=new int[x];

//         System.out.println("Enter the elements of array");
//         for(int i=0;i<arr.length;i++){

//             int data=Integer.parseInt(br.readLine());
                  
//             if(data>100){
//                 throw new NullPointerException("datat is grater than hundread aahe bhava");
//             }else if(data<0){

//                 throw new NullPointerException("data is less than zero aahe bhava");
//             }
        
//              arr[i]=data;
//         }
//     }
// }


//10]------------

// import java.io.*;

// class userDefineException{

//     public static void main(String[] args)throws IOException{
        
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter the size of array: ");
//         int x=Integer.parseInt(br.readLine());

//         int arr[]=new int[x];

//         System.out.println("Enter the elements of array");
//         for(int i=0;i<arr.length;i++){

//             int data=Integer.parseInt(br.readLine());
             
//        try{     
//             if(data>100){
//                 throw new NullPointerException("datat is grater than hundread aahe bhava");
//             }else if(data<0){

//                 throw new NullPointerException("data is less than zero aahe bhava");
//             }
//         }catch(NullPointerException obj){

            
//            // System.out.println("Exception in thread " + Thread.currentThread().getName());
//            obj.setStackTrace(null);
//         }

            
//             arr[i]=data;
//         }
//     }
// }




//11]throw exception by our own exception type----------------


// import java.util.*;

// class NotElegibleExecption extends RuntimeException{

//     NotElegibleExecption(String str){

//         super(str);
//     }

// }
// class CollegeAdmition{


//     public static void main(String[] args) {
        
//         Scanner sc =new Scanner(System.in);

//         System.out.println("enter the CET marks: ");
//         int marks=sc.nextInt();

//         if(marks<95){
//             throw new NotElegibleExecption("you are not elegible for this college");
//         }
//     }
// }







