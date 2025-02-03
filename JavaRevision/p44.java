import java.util.Scanner;

class NodeB{

    NodeB rightN;
    NodeB leftN;
    int data=0;

    NodeB(int data){

        this.data=data;

        rightN=leftN=null;
    }

}

class tree{

    Scanner sc=new Scanner(System.in);

    NodeB ConstructBT(){

        System.out.println("enter the data for Node");
        int data=sc.nextInt();

        NodeB newNode=new NodeB(data);

        System.out.println("do you want to add data at left: " + newNode.data);
        char le=sc.next().charAt(0);

        if(le=='Y'||le=='y'){

            newNode.leftN=ConstructBT();
            
        }

        System.out.println("do you want to add data at right " + newNode.data);
        char ri=sc.next().charAt(0);

        if(ri=='y' || ri=='Y'){

            newNode.rightN=ConstructBT();

        }

        return newNode;

    }

     void PreOrder(NodeB root){

        if(root==null)
            return;

        
            System.out.print(root.data + "->");

            PreOrder(root.leftN);
            PreOrder(root.rightN);
         
     }

     void InOrder(NodeB root){

        if(root==null)
            return;

        InOrder(root.leftN);
        System.out.print(root.data + "->");
        InOrder(root.rightN);
     }

     void PostOrder(NodeB root){

         if(root==null)
            return;

        PostOrder(root.leftN);
        PostOrder(root.rightN);
        System.out.print(root.data + "->");
     }

     int count=0;
     int countNode(NodeB rootB){

        
        if(rootB==null)
             return 0;

        count++;
        countNode(rootB.leftN);
        countNode(rootB.rightN);

        
        
        return count;
     }

     int sum=0;
     int SumOfNodes(NodeB root){
        
        if(root== null)
           return 0;

           sum=sum+root.data;

           SumOfNodes(root.leftN);
           SumOfNodes(root.rightN);

         
        return sum;
     }

    public static void main(String[] args){
 
        NodeB root;
        tree obj1=new tree();

        root=obj1.ConstructBT();
        

        System.out.print("Pre-Order: ");
        obj1.PreOrder(root);

        System.out.print("In-Order: ");
        obj1.InOrder(root);

        System.out.println("Post-Order: ");
        obj1.PostOrder(root);
        
        System.err.println("Num of nodes in tree is :  " + obj1.countNode(root));
    
        System.out.println("Sum Of all digits are: " + obj1.SumOfNodes(root));
    }

}