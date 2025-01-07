
import java.util.*;

class Node{


	Node left;
	Node right;
	int data;

	Node(int data){
	
		this.data=data;
		left=right=null;

	}
}


class BinaryTreeClient{

	
	Scanner sc=new Scanner(System.in);
	Node ConstructBT(){
	
		System.out.println("enter the data for node");
		int data=sc.nextInt();

		Node newNode=new Node(data);

		System.out.println("do you want to add node at left of: " + newNode.data);
		char leftNode=sc.next().charAt(0);

		 if(leftNode == 'y' || leftNode == 'Y'){
		 
			 newNode.left=ConstructBT();
		 }

		 System.out.println("do you want to add node at right of: " + newNode.data);
		 char rightNode=sc.next().charAt(0);

		 if(rightNode=='y' || rightNode=='Y'){
		 
			 newNode.right=ConstructBT();
		 }

		 return newNode;
	
	}
	//InOrder

	void InOrderBT(Node root){

	       if(root==null){
	           return;
	       }

	       System.out.println(root.data);
	       InOrderBT(root.left);
	       InOrderBT(root.right);

	
	}

	//preOrder
	 void PreOrderBT(Node root){

               if(root==null){
                   return;
               }

               
               PreOrderBT(root.left);
                System.out.println(root.data);
	       PreOrderBT(root.right);


        }
        
	//PostOrder
	 void PostOrderBT(Node root){

               if(root==null){
                   return;
               }

            
               PostOrderBT(root.left);
               PostOrderBT(root.right);
               System.out.println(root.data);

        }

	public static void main(String[] args){
	
		Node root=null;


		BinaryTreeClient BT=new BinaryTreeClient();

		root=BT.ConstructBT();

		System.out.println("In order : ");
		BT.InOrderBT(root);
	


                System.out.println("pre Order: ");
		BT.PreOrderBT(root);

		System.out.println("Post Order: ");
		BT.PostOrderBT(root);


	    
	
	
	}

}

                     































