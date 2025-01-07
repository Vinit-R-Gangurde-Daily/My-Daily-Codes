

//stack using link list

import java.util.*;

class Noded{

	Noded next=null;
	int data;

	Noded(int data){
	
		this.data=data;
	}

}



class StackLin{

	Noded Top=null;
	
	void pushL(int data){
	
		Noded newNode=new Noded(data);

		if(Top==null){
		
			Top=newNode;
		}else{
		
			newNode.next=Top;
			Top=newNode;
		
		}
	
	}


       int popL(){
       
	       if(Top==null){
	       
		       System.out.println("Stack is empty");
		       return -1;
	       }else{
	       
		       int ret=Top.data;
		       Top=Top.next;
		       return ret;
	       
	       }
       
       } 

       int peekL(){
       
	       if(Top==null){
	       
		       System.out.println("Stack is empty");
		       return -1;
	       }else{
	       
		       return Top.data;
	       }
       
       }

       void printL(){
       
	       if(Top==null){
	       
		       System.out.println("Stack is empty: ");
		       return;
	       }else{
	       
		       Noded temp=Top;

		       while(temp!=null){
		       
			       System.out.print(temp.data+" ");
			       temp=temp.next;
		       }
	       }
      }

      
          boolean emptyL(){
	  
		  if(Top==null)
			  return true;
		  else
			  return false;
	  
	  }

	  int SizeL(){
	  
		 if(emptyL()){
		 
			 System.out.println("stack is empty");
			 return -1;
		 }else{
		 
			 Noded temp=Top;
			 int count=0;
			 while(temp!=null){
			 
				 count++;
				 temp=temp.next;
			 
			 }
			 return count;
		 
		 }
	  
	  }

}



class Client{

	public static void main(String[] args){
	
		StackLin SL=new StackLin();

		Scanner sc=new Scanner(System.in);

		char ch;
		do{


			System.out.println("stack using link list");
			System.out.println("1.push");
			 System.out.println("2.pop"); 
			 System.out.println("3.peek");
			 System.out.println("4.empty");
			 System.out.println("5.size");
			 System.out.println("6.print");
			 System.out.println("enter you choise");
                         int choise=sc.nextInt();

			 switch(choise){
			 
				 case 1:{
				 
						 System.out.println("enter data");
						 int data=sc.nextInt();
                                                    
						  SL.pushL(data);

	                       }
			       break;

				  case 2:{
						  int val=SL.popL();

						  if(val!=-1){
						  
							  System.out.println("pop element is : "+val);
						  
						  }
				 }
				 break;
	 		 
				  case 3:{
				                  int val=SL.peekL();
						  if(val != -1){
						  
							  System.out.println("peek element is: "+val);
						  }
				  }

				  case 4:{

						   boolean val=SL.emptyL();

                                             if(val){

                                                     System.out.println("Stack is empty");
                                             }else{

                                                     System.out.println("stack is not empty");
                                             }
				  
				  }
				break;  
				  
				  case 5:{
				  
						 int ret=SL.SizeL();

						 if(ret!=-1){
						 System.out.println("Size of stack is: "+ret);
						 }
				  
				  }
				  break;
				  case 6:{
						 SL.printL();
				  
				  }
				  break;

				
				  
				 default:
			                 System.out.println("please enter a valid choise");
			 
			 }

		
			 System.out.println("do you want to continue");
			 ch=sc.next().charAt(0);
		
		}while(ch=='Y' || ch=='y');
	
	
	}

}












