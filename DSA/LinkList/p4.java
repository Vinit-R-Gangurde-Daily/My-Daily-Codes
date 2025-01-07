
//dubly linked list

import java.util.Scanner;

class Noded{

    int data;
    Noded next=null;
    Noded prev=null;

    Noded(int data){

        this.data=data;

    }

}

class DublyLinkedList{

     Noded head=null;
     

     //add first
     void addFirstd(int data){

        Noded newNode=new Noded(data);
        if(head==null){
          head=newNode;
        }else{

            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            
        } 
    }

     //add Last
     void addLastd(int data){

        Noded newNode=new Noded(data);
        if(head==null){
            head=newNode;
        }else{
           
            Noded temp=head;

            while(temp.next!=null){
                 
                temp=temp.next;

            }
            temp.next=newNode;
            newNode.prev=temp;


        }

     }

     //add at possition 
     void addAtPosd(int pos,int data){

        if(pos<=0 || pos>=countNoded()+2){
            System.out.println("in valid Index");
            return;
        }

        if(pos==1){
              
            addFirstd(data);
        }else if(pos==countNoded()+1){
                 
            addLastd(data);
        }else{

            Noded newNode=new Noded(data);
            Noded temp=head;
            while(pos-2!=0){

                temp=temp.next;
                pos--;
            }

            //sir cha code
            //  newNode.prev=temp;
            //  newNode.next=temp.next;
            // temp.next=newNode;
            // newNode.next.prev=newNode;

 
            //maza code
            newNode.next=temp.next;
            temp.next.prev=newNode;
            temp.next=newNode;
            newNode.prev=temp;


        }

     }

     //delete first
     void delFirstd(){

        if(head==null){

            System.out.println("list is empty");
            
        }else if(countNoded()==1){

            head=null;
        }else{

            head=head.next;
            head.prev=null;//head null karaycha , nahi tar first node delete hot nahi to single link var zombi sarkha raheto

        }


     }
     //delete Last

     void delLastd(){

         if(head==null){

            System.out.println("list is empty");
            
        }else if(countNoded()==1){

            head=null;
        }else{

            Noded temp=head;

            while(temp.next!=null){ // aapan yala temp.next.next pan karu shakto pan hi dubbly list aahe ty myle return pan yeu shakto

                temp=temp.next;
            }
            
            temp.prev.next=null;
            temp.prev=null;
            



        }

     }
 
     //delete at possition
     void delAtPosd(int pos){

         if(pos<=0 || pos>=countNoded()+1){
            System.out.println("in valid Index");
            return;
        }

        if(pos==1){
              
            delFirstd();
        }else if(pos==countNoded()){
                 
             delLastd();
        }else{

           
            Noded temp=head;
            while(pos-2!=0){   //aapan yalo direct temp la consider karun pan karu shakte karan dubbly linkelist

                temp=temp.next;
                pos--;
            }

            temp.next=temp.next.next;
            temp.next.prev=temp;
    


        }

     }
     
     //count nodes
     int countNoded(){

        int count=0;
        Noded temp=head;

        while (temp!=null) {

            count++;
            temp=temp.next;
            
        }
        
        
        return count;
     }



    //print DLL

    void printDLL(){

        if(head==null){
            System.out.println("List is empty");
            return;
        }else{
            Noded temp=head;

            while(temp.next!=null){
                System.out.print(temp.data+"<->");
                temp=temp.next;
            }
            System.out.println(temp.data);
          //  temp=temp.prev;
           while(temp!=null){
 
            System.out.print(temp.data+"<->");
              temp=temp.prev;
           }
           System.out.println();     
        }


    }

}


class Clientd{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        DublyLinkedList DLL=new DublyLinkedList();

        char ch;
              do{
                    System.out.println("Dubbly Liked list");
                    System.out.println("1.add first");
                    System.out.println("2.add last");
                    System.out.println("3.add at posstion");
                    System.out.println("4.del first");
                    System.out.println("5.del last");
                    System.out.println("6.del at posstion");
                    System.out.println("7.count node");
                    System.out.println("8.print list");
             
                    System.out.println("enter your choise");
                    int choise=sc.nextInt();
                    switch(choise) {
                        
                        case 1:{
                                  System.out.println("enter a data");
                                  int data=sc.nextInt();
                                  DLL.addFirstd(data);
                          }
                            break;

                        case 2:{
                                System.out.println("enter a data");
                                int data=sc.nextInt();
                                DLL.addLastd(data);
                        }
                        break;

                        case 3:{
                                 System.out.println("enter a possition");
                                 int pos=sc.nextInt();
                                 System.out.println("enter  data");
                                 int data=sc.nextInt();
                                 DLL.addAtPosd(pos,data);

                        }
                        break;

                        case 4:{
                                  DLL.delFirstd();
                            }
                            break;
                        
                        case 5:{
                                  DLL.delLastd();
                        }
                        break;

                        case 6:{
                                   System.out.println("enter a possiton");
                                   int pos=sc.nextInt();
                                   DLL.delAtPosd(pos);

                        }
                        break;

                        case 7:{
                                 int count=DLL.countNoded();
                                 System.out.println("num of node is: "+count);
                           }
                           break;

                        case 8:{
                                 DLL.printDLL();
                        }
                        break;
                        default:
                              System.out.println("In valid Index");
                            break;
                    }


                      System.out.println("continue?");
                      ch=sc.next().charAt(0);
                
              
            
            }while(ch=='Y'|| ch=='y');
         
        
         }

}
