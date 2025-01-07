// collection hands on

// List

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

//         obj1.add(new CricketPlayer("virat", 9)); //userdefine object in array list
//         obj1.add(new CricketPlayer("rohit", 17));
//         obj1.add(new CricketPlayer("KLRahul", 1));

//         System.out.println(obj1);

//         HashSet HS=new HashSet<>();

//         HS.add(new CricketPlayer("mohit", 3)); //userdefine object in hash set
//         HS.add(new CricketPlayer("vinit", 5));
//         HS.add(new CricketPlayer("pratik", 4));
//         System.out.println(HS);

//         LinkedHashSet LHS=new LinkedHashSet<>();

//         LHS.add(new CricketPlayer("anup", 11));
//         LHS.add(new CricketPlayer("tamim", 12));
//         LHS.add(new CricketPlayer("kandekar", 69));
//         LHS.add(new CricketPlayer("anup", 11));

//         System.out.println(LHS);


//         // TreeSet TS=new TreeSet(); 
//         // TS.add(new CricketPlayer("Sakshi", 34));
//         // // TS.add(new CricketPlayer("tanu", 54));
//         // // TS.add(new CricketPlayer("mrunaly", 98));

        
//     }
// }

//----------------------------------------------

// import java.lang.reflect.Array;
// import java.util.ArrayList;

// class Myhouse{

//     String dog=null;
//     int age=0;
//     Myhouse(String dog,int age){

//         this.dog=dog;
//         this.age=age;
//       }

//       public String toString(){
//         return dog +" = "+ age;
//       }

// }

// class Client26{

//     public static void main(String[] args) {
        
//         ArrayList AR=new ArrayList<>();


//         AR.add(new Myhouse("jon", 12));
//         AR.add(new Myhouse("Mon", 13));
        

//         System.out.println(AR);

//     }
// }

//-----------------------------------------------

//cursor

// import java.util.ArrayList;
// import java.util.Iterator;

// class cursorp26{

//     public static void main(String[] args) {
        
//         ArrayList AL=new ArrayList<>();

//         AL.add("pratik");
//         AL.add("rahul");
//         AL.add("vinit");

//        Iterator itr=AL.iterator();


//        while (itr.hasNext()) {

//         if(itr.next()=="rahul"){
//             itr.remove();
        
//         }    
            
//        }
//        System.out.println(AL);

//     }
// }

//----------------------------------

// import java.util.*;
// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.LinkedList;

// class HashSetp26{
//     public static void main(String[] args) {
        
//         ArrayList AL=new ArrayList<>();

//         AL.add("soham");
//         AL.add("mohan");
//         // AL.add(12);
//         // AL.add(14);



//        // System.out.println(AL);

//         LinkedList LL=new LinkedList();

//         LL.add(15);
//         LL.add(14);
//         LL.add(16);
//         LL.add(18);

//         //System.out.println(LL);

//        //  LL.addAll(AL);
//         // System.out.println(LL);u

//      //   AL.addAll(LL);
//        // System.out.println(AL);



//        HashSet HS=new HashSet<>();

//        HS.add("vinit");
//        HS.add("rahul");
//        HS.add(99);
//        HS.add("uday");
       
//        //HS.addAll(AL);
//       // System.out.println(HS);

//     //   LL.addAll(HS);
//     //   System.out.println(LL);

//     //   AL.addAll(HS);
//     //   System.out.println(AL);


//     LinkedHashSet LHS=new LinkedHashSet<>();

//          LHS.add("samer");
//          LHS.add("dravid");
//          LHS.add(23);

    
//         //  LHS.addAll(HS);
//         //  System.out.println(LHS);


//         TreeSet TS=new TreeSet();

//         TS.add("vinit"); 
//         TS.add("rahul");

//         System.out.println(TS);

//         TS.addAll(AL);
//         System.out.println(TS);

       
    
    
//     }
// }



//-------------------------------------------
//linked hashSet

// import java.util.LinkedHashSet;

// class linkedhashsetp26{

//     public static void main(String[] args) {
        
//         LinkedHashSet LHS=new LinkedHashSet<>();

//         LHS.add("vinit");
//         LHS.add("rahul");
//         LHS.add("vinit");
//         LHS.add(34);
//         LHS.add(2);
        

//         System.out.println(LHS);
         
//     }

// }

//------------------------------------

// import java.util.*;
// class treeSetp26{

//     public static void main(String[] args) {
        
//         TreeSet TS=new TreeSet();

//         TS.add("vinit");
//         TS.add("rahul");
//         TS.add("pratik");
//         // TS.add(45);

//         System.out.println(TS);

    
        
//     }
// }

//-------------------------------------


// import java.util.*;
// class CricketPlayer implements Comparable{

//     String playerName=null;
//   //  int jerNO=0;

//     CricketPlayer(String playerName){
//         this.playerName=playerName;
//        // this.jerNO=jerNO;
//     }

//     public int compareTo(Object obj){
//         return -1;
//     }
//     public String toString(){
//         return playerName;
//     }
// }
// class TreeSetp26{

//     public static void main(String[] args) {
        
//         TreeSet TS=new TreeSet();

//         TS.add(new CricketPlayer("rohit"));
//         TS.add(new CricketPlayer("pratik"));
//         TS.add(new CricketPlayer("mohit"));
//         System.out.println(TS);

//     }
// }

//----------------------

// import java.util.*;
// class Movie implements Comparable{

//     String Name=null;
//     int coll=0;

//     Movie(String Name,int coll){
//         this.Name=Name;
//         this.coll=coll;
//     }

//     public int compareTo(Object obj){

//      return (Name.compareTo(((Movie)obj).Name));
//     }

//     public String toString(){
//         return Name;
//     }


// }

// class TreeSetp26{
//     public static void main(String[] args) {
        
//         TreeSet TS=new TreeSet();

//         TS.add(new Movie("jay ho", 23));
//         TS.add(new Movie("gol mal", 22));
//         TS.add(new Movie("tumbad", 33));

//         System.out.println(TS);

        
//     }
// }

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Collections;

// class Client26{

//         public static void main(String[] args) {
            
//             ArrayList AR=new ArrayList();
    
    
//             AR.add("vinit");
//             AR.add("rahul");
//             AR.add("pratik");

            
//            Collections.sort(AR);
//             System.out.println(AR);
    
//         }
//     }
    
//sort the userdefine objects

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;

// class TCS{
//     String empName=null;
//     int salary=0;

//     TCS(String empName,int salary){
//         this.empName=empName;
//         this.salary=salary;

//     }
//     public String toString(){

//         return empName + " = " + salary;
//     }

// }


// class comparebyname implements Comparator<TCS>{

//     public int compare(TCS obj1,TCS obj2){

//         return (obj1.empName.compareTo(obj2.empName));

//     }
// }

// class comparebysalary implements Comparator<TCS>{

//     public int compare(TCS obj1,TCS obj2){
//         return (int)(obj1.salary-obj2.salary);
//     }
// }
// class p26client{
//     public static void main(String[] args) {
        
//         ArrayList AL=new ArrayList();

//         AL.add(new TCS("mohan",23));
//         AL.add(new TCS("rahul", 34));
//         AL.add(new TCS("pratik", 33));

//         System.out.println(AL);

//         Collections.sort(AL,new comparebyname());
//         System.out.println(AL);

//         Collections.sort(AL,new comparebysalary());
//         System.out.println(AL);
//     }
// }

//-------------------------

//  import java.util.*;

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
//                System.out.println(SS.subSet("anup","vinit"));
        
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


//-----------------------------

//HashMap And Linked HashMap
import java.util.*;
class Hashmapp26{

    public static void main(String[] args) {
        
     HashSet HS=new HashSet();// we can not convert any type if set and list into map 

     HS.add("aman");
     HS.add("raman");

      HashMap HM=new HashMap();

      HM.put("udya", "Google");
      HM.put("vinit","Microsoft");
      HM.put("Anup","NiseSystem");
      HM.put("pratik","IBM");
      

      System.out.println(HM);

      LinkedHashMap LHM=new LinkedHashMap();
         
      LHM.put(10, "Google"); //linked HashMap will preserve the insertion oreder
      LHM.put(new Integer(10),"Microsoft");
      LHM.put("sahil","NiseSystem");
      LHM.put("rohan","IBM");
      
      System.out.println(LHM);

      // LHM.putAll(HM);
      // System.out.println(LHM);

      // HM.putAll(LHM);
      // System.out.println(HM);

      // LHM.isEmpty();

       IdentityHashMap IHM=new IdentityHashMap();

      IHM.put(new Integer(10),"soham");
      IHM.put(10,"soham");
      IHM.put(30,"swapnil");

      System.out.println(IHM);

      TreeMap TM=new TreeMap();

      TM.put(4,"vinit");
      TM.put(5,"rohan");
      TM.put(2,"rhoit");

      System.out.println(TM);

      
      SortedMap SM=new TreeMap();

      SM.put(2,"vinit");
      SM.put(3,"kldslkfjs");
      SM.put(1, "fsdf");

      
    }

}