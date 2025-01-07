
//Collections

//javap java.util.ArrayList(use to see inbuild collections method)
//1]----------------------------------

//1]List

//1.1]ArrayList

//Array list is Dyanamic means the size of array list is fraxible
//we can put any type of data in array

// import java.util.*;
// class DemoArrayList{

//     public static void main(String[] args) {
        
//         ArrayList obj1=new ArrayList();
   
//         obj1.add(10);
//         obj1.add(20.4f);
//         obj1.add("vinit");
//         obj1.add(10);

//         System.out.println(obj1);

//         //public int size();
//          System.out.println(obj1.size());
        
//          // public boolean isEmpty();
//         System.out.println(obj1.isEmpty());

//         // public boolean contains(java.lang.Object);
//          System.out.println(obj1.contains("vinit"));

//         // public int indexOf(java.lang.Object);
//         System.out.println(obj1.indexOf("vinit"));
     
//         // public int lastIndexOf(java.lang.Object);
//          System.out.println(obj1.lastIndexOf(10));

//         //  public E get(int);
//           System.out.println(obj1.get(1));

//         //  public E set(int, E);
//           System.out.println(obj1.set(2,"uday"));
//           System.out.println(obj1);

//         //   public void add(int, E);
//            obj1.add(2,"vinit");
//            System.out.println(obj1);

//         //   public E remove(int);
//           System.out.println(obj1.remove(2));
//           System.out.println(obj1);

//         //   public void clear();
//         //   obj1.clear();
//         //   System.out.println(obj1);

//         //   public boolean addAll(java.util.Collection<? extends E>);
//                ArrayList obj2=new ArrayList();
//                obj2.add("pratik");
//                obj2.add(23.4f);
//                obj2.add(50);
//                obj2.add(60);

//             //    System.out.println(obj1.addAll(obj2));
//             //    System.out.println(obj1);
               

//             //   public boolean addAll(int, java.util.Collection<? extends E>);
//             System.out.println(obj1);
//             System.out.println(obj1.addAll(2,obj2));
//             System.out.println(obj1);
                  
//         //   protected void removeRange(int, int);
//             //    obj2.removeRange(2,4);
//             //    System.out.println(obj1);          
    
            
            
//         // convert arraylist to array
//             Object arr[]=obj1.toArray();

//             for(Object data : arr){
//                 System.out.print(data);
//             }
//     }

    
// }


//2]---------------------------

// import java.util.*;
// class CricketPlayer{

//     String name=null;
//     int jerNo=0;
//     CricketPlayer(String name,int jerNo){
//         this.name=name;
//         this.jerNo=jerNo;
//     }

//     public String toString(){

//         return name + " " + jerNo; 
//     }

// }

// class ArrayListDemo{

//     public static void main(String[] args) {
        
//         ArrayList obj1=new ArrayList();

//         obj1.add(new CricketPlayer("virat", 9));
//         obj1.add(new CricketPlayer("rohit", 17));
//         obj1.add(new CricketPlayer("KLRahul", 1));

//         System.out.println(obj1);

//     }
// }


//3]-------------------------------------
//1.2]Link list
//we can add a different type of data

// import java.util.*;

// class LinkListDemo{

    
//     public static void main(String[] args) {
        
//         LinkedList ll=new LinkedList();



//         //   1]public void addFirst(E);
//            ll.addFirst(23);
//            ll.addFirst("vinit");
        
//            //   2]public void addLast(E);
//             ll.addLast(35.3f);

//            System.out.println(ll);
        
//            //   3]public E getFirst();
//          System.out.println(ll.getFirst());

//          //   4]public E getLast();
//          System.out.println(ll.getLast());

//          //   5]public E removeFirst();
//          System.out.println(ll.removeFirst());
//          System.out.println(ll);

//          //   public E removeLast();
//          System.out.println(ll.removeLast());
//          System.out.println(ll);

// //   public boolean contains(java.lang.Object);
//      System.out.println(ll.contains(23));

// //   public int size();
//       System.out.println(ll.size());

// //   public boolean add(E);
//     System.out.println(ll.add("uday"));
//     System.out.println(ll);

// //   public boolean remove(java.lang.Object);
//     System.out.println(ll.remove(0));
//     System.out.println(ll);

// //   public boolean addAll(java.util.Collection<? extends E>);
//          ArrayList arrobj=new ArrayList<>();
//          arrobj.add("rahul");
//          arrobj.add(34.4f);
//          arrobj.add(23);

//         //  System.out.println(ll.addAll(arrobj));
//         //  System.out.println(ll);

// //   public boolean addAll(int, java.util.Collection<? extends E>);

//             System.out.println(ll.addAll(0,arrobj));
//             System.out.println(ll);

//     }
// }


//4]-------------------------

// import java.util.*;
// class CricketPlayer{
//     String name=null;
//     int jerNO=0;
    
//     CricketPlayer(String name,int jerNO){

//         this.name=name;
//         this.jerNO=jerNO;

//     }

//     public String toString(){

//         return name + " " + jerNO;
//     }


// }

// class LinkListDemo{

//     public static void main(String[] args) {
                
//         LinkedList ll=new LinkedList();

//         ll.add(new CricketPlayer("Rohit", 7));
//         ll.add(new CricketPlayer("virat", 17));
//         ll.add(new CricketPlayer("klRahul", 1));

//         System.out.println(ll);
        
         
//     }
// }

//4]-----don do this----------------------------------------

//Cursor
//Cursor is use for iterat over the list,Queue & stack
//iterator
//travels over only one diraction,do not reverse


// import java.util.*;

// class IteratorDemo{

//     public static void main(String[] args) {
        
//         ArrayList Ar=new ArrayList();

//         Ar.add("vinit");
//         Ar.add("uday");
//         Ar.add(34);
//         Ar.add(34.3f);

//         Iterator it=Ar.iterator();

//         // public abstract boolean hasNext();
//         // public abstract E next();
//         // public default void remove();

//         System.out.println(Ar);
//         while(it.hasNext()){

//            // System.out.println(it.next());

//             if(it.next()=="vinit"){
//                  it.remove();
//             }
        
//         }
//         System.out.println(Ar);
//     }


// }

//5]---------------------------
//1.3]vector
//vector is Synchronized it means only one thread will exicute this vector code 

// import java.util.Stack;
// import java.util.Vector;

// class VectorDemo{
//     public static void main(String[] args) {
        
//         Vector V=new Vector<>();

//         V.addElement(23);
//         V.addElement("vinit");
//         V.addElement(54.3f);
//         V.addElement(34);

//         System.out.println(V);

//         //all this are the method is vector
        
// //         public synchronized int indexOf(java.lang.Object, int);
// //   public synchronized int lastIndexOf(java.lang.Object);
// //   public synchronized int lastIndexOf(java.lang.Object, int);
// //   public synchronized E elementAt(int);
// //   public synchronized E firstElement();
// //   public synchronized E lastElement();
// //   public synchronized void setElementAt(E, int);
// //   public synchronized void removeElementAt(int);
// //   public synchronized void insertElementAt(E, int);
// //   public synchronized void addElement(E);
// //   public synchronized boolean removeElement(java.lang.Object);


//     }
// }

//6]----------------------------
//1.4]Stack
//last in first out
//only fue method push pop peek
//read and write operation will take palce on top of stack only

// import java.util.*;
// class StackDemo{

//     public static void main(String[] args) {
        
//         Stack St=new Stack();

//            // public E push(E);
//                St.push(10);
//                St.push(20);
//                St.push("vinit");
//                St.push("uday");
//                St.push(23.5f);

//                System.out.println(St);

//             // public synchronized E pop();
//             System.out.println(St.pop());
//             System.out.println(St);

//              // public synchronized E peek();
//              System.out.println(St.peek());
//              System.out.println(St);

//              //// public boolean empty();
//              System.out.println(St.empty());

//         // public java.util.Stack();
    
//         // public synchronized int search(java.lang.Object);
//         System.out.println(St);
//         System.out.println(St.search(20));
//     }
// }


//7]---------------


// //2]Set
// //2.1]hashSet
// //do not allow the dublicate values
// //no sequence

// import java.util.*;
// class HashSetDemo{

//     public static void main(String[] args) {
        
//         HashSet HS=new HashSet<>();

//         HS.add("Kanha");
//         HS.add("uday");
//         HS.add("rahul");
//         HS.add("Bade");
        
//         System.out.println(HS);

//         // public int size();
//         // public boolean isEmpty();
//         // public boolean contains(java.lang.Object);
//         // public boolean add(E);
//         // public boolean remove(java.lang.Object);
//         // public void clear();

//     }
// }





//8]-------------------------------
//2.2]
//Linked Hash Set

//parent of linkedHashset is Hashset due to all methods of hashSet is inherit in linkedHashSet
// sequence must be same 

// import java.util.*;
// class LinkedHashSetDemo{

//     public static void main(String[] args) {
        
//         LinkedHashSet LS=new LinkedHashSet();

//         LS.add("Kanha");
//         LS.add("uday");
//          LS.add("rahul");
//          LS.add("Bade");
//          LS.add("uday");

//          System.out.println(LS);


//     }


// }


//9]----------------------------
//as we know that linked hash map do not allow the dublicate values but in this program we will add virat 2 times because we create a 2 diff objects

// import java.util.*;
// class CircParent{

//     String Name=null;
//     int jerNo=0;

//     CircParent(String Name,int jerNo){

//         this.Name=Name;
//         this.jerNo=jerNo;
//     }

//     public String toString(){

//         return Name + " " + jerNo;
//     }
   
// }

// class LinkedhashSetDemo{

//     public static void main(String[] args) {
        
//         LinkedHashSet LH=new LinkedHashSet<>();

//         LH.add(new CircParent("virat", 3));
//         LH.add(new CircParent("Rohit", 5));
//         LH.add(new CircParent("klrahul", 6));
//         LH.add(new CircParent("virat", 3));

//         System.out.println(LH);


//     }

// }

//10]------------------------

// //same as pervise we are tring to make a integer as new object but it will do not applicable with predefine classes

// import java.util.LinkedHashSet;

// class LinkedHashSetDemo{

//     public static void main(String[] args) {
        
//         LinkedHashSet LH=new LinkedHashSet();


//         LH.add(new Integer(3)); 
//         LH.add(new Integer(2));
//         LH.add(new Integer(1));
//         LH.add(new Integer(3));
//         System.out.println(LH);



//     }
// }

//11]--------------------------------

//2.3]Tree Set
//do not support the mutiple type of data only support the same type of data
//do not mantian sequence
//do not support the dublicate values

// import java.util.TreeSet;

// class TreeSetDemo{

//     public static void main(String[] args) {
        
//         TreeSet TS=new TreeSet();
        
//         //public boolean add(E);
//             TS.add("Vinit");
//             TS.add("uday");
//             TS.add("Pratik");
//             TS.add("Rahul");
//             TS.add("Badhe");
//             TS.add("Vinit");
//             TS.add("kanha");
//             TS.add("uday");
//             TS.add("Pratik");

//             System.out.println(TS);

//             // public E first();
//             // public E last();
//             // public E lower(E);
//             // public E floor(E);
//             // public E ceiling(E);
//             // public E higher(E);
//             // public E pollFirst();
//             // public E pollLast();
//             // public java.lang.Object clone();


//     }
// }

//12]----------------------------

//import java.lang.*;
// import java.util.*;
// class MyClass implements Comparable{

//     String str=null;
//     MyClass(String str){

//         this.str=str;

//     }

//     public int compareTo(Object obj){

//         return -1;
//     }

//     public String toString(){

//         return str;
//     }



// }

// class TreeSetDemo{

//     public static void main(String[] args) {
        
//         TreeSet TS=new TreeSet();
//         //TreeSet TS=new TreeSet();

//         TS.add(new MyClass("vinit"));


//     }
// }

//13]----------------------------
//use of sort the user define object
//sort the objects in assending order for desinding use (-) before return value


// import java.util.*;


// class Movies implements Comparable{

//     String MovieName=null;
//     float TotalColl=0;
//     Movies(String MovieName,float TotalColl){

//         this.MovieName=MovieName;
//         this.TotalColl=TotalColl;


//     }

//     public int compareTo(Object obj){

//         return (MovieName.compareTo(((Movies)obj).MovieName)); //for desanding -(MovieName.compareTo(((Movies)obj).MovieName))

//     }

//     public String toString(){
//         return MovieName;
//     }

// }

// class TreeSetDemo{

//     public static void main(String[] args) {
        
//         TreeSet TS=new TreeSet();


//          TS.add(new Movies("Gadar", 2.5f));
//          TS.add(new Movies("OMG", 4.5f));
//          TS.add(new Movies("Jailer", 6.5f));
//          TS.add(new Movies("Juna farnichar", 8.5f));
         
//          System.out.println(TS);

//          //[Juna farnichar, Jailer, OMG, Gadar]
//          //[OMG, Juna farnichar, Jailer, Gadar]

//     }
// }

//14]------------------------------

// import java.util.*;

// class SortDemo{

//     public static void main(String[] args) {
        
//         ArrayList AL=new ArrayList();

//         AL.add("kanha");
//         AL.add("vinit");
//         AL.add("rahul");
//         AL.add("uday");

//         Collections.sort(AL);
//         System.out.println(AL);

//     }

// }

//15]------------------------------remain----

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.*;

// class Employee{

//     String name=null;
//     int salary=0;

//     Employee(String name,int salary){

//         this.name=name;
//         this.salary=salary;

//     }

//       public String toString(){

//               return "{" + name +" "+salary +"}";
//       }

// }

// class SortByName implements Comparator{

//     public int compare(Employee obj1,Employee obj2){

//         //return obj1.name(compareTo(obj2.name));
//         return obj1.name.compareTo(obj2.name);

//     }


// } 

// class ListSortDemo{

//     public static void main(String[] args) {
        
//         ArrayList AL=new ArrayList();

//         AL.add(new Employee("rahul",230));
//         AL.add(new Employee("pratik",20));
//         AL.add(new Employee("uday",4300));
//         AL.add(new Employee("vinit",22300));

//         Collections.sort(AL,new SortByName());
        

//     }
// }

//20]--------------------------------------------------
//2.4]Sorted Set

//Sorted set is a interface due to this we can not make the object of Sorted Set
//but tree set is child of Sorted set and it is a class 

// import java.util.*;

// class SortedSetDemo{

//     public static void main(String[] args) {
        
//         SortedSet SS=new TreeSet();

//         SS.add("vinit");
//         SS.add("rahul");
//         SS.add("patik");
//         SS.add("anup");
//         SS.add("vinit");

//         System.out.println(SS);

//     //     public abstract java.util.SortedSet<E> subSet(E, E);
//                //System.out.println(SS.subSet());
        
//        //     public abstract java.util.SortedSet<E> headSet(E);
//                 System.out.println(SS.headSet("vinit"));

//     //     public abstract java.util.SortedSet<E> tailSet(E);9
//                  System.out.println(SS.tailSet("rahul"));
   
//                  //     public abstract E first();
//                    System.out.println(SS.first());
    
//                    //     public abstract E last();
//                    System.out.println(SS.last());
//      }
// }

//21]-----------------------------
//3]Map

//3.1]HashMap

//do not maintain the order
//Stores the data in the form of key value pair
//dublicate value is accepted but dublicate key is not 
//if we do dublicate key it will consider the latest key value & remove the first one
//javap java.util.HashMap (must check the methods)
//Use Case: Suitable when you do not care about the order of elements.

// import java.util.*;
// class HashMapDemo{

//     public static void main(String[] args) {
        
//         HashSet hs=new HashSet();

//         hs.add("vinit");
//         hs.add("rahul");
//         hs.add("pratik");
//         hs.add("uday");
       
//         System.out.println(hs);

//         HashMap HM=new HashMap();

//         HM.put("vinit","Infosis");
//         HM.put("rahul", "Invedia");
//         HM.put("pratik","Info-tec");
//         HM.put("uday","Google");
//         HM.put("vinit", "Invedia");

//         System.out.println(HM);
 

//     }

// }

//22]--------------------------------------

//3.2]LinkedHash Map
//child of hash map
//Maintain the insertion order
//internanlu emplimente using the daubly linked list due to this traverser over the linkedHash map is easy
//time complexity is same (O(1)


// import java.util.LinkedHashMap;

// class LinkedHashMapDemo{

//     public static void main(String[] args) {

//         LinkedHashMap LH=new LinkedHashMap();

        
//         LH.put("vinit","Infosis");
//         LH.put("rahul", "Invedia");
//         LH.put("pratik","Info-tec");
//         LH.put("uday","Google");
//         LH.put("vinit", "Invedia");

//         System.out.println(LH);


//     }
// }

//23]------------------------------
//Map is a interface

// import java.util.*;
// class MapDemo{

//     public static void main(String[] args) {
        
//                   HashMap MP=new HashMap();
//                   MP.put("Java", ".java");
//                   MP.put("Python", "py");
//                   MP.put("Dart",".dart");

//                   System.out.println(MP);

//                   //get
//                   System.out.println(MP.get("Python"));

//                   //keySet
//                   System.out.println(MP.keySet());

//                   //values
//                   System.out.println(MP.values());

//                   System.out.println(MP.isEmpty());

//     }

// }

//24]------------------
//3.3]Identity Hash Map

//do not allow the dublicate value
// do not maintain any order
//identity hash map is compare the elements using its address (in case of 10 we add 2 times 10 ones using new interger and ones direactly due to this the address of both is different)
//Compare the address

// import java.util.*;
// class IdentityHashMapDemo{

//     public static void main(String[] args) {
        
//         IdentityHashMap IH=new IdentityHashMap();


//         IH.put(new Integer(10),"vinit");
//         IH.put(20,"uday");
//         IH.put(30,"kanha");
//         IH.put(10,"pratik");

//         System.out.println(IH);


//     }

// }


//25]-----------------------------

//Garbage collector

// class Demo{

//     String Name=null;
    
//     Demo(String Name){

//         this.Name=Name;

//     }

//     public String toString(){

//         return Name;

//     }
//     public void finalize(){ //when ever the grabage collector will collect any object from the heapsection it class call the finalize method

//         System.out.println("Notify");
//     }

// }

// class Client{

//     public static void main(String[] args) {
        
//          Demo obj1=new Demo("Vinit");
//          Demo obj2=new Demo("Rahul");
//          Demo obj3=new Demo("uday");
                  
//          System.out.println(obj1);
//          System.out.println(obj2);
//          System.out.println(obj3);

//          //obj1=null;
//          obj2=null;

//          System.gc();


//     }

// }

//26]-------------------------Do not aderstand properly------
//3.4]WeakHashMap

// import java.util.*;
// class Demo{
//     String name=null;   
            
//         Demo(String name){

//             this.name=name;

//         }

//         public String toString(){

//             return name;
//         }
   
//         // public void finalize(){

//         //     System.out.println("Notify");
//         // }
// }


// class WeakHashMapDemo{

//     public static void main(String[] args) {
        
          
             
//           Demo obj1=new Demo("vinit");
//           Demo obj2=new Demo("Rohit");
//           Demo obj3=new Demo("uday");
//           Demo obj4=new Demo("pratik");

//           WeakHashMap WH=new WeakHashMap();

//           WH.put(obj1,2012);
//           WH.put(obj2,2015);
//           WH.put(obj3,2017);
//           WH.put(obj4,2013);

          

//           System.out.println(WH);

        //     }


// }



















