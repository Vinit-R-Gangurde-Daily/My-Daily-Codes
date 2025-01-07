
//stack using the array

import java.util.Scanner;

class StackArr{

    int maxSize;
    int top=-1;
    int StackArr[];

    StackArr(int size){

        this.maxSize=size;
        this.StackArr=new int[maxSize];


    }



    //push
        void pushStack(int data){

            if(top==maxSize-1){
                System.out.println("stack is full");
            }else{
                top++;
                StackArr[top]=data;
            }

        }
    
    //isempty

    boolean isemptystack(){

        if(top==-1)
                return true;
        else
                return false;
    }

    //pop

    void popStack(){
          
        if(isemptystack()){
            System.err.println("stack is emtpy");
        
        }else{
            int data=StackArr[top];
            top--;
            System.out.println("pop element is : " + data);
        }

    }

    //peek
    void peekStack(){
          
        if(isemptystack()){
            System.err.println("stack is emtpy");
        
        }else{
            int data=StackArr[top];
            System.out.println("peek element is : " + data);
        }

    }

    //print stack
    void printStack(){

        if(isemptystack()){
            System.out.println("stack is full");
        }else{
           System.out.print("[");
            for(int i=0;i<=top;i++){
                System.out.print(StackArr[i] + " ,");
            }
            System.out.println("]");
        }
        
    }

    int sizeofStack(){

        return top;
    }


}






class p39 {

  public static void main(String[] args) {
       
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the size of Stack: ");
    int size=sc.nextInt();

    StackArr Sta=new StackArr(size);

     
    char ch;

    do{
                System.out.println("1]push data in the stack");
                System.out.println("2]check is empty or not");
                System.out.println("3]print the stack");
                System.out.println("4]pop the element from the stack");
                System.out.println("5]peek the element");
                System.out.println("6]size of stack");

                 
                System.out.println("enter your choise");
                int choise=0;
                try{
                 choise=sc.nextInt();
                }catch(RuntimeException obj){
                    System.out.println("input must be in int format");
                }
        
        switch (choise) {
            case 1:{
                System.out.println("enter the data: ");
                int data=sc.nextInt();

                Sta.pushStack(data);
                  
            }
            break;

            case 2:{
                       if(Sta.isemptystack())
                                        System.out.println("Stack is empty");
                        else 
                                        System.out.println("No stack is not empty");
            }
             break;

            case 3:{
                       
                Sta.printStack();
                    
            }
            break;

            case 4:{
                       Sta.popStack();
             }
            break;

            case 5:{

                     Sta.peekStack();
            }
            break;

            case 6:{
                        System.out.println("size of the stack is: "+ Sta.sizeofStack());
            } 
            break;
            default:System.out.println("enter the currect choise");
                break;
        }

         System.out.println("do you want to continue: ");
         ch=sc.next().charAt(0);
          
    }while(ch=='Y' || ch=='y');


    }
    
}
