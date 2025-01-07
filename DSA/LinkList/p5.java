

//single circular linked list




import java.util.*;
 class Noded{
 
	 Noded next;
	 int data;
	 Noded(int data){
	 
		 this.data=data;
	 }
 
 }


class Clinked{

	Noded head=null;

         //add first
	void addFirstC(int data){
	
		Noded newNode=new Noded(data);
	      	
		if(head==null){
		
			head=newNode;
			head.next=head;

                           }else{
		
				   Noded temp=head;

				   while(temp.next!=head){
				          temp=temp.next;
				   }

			
				   newNode.next=head;
			
				   head=newNode;
	                           temp.next=head;
			
			   }
                             
		
		}

	//addLast
	void addLastC(int data){
	

         Noded newNode=new Noded(data);
                    
          
		    if(head==null){
		    
		        	    head=newNode;
 		          head.next=head;
		    }else{
		    
			    Noded temp=head;

			    while(temp.next!=head){
			    
				    temp=temp.next;
			    
			    }
		    
			     temp.next=newNode;
			     newNode.next=head;
		    }
	}

	
	void addAtposC(int pos,int data){
	
		if(pos<=0 || pos>=countNodeC()+2){
		
			System.out.println("invalid index");
		}
		
		if(pos==1){
		
                        addFirstC(data);
		
		}else if(pos==countNodeC()+1){
		
			addLastC(data);
                 }else{
		 
			 Noded newNode=new Noded(data);
			 Noded temp=head;

			 while(pos-2!=0){
			 
				 temp=temp.next;

				 pos--;
			 }
		   newNode.next=temp.next;
		   temp.next=newNode;
		 }
	
	
	}
	
   //count node
     int countNodeC(){
     
	     if(head==null){
	     
		     System.out.println("list is empty");
		     return -1;
	     
	     }else{
	     
		     Noded temp=head;
                      int count=0;
		     while(temp.next!=head){
		         count++;
			 temp=temp.next;
		     }
	     
		     return count+1;
	     }
     
     }

     //delete first
      
      void delFirstC(){
      
	      if(head==null){
	      
		      System.out.println("list is empty");
		      return;
	      }else{
	      
		      Noded ett=head;
		      while(ett.next!=head){
		      
			      ett=ett.next;
		      }
	      
		      head=head.next;
		      ett.next=head;
	      }
      
      }     

      void delLastC(){
      
	      if(head==null){
	      
		      System.out.println("link is empty");
		      return;
	      }else{
	      
		      Noded temp=head;

		      while(temp.next.next!=head){
		      
			      temp=temp.next;
		      }
	      
		      temp.next=head;
	      }
      }

      void delAtPosC(int pos){
      
	      
	      if(pos<=0 || pos>=countNodeC()+1){
	      
		      System.out.println("invalid pos");
		      return;
	      }
	      
	      if(pos==1){
	      
                                 delFirstC();
	      
	      }else if(pos== countNodeC()){
	      
		      delLastC();
	      }else{
	      
	      	      
		      Noded temp=head;
		      while(pos-2!=0){
		      
		            temp=temp.next;
			      pos--;
		      }
	          temp.next=temp.next.next;
	      }
      
      }
     //printlist
	void printsll(){
	
		if(head==null){
		
			System.out.println("list is empty: ");
			return;
		
		}else{
		
			Noded ett=head;

		       while(ett.next!=head){
		       
			       System.out.print(ett.data+"  ");
			       ett=ett.next;
		       }
		       System.out.println(ett.data);
		
		}
	
	}
	
	
	
 }




class Client{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);

		Clinked CL=new Clinked();
                 
		char ch;

		do{
		
			System.out.println("Circular Singlylinkedlist ");
			System.out.println("1.addFirst");
			System.out.println("2.addLast");
			System.out.println("3.countNode");
			System.out.println("4.add at possition");
			System.out.println("5.delete first");
			System.out.println("6.del last");
			System.out.println("7.del at possition");
			System.out.println("Print list");

			System.out.println("enter a choise");
			int choise=sc.nextInt();
			switch(choise){
			
				case 1:{
				               System.out.println("enter a data: ");
					       int data=sc.nextInt();
                                               
					       CL.addFirstC(data);
					       
				}
				break;

				case 2:{
				
					       System.out.println("enter a data: ");
					       int data=sc.nextInt();

                      		              CL.addLastC(data);

				}
				break;

				case 3:{
				
					       int ret=CL.countNodeC();

				               if(ret!=-1){
					       
						       System.out.println("num of node is: "+ret);
					       }
				}
				break;

				case 4:{
				              System.out.println("enter a pos");
					      int pos=sc.nextInt();
					      System.out.println("enter a data");
					      int data=sc.nextInt();

					      CL.addAtposC(pos,data);
				
				}
				break;
				
				case 5:{
				           CL.delFirstC();
				
				}
				break;
				
				
				case 6:{
				
					       CL.delLastC();
				
				}
				break;
				
				
				case 7:{
				
					       System.out.println("enter a pos");
					       int pos=sc.nextInt();
                                                         
					       CL.delAtPosC(pos);
					       
				}
				break;
				
				
				case 8:{
				
					       CL.printsll();
				
				}
				break;

				default:
				          System.out.println("please enter valid choise: ");
			
			}

			System.out.println("Continue ?");
			ch=sc.next().charAt(0);
		
		}while(ch=='Y' || ch=='y');

	
	}

}
