
// Abstract class



//1)-----we can not create the object of abstact class-----------
// abstract class Parent{

//     void Carrer(){
//         System.out.println("Docter");
//     }

//     abstract void marry();

// }

// class p14 {

//     public static void main(String[] args) {
//       Parent obj=new Parent();  
//       obj.marry();

//     }
    
// }

//2)---------------------

//  abstract class parent{

//     void Carrer(){
//         System.out.println("Doctor");
//     }

//     abstract void marry();

// } 

// class Child extends parent{
            
// 	void marry(){
	
// 		System.out.println("mrunaly");
// 	}

// }

// class p14{

//     public static void main(String[] args) {

// 	    Child obj=new Child();
// 	    obj.marry();
// 	    obj.Carrer();
        
//     }
// }


//3)----------child class is has to give the body to parents abstract method----------------


// abstract class parent{

//     void Carrer(){
//         System.out.println("Doctor");
//     }

//     abstract void marry();

// } 

// abstract class Child extends parent{
            
// 	// void marry(){
	
// 	// 	System.out.println("mrunaly");
// 	// }

// }

// class p14{

//     public static void main(String[] args) {

// 	    Child obj=new Child();
// 	    obj.marry();
// 	    obj.Carrer();
        
//     }
// }


//4)Interface-------------------



// interface Demo{

//     void fun();
//     void gun();
// }

// class DemoChild implements Demo{

//    public void fun(){

//         System.out.println("in fun Demochild");
        
//     }

//     public void gun(){
//         System.out.println("in gun Demochild");
//     }

// }

// class Client{

//     public static void main(String[] args) {

//         DemoChild obj=new DemoChild();
//         obj.fun();
//         obj.gun();

//     }
// }

//5)--------------

// interface Demo{
//     void fun();
//     void gun();
// }

// abstract class DemoChild implements Demo{

//    public void fun(){
//         System.out.println("in Demochild fun");
//     }

// }

// class DemoChild1 extends DemoChild{

//     public void gun(){
//         System.out.println("in DemoChild1 gun");
//     }
// }

// class p14{

//     public static void main(String[] args) {
        
//   //       DemoChild obj1=new DemoChild();
            
// 	   DemoChild1 obj2=new DemoChild1(); 
// 	    obj2.fun();
//             obj2.gun();

//          // Demo obj3=new Demo(); //we do not create the object of interface
//     }
// }


//6)multipal inheritance in java--------------


// interface Demo1{

//     void fun();
// }

// // interface Demo2{
     
// //     void fun();

// // }

// class DemoChild implements Demo1{

//    public void fun(){

//         System.out.println("in DemoOverride");
//     }

// }

// class p14{

//     public static void main(String[] args) {
        

//         DemoChild obj1=new DemoChild();
//         obj1.fun();

//         Demo1 obj2=new DemoChild();
//         obj2.fun();
//     }
// }

//7)------------------


// interface Demo1{

//     void fun();
// }

// interface Demo2{

//     void gun();
// }

// interface Demo3{

//     void run();
// }

// interface Demo4 extends Demo1,Demo2,Demo3{

//     void bun();
// }

// class DemoChild implements Demo4{

//    public void fun(){

//         System.out.println("in fun");
//     }
//     public void gun(){

//         System.out.println("in gun");
//     }
//     public void run(){

//         System.out.println("in run");
//     }

//     public void bun(){

//         System.out.println("in bun");
//     }
// }

// class p14{

//     public static void main(String[] args) {
        
//         DemoChild obj=new DemoChild();

//         obj.fun();
//         obj.gun();
//         obj.run();
//         obj.bun();

//     }
// }

//8)give the body to method in interface--------------

// interface Demo1{

//     void fun();

//    default void gun(){
//         System.out.println("in interface fun method body");
//     }
// }
// class child implements Demo1{

//     public void fun(){

//         System.out.println("in child body");
//     }
    
// }

// class p14{

//     public static void main(String[] args) {
        
//         child obj=new child();
//         obj.fun();
//         obj.gun();
       
//     }
// }




//9]we can also override this interface method in child-----------------------------

// interface Demo1{

   

//    default void gun(){
//         System.out.println("in interface fun method body");
//     }
// }
// class child implements Demo1{

//     public void gun(){

//         System.out.println("overrideing the interface default body method");
//     }
    
// }

// class p14{

//     public static void main(String[] args) {
        
//         child obj=new child();
        
//         obj.gun();
       
//     }
// }

//10]-------------------------------


// interface Demo1{

   

//     default void gun(){
//          System.out.println("in gun Demo1");
//      }
//  }
 
//  interface Demo2{

   

//     default void gun(){
//          System.out.println("in gun Demo2");
//      }
//  }
 
 
//  class child implements Demo1,Demo2{
 
//      public void gun(){
 
//          System.out.println("in gun child");
//      }
     
//  }
 
//  class p14{
 
//      public static void main(String[] args) {
         
//          child obj1=new child();
//          obj1.gun();

//          Demo1 obj2=new child();
//          obj2.gun();

//          Demo2 obj3=new child();
//          obj3.gun();
        
//      }
//  }




//11]------------------------

// class parent{

//      static void fun(){
//         System.out.println("in static fun parent");
//     }
// }

// class child extends parent{

//     static void fun(){
//         System.out.println("in child fun");
//     }
// }

// class p14{

//     public static void main(String[] args) {
        
//         child obj1=new child();
//         obj1.fun();

//         parent obj2=new child();
//         obj2.fun();

//     }
// }

//12]--------------

// interface Demo1{
 
//     default void fun(){
//         System.out.println("in fun Demo1");
//     }
// }

// interface Demo2{

//      default void fun(){
//          System.out.println("in Demo2 fun");
//      }
// }

// class Child implements Demo1,Demo2{
    

// }

// class p14{

//     public static void main(String[] args) {
//         Child obj=new Child();
        
//     }
// }

//13)like a interface we do not able to extends the more than one class for child class ------------------------------

// class parent1{
//     void fun(){
//         System.out.println("in parent1");
//     }
// }

// class parent2{
//     void fun(){
//         System.out.println("in parent2");
//     }
// }

// class Child extends parent1,parent2{


// }


// class Clinet{

//     public static void main(String[] args) {
        
//         Child obj=new Child();
        

//     }
// }


//15]-----------------------------
  //1(in class static method will inherite)

// class Demo{

//     static void fun(){
//         System.out.println("in Demo");
//     }
// }

// class Child extends Demo{


// }

// class p14{
//     public static void main(String[] args) {
//         Child obj=new Child();  
//         obj.fun();
//     }
// }


//2(in interface static method is not inherit give the error)

// interface Demo{

//     static void fun(){
//         System.out.println("in Demo");
//     }
// }

// class Child implements Demo{


// }

// class p14{
//     public static void main(String[] args) {
//         Child obj=new Child();  
//         obj.fun();
//     }
// }

//16]-----------------------------------------------

// interface Demo1{
//     static void fun(){
//         System.out.println("in static fun Demo1");


//     }
// }

// interface Demo2{

//     static void fun(){
//         System.out.println("in static fun Demo2");
//     }
// }


// class Child implements Demo1,Demo2{

//     void fun(){

//         System.out.println("in child");
//         Demo1.fun();
//         Demo2.fun();
//     }

// }
// class p14{

//     public static void main(String[] args) {
        
//        Child obj=new Child();
//        obj.fun();
//     }
    
// }

//17]variables in interface--------------------------

interface Demo1{

    int x=10; //public static final x

    void fun(); //public abstract void fun();
}

class Child implements Demo1{
          int x=20;
    public void fun(){

        System.out.println("in fun");
        System.out.println(x);
        System.out.println(Demo1.x);
    } 
}

class Client{

    public static void main(String[] args) {
        
        Child obj=new Child();

        System.out.println(Demo1.x);
        obj.fun();
    }
}
