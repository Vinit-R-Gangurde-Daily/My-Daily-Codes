
//some problem do next one p35

import java.util.*;
class Node{

    int data;
    Node next=null;
    Node(int data){
        this.data=data;
    
    
    }

}

class LinkedListDemo{

    Node head=null;


    void addfirst(int data){

        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }else{
            
            newNode.next=head;
            head=newNode;

        }

    }

    void addlast(int data){

        Node newNode=new Node(data);

        if(head==null){

            head=newNode;
        }else{

          Node temp1=head;

          while(temp1.next!=null){
              temp1=temp1.next;

          }
          temp1.next=newNode;

        }

    }

      int countNode(){
           int count=0;
             Node temp=head;
           while (temp!=null) {
                 temp=temp.next;
                 count++;
           }
           return count;

      }
    void addAtpossition(int data,int possition){

        Node newNode=new Node(data);

        if(possition<=0 || possition >= countNode()+2){

            System.out.println("invalid index");
            return;
        }
        if(possition==1){
           
            addfirst(data);

        }else if(possition==countNode()+1){

                addlast(data);

        }else{
           // int count=1;
            Node temp=head;

            while(possition-2!=0){
 
             temp=temp.next;
              possition--;
            }
             newNode.next=temp.next;
             temp.next=newNode;

          
        }


    }

     void DelFirst(){
                
        if(head==null){
            System.out.println("list is empty: ");
            return;
        }
        
        if(countNode()==1){
                  
            head=null;
 
        }else{

               head=head.next;
        }

    }

    void printLL(){

        
        if(head==null){

            System.out.println("list is empty");
        }else{

            Node temp1=head;
         
         //   System.out.println(head.data);
               while(temp1 !=null){
               
                System.out.print(temp1.data +"-->");
                temp1=temp1.next;

               }
               System.out.println();
        }

    }


}

public class p34 {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       LinkedListDemo ll=new LinkedListDemo();


    //    for(int i=0;i<5;i++){
    //    System.out.println("enter the a data for add: ");
    //    int data=sc.nextInt();


    //    ll.addfirst(data);
    // }
        
    //    ll.printLL();

    //    ll.addlast(77);
    //    ll.printLL();



            
              char ch;
     
         do{  

            System.out.println("1]add element at first: ");
            System.out.println("2]add element at last: ");
            System.out.println("3]add element at possition: ");
            System.out.println("4]print list: ");
            System.out.println("5]delete first");

            System.out.print("Enter your chooise: ");
            int cho=sc.nextInt();

            switch(cho){

                case 1:{
                         System.err.print("enter a data: ");
                         int val=sc.nextInt();
                         ll.addfirst(val);
                }
                break;
                case 2:{
                        
                    System.out.print("enter a data: ");
                    int val=sc.nextInt();
                    ll.addlast(val);


                }
                break;

                case 3:{

                        System.out.print("enter a data: ");
                        int val=sc.nextInt();
                        
                        System.out.print("enter a possition: ");
                        int pos=sc.nextInt();

                        ll.addAtpossition(val, pos);
                }
                break;

                case 4:{

                          ll.printLL();
                }

                case 5:{

                       ll.DelFirst();
                }
                 break;
                default: 
                         System.out.println("please enter valid choise: ");
            }

            System.out.print("do you want to continue: ");
             ch=sc.next().charAt(0);
                
         }while(ch=='y' || ch=='Y');
    }

}
