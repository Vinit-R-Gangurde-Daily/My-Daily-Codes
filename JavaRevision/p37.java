
//dubbly circluar linked list


import java.util.Scanner;

class NodeDL{

    NodeDL next=null;
    NodeDL preve=null;
    int data=0;

    NodeDL(int data){

        this.data=data;
    }

}

class DubblyList{

    NodeDL head=null;
    NodeDL tail=null;

    //add first
    void AddFirstDL(int data){
        
        NodeDL newNode=new NodeDL(data);
        if(head==null){

             head=newNode;
        }else{

            // Node temp=head;

            // while(temp.next!=null){
            //     temp=temp.next;
            // }

            //####
            if(countNode()==2){
               // NodeDL temp=head;
                // while(temp.next!=null){
                //     temp=temp.next;
                // }
                tail=head;
                tail.next=newNode;
                head.preve=newNode;
                newNode.next=head;
                newNode.preve=head;
                head=newNode; 
                 
            }

            newNode.next=head;
            head.preve=newNode;
            head=newNode;
           
           //##
            tail.next=head;
            head.preve=tail;

        }

    }


    void addnodeatLast(int data){
          

        if(head==null){
            System.out.println("list is empty");
        }else{
             
            NodeDL newNode=new NodeDL(data);
            NodeDL temp=head;

            while(temp.next!=null){
                temp=temp.next;
            }
            
            temp.next=newNode;
            newNode.preve=temp;
            //##
            newNode.next=head;
            head.preve=newNode;
            tail=newNode;
            
        }

  }

  //enter node at possition
  void enternodeatposs(int pos,int data){
     
        if(pos<=0 || pos>=countNode()+2){

            System.out.println("invalid index");
            return;
        }

        if(pos==1){
            addnodeatLast(data);
        }else if(pos==countNode()+1){
            addnodeatLast(data);
        }else{
              
            NodeDL newNode=new NodeDL(data);
            NodeDL temp=head;

            while(pos-2 != 0){
                temp=temp.next;
                pos--;
            }
             
            newNode.next=temp.next;
            temp.next=newNode;
            newNode.preve=temp;
            newNode.next.preve=newNode;
        }

          
  }
 
  //delete first node
        
    void deletefirstDL(){
         
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        
        if(countNode()==1){
            head=null;
        }else{

            head=head.next;
            head.preve=null;
        }

    }

    //delete last node

    void deletelastnode(){

        if(head==null){

            System.out.println("list is empty");
            return;
        }

         if(countNode()==1){
            head=null;
         }else{
              
            NodeDL temp=head;

            while(temp.next.next!=null){

                temp=temp.next;
            }
            temp.next.preve=null;
            temp.next=null;

             
         }


    }

    //delete node using its posstion

    void deletenodebypos(int pos){

        if(pos<=0 || pos >=countNode()+1){
            System.out.println("invalid index");
            return;
        }

        if(pos==1){
            deletefirstDL();
        }else if(pos==countNode()){
          deletelastnode();
        }else{
           
            NodeDL temp=head;

            while(pos-2 != 0){

                temp=temp.next;
                pos--;
            }
         
        //     temp.next.next.preve=temp;
        //   //  temp.next.preve=null;
        //     temp.next=temp.next.next;
        //    // temp.next.next=null;            
              
        temp.next=temp.next.next;
        temp.next.preve=temp;
        }


    }
    
    //print list forword
    void printDL(){

        if(head==null){
            System.out.println("list is empty");
        }else{
            NodeDL temp=head;

            while (temp!=null) {
                
                System.out.print(temp.data + "-->");
                temp=temp.next;
            }
         }
    }
      //print List reverse
    void printDLReverse(){

        if(head==null){
            System.out.println("list is empty");
        }else{

            NodeDL temp=head;

            while(temp.next!=null){
                temp=temp.next;
            }

            while(temp!=null){
                System.out.print(temp.data + "-->");
                temp=temp.preve;
            }
        }
    }

     //count the num of nodes in list
    int countNode(){

        int count=1;
        NodeDL temp=head;

        while(temp!=tail){
            count++;
            temp=temp.next;
        }

        return count;
    }



    void infoDL(){
             
        System.out.println("bassic info of the DL");
        System.out.println("head of the list is " + head.data);
        System.out.println("tail of ther DL is " + tail.data);
        System.out.println("the next of tail is head : " + tail.next.data);
        System.out.println("the preves of the head is tail: " + head.preve.data);
        
    }

}

class p37 {

    
    public static void main(String[] args) {
        
          Scanner sc=new Scanner(System.in);
          DubblyList DL=new DubblyList();


          char ch;


          do{          

                    System.out.println("1]enter the data first");
                    System.out.println("2]print list");
                    System.out.println("3]print lis reverse");
                    System.out.println("4]insert data at lase");
                    System.out.println("5]count the num of nodes in list");
                    System.out.println("6]enter data at possition");
                    System.out.println("7]delete first node");
                    System.out.println("8]delete the last node of list");
                    System.out.println("9]delete the node at possition");
                    System.out.println("10]print the information of the list");
        
                    int choises=sc.nextInt();
      
            switch (choises) {
                case 1:{
                    System.out.println("enter the data");
                    int data=sc.nextInt();
                    DL.AddFirstDL(data);
                    
                }
                break;

                case 2:{
                    
                    DL.printDL();
                }
                break;

                case 3:{
                    DL.printDLReverse();
                }
                break;

                case 4:{

                    System.out.println("enter the data: ");
                    int data=sc.nextInt();
                      DL.addnodeatLast(data);
                }
                break;

                case 5:{

                    System.out.println("Num of node in list is : " + DL.countNode());
                }
                break;

                case 6:{
                     
                          System.out.println("enter a possition");
                          int pos=sc.nextInt();

                          System.out.println("enter a data");
                          int data=sc.nextInt();

                          DL.enternodeatposs(pos,data);
                }
                break;

                case 7:{

                           DL.deletefirstDL();
                }
                break;

                case 8:{

                      DL.deletelastnode();
                }
                break;

                case 9:{
                     System.out.println("enter the posstion of dele element: ");
                     int pos=sc.nextInt();
                    DL.deletenodebypos(pos);
                }
                break;

                case 10:{
                    DL.infoDL();
                }
                break;

                default: System.out.println("please enter valid choise ");
                          
            }

              
            System.out.println("do you want to continue(y/n): ");
            ch=sc.next().charAt(0);
          }while(ch== 'y' || ch=='Y');

    }
    
}

// public class p37 {

    
// }
