import java.util.Scanner;

class Node{

    int data;
    Node right;
    Node left;

    Node(int data){
        this.data=data;
        right=left=null;
    }
}


class p43Client {

    Scanner sc=new Scanner(System.in);
    
    
    Node CreateBT(){

        System.out.println("enter the data for node");
        int data=sc.nextInt();

        Node newNode=new Node(data);

        System.out.println("do you want to enter data at left side of: " + newNode.data);
        char leftSide=sc.next().charAt(0);

        if(leftSide=='y' || leftSide=='Y'){

            newNode.left=CreateBT();

             
        }

        System.out.println("do you want to enter data at right side of: " + newNode.data);
        char rightSide=sc.next().charAt(0);

        if(rightSide=='y' || rightSide=='Y'){

            newNode.right=CreateBT();
        }

        return newNode;

    }


    void InorderBT(Node root){

        if(root==null)
                return;

        System.out.println(root.data);
        InorderBT(root.left);
        InorderBT(root.right);

    }

    void PreorderBT(Node root){

        if(root==null)
                return;

        
        PreorderBT(root.left);
        System.out.println(root.data);
        PreorderBT(root.right);

    }

    void PostorderBT(Node root){

        if(root==null)
                return;

       
        PostorderBT(root.left);
        PostorderBT(root.right);
        System.out.println(root.data);

    }

    public static void main(String[] args){

        Node root;
        
        p43Client BL=new p43Client();

        root=BL.CreateBT();

        System.out.println("In order: ");
        BL.InorderBT(root);

        System.out.println("pre order: ");
        BL.PreorderBT(root);

        System.out.println("Post order: ");
        BL.PostorderBT(root);




    }
}
