
//OOP consept


//Inheritance

//1)
// class ICC{

//     ICC(){
        
//         System.out.println("In ICC Constructor");
//     }

    
// }

// class BCCI extends ICC{

//     BCCI(){
    
//         System.out.println("in BCCI Constructor");
//     }
//     void fun(){

//     }
// }

// class Client{

//     public static void main(String[] args) {
        
//         BCCI jayShah=new BCCI();
        

//     }
// }



//2)--------------------------


// class Parent{

//     int x=10;
//     Parent(){
//         System.out.println("In parent constructor");
//     }

//     void fun(){
//         System.out.println("in parent fun");
//     }
// }

// class Child extends Parent{

//     int y=20;
//     Child(){

//         System.out.println("in child const");
//         fun();
//         System.out.println(x);
//         System.out.println(y);
//     }

// }
// class Client{

//     public static void main(String[] args) {
        
//         Child obj=new Child();

       
//     }
// }

//3)----------all static variable and methods of parent is inherit in the child class -


// class parent{

//     static int x=10;

//     static void acess(){

//         System.out.println("in parent static fun");
//     }
//     static{

//         System.out.println("In static block of parent");
//     }
// }

// class Child extends parent{



//     static{

        
//         System.out.println("in static block of child");
//         System.out.println(x);
//         acess();

//     }
 
// }

// class Client{

//     public static void main(String[] args) {
        
//         Child obj=new Child();


//     }
// }

//4)------------------


// class parent{

//     static int x=10;
//     int y=20;



//     static{

//         System.out.println("In static block of parent");
//     }
 
//     parent(){
//         System.out.println("in parent constructor");
//     }
//     void acessone(){

//         System.out.println("in parent acessone");
//     }
//    static void acesstwo(){

//         System.out.println("in parent static acesstwo");
//     }
// }

// class Child extends parent{



//     static{

//         System.out.println("in static block of child");
        
//      }
 
// }

// class Client{

//     public static void main(String[] args) {
        
//         Child obj=new Child();

//         obj.acesstwo();
//         obj.acessone();

//     }
// }

//5)------------
// class parent{

//    // private int z=10;  //private instance of parent is not inherite in the child class
//     int x=10;
//     static int y=20;

//     parent(){
//         System.out.println("in parent constructor");
//     }
// }

// class Child extends parent{

//     int x=100;
//     static int y=200;

//     Child(){
//         System.out.println("in child constructor");
//     }

//     void acess(){

//         System.out.println(super.x);
//         System.out.println(super.y);
//         System.out.println(x);
//         System.out.println(y);
//         // System.out.println(z);
//     }

// }

// class Client{

//     public static void main(String[] args) {
        
//         Child obj=new Child();
//         obj.acess();
//     }
// }

//6)-------polymorphism----------------

//1)overloading

// class p13{

//     void fun(int x){
//         System.out.println(x);
//     }

    
//     void fun(float x){
//         System.out.println(x);
//     }

    
//     void fun(char x){
//         System.out.println(x);
//     }

    
//     void fun(String x){
//         System.out.println(x);
//     }

//     public static void main(String[] args) {

//         p13 obj=new p13();
//        obj.fun(10);
//        obj.fun("vinit");
//        obj.fun(12.4f);
//        obj.fun('A');
        
        
//     }
// }

//7) ------Overriding-----

// 1)

// class parent{

//     parent(){
//         System.out.println("in parent const");
//     }

//     private void marry(){
//         System.out.println("sakshi");
//     }

//      void property(){
//         System.out.println("home,car,money");
//     }
// }

// class child extends parent{

//     child(){
//         System.out.println("in child const");
//     }
//      void marry(){ //we can increase the scope of overriden method not to be decrease(here private->default)
       
//         System.out.println("mrunali");
    
//     }


// }

// class p13{

//     public static void main(String[] args) {
        
//         child obj=new child();

//         obj.marry();
//         obj.property();
//     }

// }


//8)
//2)----------

// class parent{

//     parent(){
//         System.out.println("in parent const");
//     }
    
//     void gun(){
//         System.out.println("in parent fun");
//     }

  
// }

// class child extends parent{

//     child(){
//         System.out.println("in child const");
//     }
//     void fun(){
//         System.out.println("in child fun");
//     }


// }

// class p13{

//     public static void main(String[] args) {
        
//         child obj1=new child();
//          obj1.fun();
//         obj1.gun();

        
//         parent obj2=new parent();
        
//         obj2.gun();
//        // obj2.fun(); //give the error reverse flow is not possible(method table is work here)
//     }

// }

//9)
//3)-----------

// class parent{

//     parent(){
//         System.out.println("in parent const");
//     }
    
//     void gun(){
//         System.out.println("in parent fun");
//     }

  
// }

// class child extends parent{

//     child(){
//         System.out.println("in child const");
//     }
//     void fun(){
//         System.out.println("in child fun");
//     }

    

// }

// class p13{

//     public static void main(String[] args) {

//         parent obj1=new child();

//        //child obj2=new parent(); // give the error parent object and child refference is not possible 

//        // obj1.fun(); //give the error because gun will be inherite in child bur fun is not present in parent
//          obj1.gun();
      
//     }

// }

//10)------IMP--------------------

// class parent{

//     parent(){
//         System.out.println("in parent const");
//     }
    
//     void gun(int x){
//         System.out.println("in parent gun");
//     }

  
// }

// class child extends parent{

//     child(){
//         System.out.println("in child const");
//     }
//     void fun(){
//         System.out.println("in child fun");
    
//     }

//     void gun(int x,int y){
//         System.out.println("override gun method in child");
        
//      // return 0;
//     }
    

// }

// class p13{

//     public static void main(String[] args) {

//         child obj1=new child();

       
//          obj1.gun(1,2);
      
//     }

// }

//11)--------modifier (final)--------------

// class Parent{
    
// final void fun(){ //same as a private final  do not inherite in child
//         System.out.println("in parent fun");
//     }
// }

// class Child extends Parent{

//     void fun(){
//         System.out.println("in parent fun");
//     }
    

// }

// class p13{

//     public static void main(String[] args) {
        
//         Child obj=new Child();
//         obj.fun();

//     }
// }


//12)------static modifier-------------


// class Parent{

//     static void fun(){
//         System.out.println("In static modifier fun");
//     }

// }

// class Child extends Parent{


// }

// class p13{

//     public static void main(String[] args) {
        
//         Child.fun(); //we can call the inherit static fun using the class name child

//     }
// }


// class Match{

//     void MatchType(){
//         System.out.println("IPL/T20/test/oneday");
//     }
    

// }

// class IPLMatch extends Match{

//     void MatchType(){
//         System.out.println("IPL");
//     }

// }

// class T20Match extends Match{

//     void MatchType(){
//         System.out.println("T20");
//     }

// }

// class p13{

//     public static void main(String[] args) {
        
//         Match obj1=new IPLMatch();
//         obj1.MatchType();

//        Match obj2=new T20Match();
//        obj2.MatchType();

//     }
// }

//13)--------------------------------


// class Demo{

//     void fun(String str1){
//         System.out.println(str1);
//     }
//      void fun(StringBuffer str1){
//         System.out.println(str1);
//     }
    

// }


// class p13{

//     public static void main(String[] args) {
   
//   Demo obj=new Demo();

// //   String str1="vinit";v  
// //   StringBuffer str2=new StringBuffer("rajput");

//   obj.fun("vinit");
//   obj.fun(new StringBuffer("rajput"));

//     }
// }

//14)------------------------


// class Demo{

//     void fun(Object obj){
//         System.out.println("object");
//     }
//     void fun(String str1){
//         System.out.println("String");
//     }
  
    

// }


// class p13{

//     public static void main(String[] args) {
   
//   Demo obj=new Demo();


//   obj.fun("vinit");
//   obj.fun(new StringBuffer("rajput"));
//   obj.fun(null);

//     }
// }


//14)--------------overriding ------ run on terminal only

// class Parent{

//     float fun(){
//         System.out.println("in parent fun");
//       //  return new Object();
// 	return 0f;
//     }

// }

// class Child extends Parent{

//     int fun(){

//         System.out.println("in child fun");
//         return 0;
//     }

// }

// class p13{

//     public static void main(String[] args) {
        
//         Child obj=new Child();
//         obj.fun();

//     }
// }


//15-------method hiding--------------

// class Parent{

//     static void fun(){
//         System.out.println("in parent fun");
//     }
// }

// class Child extends Parent{

//    static void fun(){
//         System.out.println("in child fun");
//     }

//     // void gun(){
//     //     System.out.println("in child fun");
//     // }
// }

// class Client{

//     public static void main(String[] args) {
        
//         Parent obj1=new Child();
//          obj1.fun();
//         //obj.gun();

//         Child obj2=new Child();
//         obj2.fun();

//         Parent obj3=new Parent();
//         obj3.fun();
    
//     }
// }

//16)---------------------
