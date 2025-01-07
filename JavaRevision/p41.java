
//Queue

import java.util.Scanner;

class QueueEM{

    int front;
    int rear;
    int MaxSize;
    int QueueArr[];

    QueueEM(int MaxSize){

        this.MaxSize=MaxSize;
        this.rear=-1;
        this.front=-1;
        QueueArr=new int[MaxSize];
    }



    //Enqueue
    void Enqueue(int data){

        if(rear==MaxSize-1){
            System.out.println("Queue is full");
            return;
        }

        if(front==-1){
            front=rear=0;

        }else{
            rear++;
        }
        QueueArr[rear]=data;

    }

    //Dequeue
    int Dequeue(){

        if(front==-1){
            System.out.println("stack is empty");
            return -1;
        }else{
            int temp=QueueArr[front];
            front++;

            if(front > rear){

                front=rear=-1;

            }

            return temp;
        }
    }

    //print Queue
    void printQueue(){

        if(front==-1){
            System.out.println("Queue is empty");
       
        }else{

               for(int i=front;i<=rear;i++){
                System.out.print(QueueArr[i] + ",");
            }
        }

    }

    //empty
    
    boolean isemptyQue(){

        if(front==-1)
                        return true;
        else
                return false;
    }

    //front

    int frontQueue(){
      
        if(front==-1){
            System.out.println("Queue is empty");
            return -1;
        }else{

            return QueueArr[front];
        }
          
    }

    int rearQueue(){

        if(rear==-1){
            System.out.println("Queue is empty");
            return -1;
        }else{
            return QueueArr[rear];
        }
    }

}


class p41 {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Queue");
        int size=sc.nextInt();

        QueueEM Que=new QueueEM(size);

            char ch;
        do{

            System.out.println("1]Enqueue");
            System.out.println("2]Dequeue");
            System.out.println("3]print the queue");
            System.out.println("4]isempty");
            System.out.println("5]front");
            System.out.println("6]rear");


            System.out.println("Enter your choise: ");
            int choise=sc.nextInt();

            switch (choise) {
                case 1:{

                    System.out.println("Enter the data");
                    int data=sc.nextInt();
                    Que.Enqueue(data);

                }
                break;
            
                case 2:{
                    int val=Que.Dequeue();

                    if(val!=-1){
                        System.out.println("Dequeue element is: " + val);
                    }
                }
                break;

                case 3:{

                    Que.printQueue();

                }
                break;

                case 4:{
                          System.out.println(Que.isemptyQue());
                }
                break;

                case 5:{
                     System.err.println("front of the queue is: "+Que.frontQueue());

                }
                break;

                 case 6:{

                     System.out.println("rear of the Queue is: "+ Que.rearQueue());
                 }
                 break;

                default:
                    break;
            }

            System.out.println("Do you want to continue");
            ch=sc.next().charAt(0);


        }while(ch == 'y' || ch =='Y');

    }
}
