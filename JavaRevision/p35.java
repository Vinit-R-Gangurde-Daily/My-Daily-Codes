

//singly linked list

import java.util.Scanner;

class Node{

    int data;
    Node next=null;

    Node(int data){

        this.data=data;
    }


}

class wholell{
        
    
    Node head=null;

    // add first

    void addFirstll(int data){

        Node newNode=new Node(data);
        if(head==null){
              
            head=newNode;
        }else{

            newNode.next=head;
            head=newNode;
        }

  }


   //add node at last

   void addlastll(int data){
         
            Node newNode=new Node(data);

            if(head==null){
               head=newNode;
            }else{

                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }

                temp.next=newNode;
            }
    }

    //count node
     int countNodell(){
         int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
     }
   
   
     //add at possition
     void addAtposs(int data,int pos){

        if(pos<=0 || pos >countNodell()+2){
            System.out.println("in valid posstion ");
            return;
        }

        if(pos==1){
             addFirstll(data);
        }else if(pos==countNodell()+1){
            addlastll(data);
        }else{
               
             Node newNode=new Node(data);
             
               Node temp=head;

               while(pos-2!=0){
                temp=temp.next;
                pos--;
               }

               newNode.next=temp.next;
               temp.next=newNode;
               
        }


    }
 

     //delete first
        
     void delfirst(){
      
        
        if(head==null){

          System.out.println("list is empty"); 
        
        }
        
        if(countNodell()==1){
            head=null;
        }else{
            
            head=head.next;
        }
        
     }

     //delete last
      
     void delLast(){
           
        if(head==null){

            System.out.println("List is empty");
        }
        
        if(countNodell()==1){
            head=null;
        }else{

            Node temp=head;

            while(temp.next.next!=null){
                  
                temp=temp.next;
                 
            }
                   
            temp.next=null;

        }

     }


     //delete at posstion

     void deletepos(int pos){
     
        if(pos <=0 || pos >=countNodell()+1){
            System.out.println("invalid index");
            return;
        }

        if(pos==1){
            delfirst();
        }else if(pos==countNodell()){
            delLast();

     }else{

        Node temp=head;

        while(pos-2 != 0){
            temp=temp.next;
        }
        temp.next=temp.next.next;
     }

    }
    //  print list
    void printLL(){

           Node temp=head;

           while(temp!=null){
              
            System.out.print(temp.data +"-->");
            temp=temp.next;
      }
   }





}

public class p35 {

    
    public static void main(String[] args){


        
        Scanner sc=new Scanner(System.in);

        wholell ll=new wholell();
         char cp;
        do{
            int ch;
                   
               System.out.println("1]insert data first");
               System.out.println("2]enter the data at last");
               System.out.println("3]count the num of node in ll");
               System.out.println("4]enter data at possition");
               System.out.println("5]delete first node");
               System.out.println("6]delete last nod");
               System.out.println("7]delete at posstion");
               System.out.println("8]print list");
                
               ch=sc.nextInt();
          
            switch(ch){

                case 1:{ 
                          System.out.println("enter the data");
                          int data=sc.nextInt();
                          ll.addFirstll(data);

                           
                }        
                break;

                
                case 2:{
                           System.out.println("enter the data");
                           int data=sc.nextInt();

                           ll.addlastll(data);
                          
                }
                break;
           
                case 3:{
                      
                        System.out.println("num of node is : " + ll.countNodell());
                }
                break;

                case 4:{

                         System.out.println("enter the possition: ");
                         int pos=sc.nextInt();

                         System.out.println("enter the data: ");
                         int data=sc.nextInt();

                         ll.addAtposs(data, pos);
                }
                break;
        
                case 5:{
                        //         if(ll.delfirst()==0){
                        //             System.out.println("list is empty");
                        //         }else{
                        //    System.out.println("deleted element is: " + ll.delfirst());
                        //         }
            
                                ll.delfirst();

                }
                break;

                case 6:{

                           ll.delLast();
                }
                break;
                 
                case 7:{

                        System.out.println("enter the posstion");
                        int pos=sc.nextInt();

                        ll.deletepos(pos);
                }
                break;

                case 8:{

                    ll.printLL();
                }
                break;

                default: System.out.println("please enter the valid choise");


                
              }
                       System.out.println("do you want to continue ? (y/n)");
                        cp=sc.next().charAt(0);

            }while(cp == 'y' || cp == 'Y');


    }
    
}
