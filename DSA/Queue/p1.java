// Queue (regular Queue)

import java.util.*;
class Queued{

	int front;
	int rear;
	int maxSize;
	int arrQue[];

	Queued(int Size){
	
		this.front=-1;
		this.rear=-1;
		this.maxSize=Size;

		 arrQue=new int[Size];
	
	}

     void Enqueued(int data){
     
	     if(rear==maxSize-1){
	     
		     System.out.println("stack is full");
		     return;
	     
	     }
	     if(front==-1){
	     
		     front=rear=0;
		
	     }else{
	     
		     rear++;
		}

	     arrQue[rear]=data;

     }

     int Dequeued(){
     
	     if(front==-1){
	     
		     System.out.println("stack is empty");
		     return -1;
	     }else{
	     
		     int val=arrQue[front];
		     front++;
                        if(front>rear){
			
				front=rear=-1;
			}

		     return val;
	  }

     }


     boolean Emptyd(){
     
	     if(front==-1)
		     return true;
	     else
		     return false;
     
     }

     int Frontd(){
    
	      if(front==-1){
	           
		      System.out.println("stack is empty");
			 return -1;
	      }else{
	          
		      return arrQue[front];
	      
	      }
     }

     int Reard(){
     

              if(rear==-1){

                      System.out.println("stack is empty");
                         return -1;
              }else{

                      return arrQue[rear];

              }
     
     }

     void printQueued(){
     
	     if(front==-1){
	     
		     System.out.println("stack is empty");
		    return; 
	     }else{
	     
		     for(int i=front;i<=rear;i++){
		                     
			     System.out.print(arrQue[i]+" ");
		     
		     }
	     
		     System.out.println();
	     }
     
     }

}


class Client{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);

		

		System.out.println("enter the size of stack: ");
		int size=sc.nextInt();

		Queued Qu=new Queued(size);

              char ch;
		do{
		          System.out.println("welcome to stack: ");
			  System.out.println("1.enqueue");
			  System.out.println("2.dequeue");
			  System.out.println("3.empty");
			  System.out.println("4.front");
			  System.out.println("5.rear");
			  System.out.println("6.printQueue");
			  System.out.println();

			  System.out.println("enter your choise: ");
			  int choise=sc.nextInt();

			  switch(choise){

				  case 1:{
				  
						 System.out.println("enter a data: ");
						 int data=sc.nextInt();
						 Qu.Enqueued(data);
				  
				  }
				  break;

				  case 2:{
				              int val=Qu.Dequeued();

					      if(val != -1){
					      
						      System.out.println("Pop element is : "+val);
					      
					      }
				  
				  }
                                  break;

				  case 3:{
				            boolean val=Qu.Emptyd();

					    if(val){
					    
						    System.out.println("Stack is empty");
					    }else{
					             System.out.println("Stack is not empty");
					    }
				  }
				  break;

				  case 4:{

						 int val=Qu.Frontd();

						 if(val!=-1){
						 
                                                       System.out.println("front value is: "+val);
						 
						 }
				  
				  }
				  break;

				  case 5:{
				            
						  int val=Qu.Reard();


                                                 if(val!=-1){

                                                       System.out.println("front value is: "+val);

                                                 }
				  
				  }
                                  break;

				  case 6:{
				  
						 Qu. printQueued();
				  
				  }
				  break;

			          default:
					  System.out.println("please enter a valid choise: ");
			  
			  }

			  System.out.println("do you want to continue: ");
			  ch=sc.next().charAt(0);


                    }while(ch=='Y' || ch=='y');
	
	}

}
