
//inner class

//1]
//1)Normal inner class


// class Outer {

//     class Inner{

//         void m1(){
//             System.out.println("in inner class m1");
//         }
//     }

//     void m2(){
//         System.out.println("in outer class m2");
//     }
    
// }

// class p15{

//     public static void main(String[] args) {
        
//         Outer obj1=new Outer();
//         obj1.m2();
        
//         Outer.Inner obj2=obj1.new Inner();
//         obj2.m1();
        
//         Outer.Inner obj3=new Outer().new Inner();
//         obj3.m1();
//     }
// }

//2]------------------------------

// class Outer{

//     class Inner{

//         void m1(){
//             System.out.println("in m1 inner");
//         }
//     }

//     void m2(){
//         System.out.println("in m2 outer");
//     }

//     public static void main(String[] args) {
        
	    
//         Inner obj1=new Outer().new Inner();
//         obj1.m1();
    
//     }
// }


//3]--------------------------
//2]Method local inner class

// class Outer{

//     void fun(){

//         System.out.println("in Outer class fun method");

//         class Inner{

//             void gun(){

//                 System.out.println("in inner class gun method");
//          }
//         }

// 	Inner obj2=new Inner();
// 	obj2.gun();
//     }


//     public static void main(String[] args) {
        
            
// 	    Outer obj1=new Outer();
// 	    obj1.fun();
        
	    

// 	    //Inner obj2=obj1.fun().new Inner();

//     }
// }


//4]------we can return the object but it will give the error at the time of call the method---------------

// class Outer{

//     Object fun(){
             
// 	    System.out.println("in fun");
        
// 	class Inner{
            
// 		void m1(){

//                 System.out.println("in inner m1");
//             }
//         }
       


         
//     return new Inner();
//     }
//     public static void main(String[] args) {
        
   
//         Outer obj1=new Outer();

	
//        Object val=obj1.fun(); //give the error
//        obj1.val.m1();
//     }
// }


//5]--------------------------
//3]Static Inner class

// class Outer{

//     void m1(){
//         System.out.println("in Outer m1");
//     }

//     static class Inner{
        
//         void m1(){
//             System.out.println("in Inner m1");
//         }

//     }
//     public static void main(String[] args) {
        
//        Outer obj2=new Outer();
//        obj2.m1();

//        Outer.Inner obj1=new Outer.Inner();
//         obj1.m1();

//     }
// }


//6]--------------------------------------

// class Parent{

//     String str="vinit";
//     static int x=10;
//     int y=20;
//     Parent(){
//         System.out.println("in parent constructor");
//     }

//     void m1(){

//         System.out.println("in parent m1");
//     }

//     static void m2(){

//         System.out.println("in parent m2");
//     }

// }

// class Child extends Parent{

//     Child(){
//         System.out.println("in child Constructor");
//     }

//     void m1(){
//         System.out.println("in child m1");
//     }

//     static void m2(){

//       System.out.println("in child m2");
//     }
// }

// class Client{

//     public static void main(String[] args) {
        
//         Parent obj1=new Parent();
//         obj1.m1();
//         obj1.m2();

//         Child obj2=new Child();
//         obj2.m1();
//         obj2.m2();

//         Parent obj3=new Child();
//         obj3.m1();
//         obj3.m2(); 
//     }
// }

//
//7]-------------------------


// class Outer{

//     int x=10;
//     static int y=20;

//     class Inner{

//         int x=100;
//        static int b=200; //vs code do not get error

//         void fun(){
             
//             System.out.println("in inner class fun");
//             System.out.println(x);
//             System.out.println(y);
            
//         }

       
//     }
   
//     void fun(){

	    
       
//         System.out.println("in Outer fun");
//         System.out.println(x);
//         System.out.println(y);
//     }


//     public static void main(String[] args) {
        
//      Inner obj1=new Outer().new Inner();
//      obj1.fun();

//      Outer obj2=new Outer();
//      obj2.fun();
//     }
// }

//8]-----------------------
//Annonymous Inner class


// class Demo{

//     void marry(){
//         System.out.println("kushi");
//     }
// }

// class Client{
//     public static void main(String[] args) {
        
//         Demo obj1=new Demo(){

//             void marry(){

//                 System.out.println("mrunali");
//             }
//         };
//         obj1.marry();
//     }
// }


