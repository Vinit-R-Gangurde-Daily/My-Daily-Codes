

// class p7 {
//     public static void main(String[] args) {
    
//         p7 obj=new p7();
//         obj.fun();
//            gun();
//     }

//     void fun(){
//         System.out.println("I am in fun");
//     }

//    static void gun(){
//         System.out.println("I am in gun");
//     }

// }


// ---------------

// class p7{

//   static int a=10;
//    int b=20;
//     static void fun(){
//         System.out.println("In fun static method");
//     }
    
//     void gun(){
//         System.out.println("In gun non static method");
//     }

//     public static void main(String[] args) {

//         fun();
//         System.out.println(a);

//         p7 obj=new p7();
        
        
//         obj.gun();
//         System.out.println(obj.b);

//     }
// }


//-------------------------

// class f7{
    
//     int a=10;
//     static int b=20;

//     void fun(){

//         System.out.println("In non static fun");
//         gun();
//         run();
//     }
//     static void gun(){
//         System.out.println("In static gun");
//     }

//     void run(){
//         System.out.println("In non static run");
//     }
    
    
//     public static void main(String[] args) {
        
//         f7 obj=new f7();
//         obj.fun();
        
//     }
// }


//--------------passing a parameters to method------------

// import java.io.*;
// class p7{


//     static void fun(int a,int b){

//         int ans=a+b;
//         System.out.print(ans);
    
//     }

//     public static void main(String[] args)throws IOException{
        
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
//         System.out.print("Enter the number: ");
//         int a=Integer.parseInt(br.readLine());
//         int b=Integer.parseInt(br.readLine());

//        fun(a,b);

//     }
// }



//------------------------

// import java.util.Scanner;
// class f7{
    
//      void addi(int a,int b){
//         System.out.println(a+b);
//     }

//     static void multi(int a,int b){
//         System.out.println(a*b);
//     }

//     static void subi(int a,int b){
//         System.out.println(a-b);
//     }
//     public static void main(String[] args) {


//         Scanner sc=new Scanner(System.in);

//         f7 obj=new f7();

//         System.out.println("Enter the number: ");

//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         obj.addi(a,b);
//         multi(a,b);
//         subi(a,b);
        
//     }
// }


//------------------------------------
// class f7{

//     static void fun(int a,int b){
//         System.out.println(a+b);
//     }

//     static void fun(int a){
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
                      
//         fun(1,3);

//         fun(3f);
//     }

    
// }

//---------------NO Loss of data------------------

// class f7{
    
//     static void fun(float a){

//         System.out.println(a);

//     }
//     public static void main(String[] args) {
        
        
//         f7 obj=new f7();
        
//         obj.fun(2);
//         obj.fun('A');
//         obj.fun(3.3f);
//        // obj.fun(10.5);
//        // obj.fun(True);

//     }
// }


//---------------return value of funtion----------------


class f7{

    int fun(int a,int b){

        return a+b;
    }

    void gun(int a,int b){

        System.out.println(a+b);
    }
    public static void main(String[] args){

        f7 obj=new f7();
           
        int val=obj.fun(4,5);
        System.out.println(val);
          System.out.print(obj.fun(4,5));

          //int val2=obj.gun(3,4); //void do not return any thing
         // System.out.println(obj.gun(2,3));
        
      
    }
}