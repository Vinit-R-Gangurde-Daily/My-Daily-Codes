

// Stack impliment using the linked list

import java.util.Scanner;

class NodeSL{
    int data;
    NodeSL next=null;
      
    NodeSL(int data){
        this.data=data;
    }

}

class OpperationNodeSL{

     NodeSL Head=null;
     int maxSizeSL=0;
     int top=0;

    OpperationNodeSL(int maxSizeSL){
        this.maxSizeSL=maxSizeSL;
    }
     
    //push
      void pushSL(int data){
              
        if(maxSizeSL<=top){
            System.out.println("stack is Full");
        }else{
            NodeSL newNode=new NodeSL(data);
           top++;
           newNode.next=Head;
          Head=newNode;

         }

     }

    //poopSL 
      void poopSL(){
     
         if(isemptySL()){
            System.out.println("stack is empty");
         }else{
             System.out.println("poop data is: " + Head.data);
    
             Head=Head.next;
             top--;
          }
     }
    

     //peekSL
     void peekSL(){
                 
        if(isemptySL()){
            System.out.println("Stack is empty");
        }else{
             System.out.println("peek data is : " + Head.data);
        }
     }

     //empty or not
     boolean isemptySL(){
               if(Head==null)
                           return true;
               else
                        return false;
     }

     //print list

     int sizeofStack(){
        int count=0;
        NodeSL temp=Head;

        // for(int i=0;i<top;i++){
        //     System.out.println(temp.data);
        // }
             while(temp!=null){
                count++;
                temp=temp.next;
             }

             return count;
     }

     void printStack(){
        
        NodeSL temp=Head;

        while (temp!=null) {

            System.out.print(temp.data + ", ");
            temp=temp.next;
            
        }

     } 

}


class p40{

    public static void main(String[] args) {
     
         Scanner SC=new Scanner(System.in);

         System.out.println("enter the size of stack: ");
         int size=SC.nextInt();

         OpperationNodeSL SL=new OpperationNodeSL(size);


         char ch;  
        
         do{

            System.out.println("1]push data in stack");
            System.out.println("2]poop data in the stack");
            System.out.println("3]peek data from the stack");
            System.out.println("4]check wheather stack is emtpy or not");
            System.out.println("5]print the stack");
            System.out.println("6]count size of the stack");
             
            
            System.out.println("enter your choise");
            int choise=SC.nextInt();
            
        

        switch (choise) {
            case 1:{
                  System.out.print("enter the data: ");
                  int data=SC.nextInt();

                  SL.pushSL(data);
            }
            break;

            case 2:{
                  SL.poopSL();
            }
            break;

            case 3:{

                SL.peekSL();
                    
            }
            break;

            case 4:{
                System.out.println(SL.isemptySL());

            }
            break;

            case 5:{
                   SL.printStack();     
            }
            break;

            case 6:{
               System.out.println("size of stack is: " + SL.sizeofStack());

            }
            break;

            
            default:
               System.out.println("please enter the valid cholise");
                break;
           
            }
    
            
        System.out.println("Do you want to continue: ");
        ch=SC.next().charAt(0);


       }while(ch == 'y' || ch == 'Y');

    }
    
}
