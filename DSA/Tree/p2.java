

//Binary Search Tree(BST)
//every element of the left side of root is less than root element
//and every right side element of root is more than root element

//BST work as Binary search
//BT(Binary tree) work as lenear search

import java.util.*;

class Node{


    int data=0;
    Node right;
    Node left;

    Node(int data){
        this.data=data;
        right=left=null;
    }

}




class BinarySearchTreeClient{


    // Creating the BST
    Node CreateBST(Node root,int Val){


        if(root==null){

            root=new Node(Val);
            return root;
        }

        if(root.data>Val){
            root.left=CreateBST(root.left,Val);
        }else{
             root.right=CreateBST(root.right, Val);
        }


        return root;
    }


    


    //In-order Traverser
    //when we perform a In-Order traverser on BST output will always a sorted sequence of the number 

    void InOrderBT(Node root){

        if(root==null){
            return;
        }

        
        InOrderBT(root.left);
         System.out.println(root.data);
    InOrderBT(root.right);


 }


 // search the element over a BST
 Boolean SearchElementBST(Node root,int val){

    if(root==null){
        return false;
    }
    
    
    // if(root.data==val){
    //     return true;
    // }

       
       if(root.data>val){
           return SearchElementBST(root.left,val);
       }if (root.data==val) {

         return true;
        
       } else{

          return SearchElementBST(root.right,val);
       }

}
    
    public static void main(String[] args) {
        
 Scanner sc=new Scanner(System.in);
        Node root=null;

        BinarySearchTreeClient BST=new BinarySearchTreeClient();

      
        int val[]={5,1,3,4,2,7};
      
        
        for(int i=0;i<val.length;i++){
        root=BST.CreateBST(root,val[i]);
        }



        BST.InOrderBT(root);

        System.out.print("enter the number you want to search In tree: ");
        int data=sc.nextInt();
             
        System.out.println(BST.SearchElementBST(root,data));
        
 
    }
}
