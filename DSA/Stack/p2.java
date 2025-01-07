

import java.util.*;
class Stackd{

	int maxSize;
	int stackArr[];
	int top=-1;

	Stackd(int size){
	
		this.maxSize=size;
		this.stackArr=new int[size];
	}

	//push
	void Pushd(int data){
	
		if(top == maxSize-1){
		
			System.out.println("stack is over flow");
			return;
		}else{
		
			top++;
			stackArr[top]=data;

		}
   }
	          //empty
		boolean emptyd(){
		
			if(top==-1)
				return true;
			else
				return false;
		}
		
		//pop
		int Popd() {
	
		     if(emptyd()){
		
			System.out.println("stack is empty");
			return -1;
		}else{
		
			int val=stackArr[top];
			top--;
			return val;
		

		}
	
	}
	         //peek
               int Peekd(){
	       
		       if(emptyd()){
		       
			       System.out.println("stack is sempty");
			       return -1;
		       }else{
		       
			       return stackArr[top];
		       
		       }
	       }

	       //size
	       int Sized(){
	       
		       return top;
	       }

	       void printStack(){
	       
		       if(emptyd()){
		       
			       System.out.println("Stack is empty");
			       return;
		       }else{
			       System.out.print("[");
		       for(int val=0;val<=top;val++){
		       
			       System.out.print(stackArr[val]+" ");
		       }
	              System.out.println("]");
	       }
	   }
	
}


class Client{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of stack: ");
                 int size=sc.nextInt();
               
		  Stackd S=new Stackd(size);


		 char ch;
		 do{
		 
			 System.out.println("welcome to stack world");
			  System.out.println("1.push");
			   System.out.println("2.pop");
			    System.out.println("3.peek");
			     System.out.println("4.empty");
			      System.out.println("5.size");
			       System.out.println("6.printStack");

			        System.out.println("enter a choice: ");
				int choice=sc.nextInt();

				switch(choice){
				
					case 1:{
					
						        System.out.println("enter a data");
							int data=sc.nextInt();
						        S.Pushd(data);
					
					}
					break;

					case 2:{
					
						       int val=S.Popd();

						       if(val != -1){
						       
							       System.out.println("Poped element is: "+ val);
						       }
					}
                                        break;

					case 3:{
					                 
						       int val=S.Peekd();

						       if(val != -1){
						       
							       System.out.println("peek element is: "+ val);
						       }
					
					}
					break;

					case 4:{
					
						       boolean val=S.emptyd();

						       if(val){
						       
							       System.out.println("stack is empty");

						       }else{
						       
							       System.out.println("stack is not empty");
						       }
					} 
					break;

					case 5:{
					
						       int val=S.Sized();

						       System.out.println("stack size is "+(val+1));
					
					
					}
					break;

					case 6:{
					
                                                   S.printStack();
       
					}
					break;

					default:
					             System.out.println("in valid choise");
				
				}
		
				System.out.println("do you want to countinue?: ");
				ch=sc.next().charAt(0);
		
		
		 }while(ch=='y' || ch=='Y');


	
	
	}

}
