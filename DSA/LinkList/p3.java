//practis of single linked List

import java.util.*;

class Nodep{
 
    Nodep next=null;
    int data;
    
    Nodep(int data){
     
        this.data=data;
 
    }

 
}
class LinkedListp{
      Nodep head=null;

       //add first
      void addFirstp(int data){
           
          Nodep newNode=new Nodep(data);
          
          if(head==null){
          
            head=newNode;

          }else{
             
            newNode.next=head;
            head=newNode;
        }

    }
   
    //add last
    void addLastp(int data){

        Nodep newNode=new Nodep(data);

        if(head==null){
      
            head=newNode;

        }else{
                 Nodep temp=head;

                 while (temp.next!=null) {
                    
                    temp=temp.next;
                 }
              temp.next=newNode;
        }


    }

    //add at possition
    void addAtPosp(int pos,int data){

        
        
        if(pos<=0 || pos>=countNodep()+2){
            System.out.println("invalidIndex");
            return;
        }
          
        if(pos==1){
            addFirstp(data);
        }else if(pos==countNodep()+1){
      
            addLastp(data);
             
        }else{
             
            Nodep newNode=new Nodep(data);
            Nodep temp=head;

            while(pos-2!=0){
                   
                temp=temp.next;
                pos--;

            }
            newNode.next=temp.next;
            temp.next=newNode;

        }

    }
    
    //delete first
    void delFirstp(){
         
        if(head==null){
            System.out.println("list is empty");
            return;
        }
         if(countNodep()==1){
            head=null;
         }else{

            head=head.next;
         }

    }
 
        
    //delete Last
    void delLastp(){

        if(head==null){
            System.out.println("list is empty");
            return;
        }
        
        if(countNodep()==1){

            head=null;
        }else{
            Nodep temp=head;

            while(temp.next.next!=null){
           
                temp=temp.next;

            }

            temp.next=null;
        }
 
    }

    //delete at possiton
    void delAtPosp(int pos){

        if(pos<=0 || pos>=countNodep()+1){
         
            System.out.println("in valid Index: ");
            return;

        }

        if(pos==1){

            delFirstp();
        }else if(pos==countNodep()){
            delLastp();
        }else{

            Nodep temp=head;
            while(pos-2!=0){

               temp=temp.next;
                pos--;

            }

            temp.next=temp.next.next;
        }

    }
    
    //count node
    int countNodep(){

        Nodep temp=head;
        int count=0;

        while(temp!=null){
      
            count++;
            temp=temp.next;

        }
    return count;

    }
    
      //print list
    void printSLLp(){
         
        Nodep temp=head;

        while(temp!=null){
           
            System.out.print(temp.data +"->");   
            temp=temp.next;

        }
        System.out.println();

    }
}


class Clientp{

    public static void main(String[] args){

       // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

       Scanner sc=new Scanner(System.in);
        
        LinkedListp ll=new LinkedListp();
 
        char Ch;
        do{

            System.out.println("Single Liked List");
             System.out.println("1.add at first");
              System.out.println("2.add at last");
               System.out.println("3.add at possition");
                System.out.println("4.del first");
                 System.out.println("5.del last");
                  System.out.println("6.del at pos");
                   System.out.println("7.count");
                    System.out.println("8.print list");

                    System.out.println("enter your choise: ");
                    int choise=sc.nextInt();

                    switch(choise){

                        case 1:{
                                System.out.println("enter a data");
                                int data=sc.nextInt();
                                ll.addFirstp(data);
                            }
                        break;

                        case 2:{
                                  System.out.println("enter a data");
                                  int data=sc.nextInt();
                                  ll.addLastp(data);
                        }
                        break;

                        case 3:{
                                      System.out.println("enter a possition: ");
                                      int pos=sc.nextInt();
                                      System.out.println("enter a data: ");
                                      int data=sc.nextInt();
                                      ll.addAtPosp(pos,data);
                                    }
                                    break;
                         
                        case 4:{
                            ll.delFirstp();
                            
                        }
                        break;
                        case 5:{

                            ll.delLastp();
                        }
                        break;

                        case 6:{
                            System.out.println("enter a possiton: ");
                            int pos=sc.nextInt();
                            ll.delAtPosp(pos);
                            
                        }
                        break;

                        case 7:{

                            int count=ll.countNodep();
                            System.out.println(count);

                        }
                        break;

                        case 8:{
                           
                            ll.printSLLp();
                        }
                        break;

                        default:
                                   System.out.println("wrong Input");

                    }

                    System.out.println("Continue?");
                     Ch=sc.next().charAt(0);


        }while(Ch=='y' || Ch=='Y');

    }

}
