

//delete element from the BST

import java.util.*;

class NodeBST{


    int data=0;
    NodeBST rightBST;
    NodeBST leftBST;

    NodeBST(int data){
        this.data=data;
        rightBST=leftBST=null;
    }

}




class BinarySearchTreeClientP3{


    // Creating the BST
    NodeBST CreateBST(NodeBST root,int Val){


        if(root==null){

            root=new NodeBST(Val);
            return root;
        }

        if(root.data>Val){
            root.leftBST=CreateBST(root.leftBST,Val);
        }else{
             root.rightBST=CreateBST(root.rightBST, Val);
        }


        return root;
    }


    


    //In-order Traverser
    //when we perform a In-Order traverser on BST output will always a sorted sequence of the number 

    void InOrderBT(NodeBST root){

        if(root==null){
            return;
        }

        
        InOrderBT(root.leftBST);
         System.out.print(root.data + " ");
    InOrderBT(root.rightBST);


 }


//delete root node


     NodeBST deleteNodeBST(NodeBST root,int val){

        // if(root==null){
        //     return false;
        // }
        
        

        if(root.data>val){
            
            root.leftBST=deleteNodeBST(root.leftBST, val);
            
            
        }else if(root.data<val){

            root.rightBST= deleteNodeBST(root.rightBST, val);
        
        }else{

            //case 1 where we delete the leave node from the tree(do nog having any child)
            if(root.rightBST==null && root.leftBST==null){
                return null;
            }
              
            
           //case 2 where we delete a node having a One child

           if(root.rightBST==null){
              return root.leftBST;
           }else if(root.leftBST==null){
            return root.rightBST;
           }


           // case 3 where we delete a node having 2 child

           NodeBST IS=FindIS(root.rightBST);
             root.data=IS.data;
             root.rightBST=deleteNodeBST(root.rightBST,IS.data);
             


        }

       return root;
    
    }

    //finding the Inorder-Successor of element which we want to delete

    NodeBST FindIS(NodeBST root){

        while(root.leftBST != null){
            root=root.leftBST;
        }
        return root;
    }
    
    public static void main(String[] args) {
        
 Scanner sc=new Scanner(System.in);
        NodeBST root=null;

        BinarySearchTreeClientP3 BST=new BinarySearchTreeClientP3();

      
        int val[]={5,1,3,4,2,7};
      
        
        for(int i=0;i<val.length;i++){
        root=BST.CreateBST(root,val[i]);
        }

        BST.InOrderBT(root);

        
        System.out.println();

        System.out.print("Enter the leaf Node you want to delete: ");
        int dele=sc.nextInt();
    
        BST.deleteNodeBST(root,dele);


        BST.InOrderBT(root);

        
 
    }
}
