
//Circular queue

import java.util.*;
class CQueue{

	int front;
	int rear;
	int maxSize;
	int CqueueArr[];

	CQueue(int Size){
	
		this.front=-1;
		this.rear=-1;
		this.maxSize=Size;
		this.CqueueArr=new int[Size];
	
	}

	void EnQueued(int data){
	
		if((rear==0 && rear==maxSize-1) || ((rear+1)%maxSize==front)){
		
		
			System.out.println("Stack is full");
			return;
		}else if(rear==-1){
		
			front=rear=0;
		}else if(rear==maxSize-1 && front != 0){
		
		
			rear=0;
		}else{
		
		
			rear++;
		
		}
             
		CqueueArr[rear]=data;

	
	}


	int DeQueued(){
	
		if(front==-1){
		
			System.out.println("Queue is empty");
 		        return -1;
		
		}else {
		
			int ret=CqueueArr[front];

			if(front==rear){
			
				front=rear=-1;
			
			}else if(front==maxSize-1){
			
				front=0;
			}else{
			
			 
				front++;
			}
		 
			return ret;
		}
	}


	void printCQueue(){
	
		if(front==-1){
		
			System.out.println("Queue is empty: ");
			return;
		}else{
		
			if(front<=rear){
			
				for(int i=front;i<=rear;i++){
				System.out.print(CqueueArr[i]+" ");
			
				}
			}else{
			
				for(int i=front;i<=maxSize-1;i++){
				
					System.out.print(CqueueArr[i]+" ");
				
				}

				for(int i=0;i<=rear;i++){
				
					System.out.print(CqueueArr[i]+" ");
				}
			
			}



		
		}
	
	
	}

}



class Client{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter the size of Queue: ");
		int size=sc.nextInt();
		CQueue CQ=new CQueue(size);

		char ch;
		do{
		
			System.out.println("Welcome to Circular Queue");
			System.out.println("1.Enqueue");
			System.out.println("2.DeQueue");
			System.out.println("3.Print Queue");
			System.out.println("");
	             	
			
			 System.out.println("enter your choise");
                         int choise=sc.nextInt();


			 switch(choise){
			 
				 case 1:{
				            System.out.println("enter the data: ");
					    int data=sc.nextInt();
					    CQ.EnQueued(data);

				 }
				 break;

				 case 2:{
				 
						int ret=CQ.DeQueued();
						if(ret !=-1){
						
							System.out.println("poped Element is : "+ret);
						}
				 
				 }
				 break;

				 case 3:{
				                 CQ. printCQueue();
				 
				 }
				 break;

				 default:
				         System.out.println("please enter valid choise");
			 
			 }

			 System.out.println("Continue?");
			 ch=sc.next().charAt(0);


		}while(ch=='Y' || ch=='y');







	}

}
