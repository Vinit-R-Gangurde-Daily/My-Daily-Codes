

// Singly LinkList

import java.util.*;
class Node{

	int data;
	Node next=null;

	Node(int data){
	
		this.data=data;
	}

}

class LinkedList{

	Node head=null;
      //add fist
	void addFirst(int data){
	 
		Node newNode=new Node(data);

		if(head == null){
		    
			head=newNode;
		}else{
		
			newNode.next=head;
			head=newNode;
		}
	}
 
	//add last
	void addLast(int data){
	
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
	int countNode(){
	
		Node temp=head;
                int count=0;

		while(temp!=null){
		
                    count++;
		    temp=temp.next;
		}
	     return count;
	}

	//add at Possition
	void addAtPos(int pos,int data){
	  
	      if(pos<=0 || pos>=countNode()+2){

		      System.out.println("wrong Input");
	             return;
	      }

	      if(pos==1){
	      
		      addFirst(data);
	      }else if(pos==countNode()+1){
	      
		      addLast(data);
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
         void delFirst(){
               
	         if(head==null){
		 
			 System.out.println("list is empty");
		 }
		 
		 if(countNode()==1){
		 
			 head=null;
		 
		 
		 }else{
		     
			 head=head.next;
		 
		 }	 

	 
	 }
 
	 //delete last
	 void delLast(){
	 
		 if(head==null){
		 
			 System.out.println("list is empty");
                           return;		 
		 }

		 if(countNode()==1){
		 
			 head=null;
		 }else{
		 Node temp=head;

		 while(temp.next.next!=null){
		 
			 temp=temp.next;
		 
		 }
		 temp.next=null;
	    }
	 }


	 void delAtPos(int pos){
	 
		 if(pos<=0 || pos>countNode()+1){
		 
			 System.out.println("in valid Index");
			 return;
		 
		 }

		 if(pos==1){
		  
			 delFirst();
		 
		 }else if(pos==countNode()){
		 
			 delLast();
		 }else{
		 
			 Node temp=head;

			 while(pos-2 != 0){
			 
				 temp=temp.next;
			    pos--;
			 }
		      temp.next=temp.next.next;
		 }
	 
	 }

	//print list
	void printSLL(){
	
		if(head==null){
		
			System.out.println("Empty Linkedlist");
			return;
		}else{
		      
			Node temp=head;

			while(temp != null){
			
				System.out.print(temp.data + "->");
				temp=temp.next;
			
			}
			System.out.println();
		}
	}


}
class Client{

	public static void main(String[] args){
	
		LinkedList ll=new LinkedList();

	          char ch;
                  do{
		        System.out.println("singly Linked List: ");
			System.out.println("1.add first");
			System.out.println("2.add Last");
			System.out.println("3.add at pos");
                        System.out.println("4.del first");
		        System.out.println("5.del last");
			System.out.println("6.del at pos");
                        System.out.println("7.count Node");
			System.out.println("8.print SLL");
			
			System.out.println("Enter your choice: ");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();

			switch(choice){
			
				case 1:{
				              System.out.println("enter the data");
					      int data=sc.nextInt();
					      ll.addFirst(data);
				
				        }
				       break;

				 case 2:{
                                              System.out.println("enter the data");
                                              int data=sc.nextInt();
                                              ll.addLast(data);

                                        }
                                       break;

				  case 3:{
                                              System.out.println("enter the data");
                                              int data=sc.nextInt();
					      System.out.println("enter the pos");
					      int pos=sc.nextInt();

                                              ll.addAtPos(pos,data);

                                        }
					break;
                                   
				   case 4:
					   ll.delFirst();
                                       break;
			        
			           case 5:
			                   ll.delLast();
			                break;

		                    case 6: {
				                  System.out.println("enter a possition");
						  int pos=sc.nextInt();
						  ll.delAtPos(pos);
				    }
			 	          break;
				    case 7:{
					    int count=ll.countNode();
					    System.out.println(count);
                                             break;
				    }
			            case 8:
					    ll.printSLL();
		                             break;

				     default:
					     System.out.println("wrong choise: ");
					     break;
			
			}

			System.out.println("Continue ?");
			ch=sc.next().charAt(0);

		  }while(ch=='Y' || ch=='y');
	}

}
