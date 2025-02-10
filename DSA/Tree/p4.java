




//delete element from the BST

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




class BinarySearchTreeClientP4{


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



    void PrintInRange(Node root,int x,int y){

        if(root==null){
            return;
        }

        if(root.data>=x && root.data<=y){
            PrintInRange(root.left, x, y);
            System.out.print(root.data + " ");
            PrintInRange(root.right, x, y);
        }else if(root.data>=y){
            PrintInRange(root.left, x, y);
        }else{
            PrintInRange(root.right,x,y);
        }

    }
    


    void InOrder(Node root){

        if(root==null){
            return ;
        }

        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);

        
    }

    void PrintPath(ArrayList<Integer> path){

        for(int i=0;i<path.size();i++){
            System.out.println(path.get(i));
        }

    }

    void FindThePath(Node root,ArrayList<Integer> path){

        if(root==null){
            return ;
        }


        path.add(root.data);

        if(root.left==null && root.right==null){
            PrintPath(path);
        }else{
        FindThePath(root.left, path);
        FindThePath(root.right, path);
        }

        path.remove(path.size()-1);




    }
   
    
    public static void main(String[] args) {
        
 Scanner sc=new Scanner(System.in);
        Node root=null;

        BinarySearchTreeClientP4 BST=new BinarySearchTreeClientP4();

      
        int val[]={8,5,3,1,4,6,10,11,14};
      
        
        for(int i=0;i<val.length;i++){
        root=BST.CreateBST(root,val[i]);
        }

        BST.InOrder(root);

        System.out.println();

        BST.PrintInRange(root, 6, 10);


        
        

        
    }
}
