//-----------------------Input Using the Scanner class---------------------------

// import java.util.Scanner;
// class p6{
  
//     public static void main(String[] args) {
        
//         Scanner obj=new Scanner(System.in);
//         System.out.print("enter the name: ");
//         String name=obj.next();
//         System.out.print("Enter the roll num: ");
//         int roll=obj.nextInt();

//         System.out.println(name);
//         System.out.println(roll);
//     }
// }



// import java.util.Scanner;

// class f6{
//     public static void main(String[] args) {
        
//         Scanner obj=new Scanner(System.in);
//         System.out.println("Enter the name: ");
//         String name=obj.next();

//         System.out.println("enter the expected pak: ");
//         long sal=obj.nextLong();

//         System.out.println("Enter the CGPA: ");
//         float CGPA=obj.nextFloat();



//         System.out.println("Name: " + name);
//         System.out.println("Salary: " + sal);
//         System.out.println("Total CGCA: " + CGPA);

//     }
// }


//---------------Input using Buffered Reader----------------------

// import java.io.*;
// class p6{
//     public static void main(String[] args)throws IOException {
        
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           
//         System.out.print("Enter the name: ");
//         String name=br.readLine();

//         System.out.println(name);
//     }
// }


//-----------------

// import java.io.*;
// class p6{
//     public static void main(String[] args)throws IOException{
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

//         System.out.print("Enter the player Name: ");
//         String name=br.readLine();

//         System.out.print("Enter the jr num: ");
//         int jr=Integer.parseInt(br.readLine());

//         System.out.print("Enter the ava: ");
//         float ava=Float.parseFloat(br.readLine());

//         System.out.println("Name: " + name);
//         System.out.println("jr: " + jr);    
//         System.out.println("ava: " + ava);

//     }
// }

//---------------------------------

// import java.io.*;
// class f6{
//     public static void main(String[] args)throws IOException{
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("enter the Name: ");
//         String name=br.readLine();

//         System.out.println("Enter the wing: ");
//        // char wing=Character.parsechar(br.readLine());
//        String wing=br.readLine();
    
//         System.out.println("enter the flat num: ");
//         int flatnum=Integer.parseInt(br.readLine());

//         System.out.print("Enter the num of years spend by owner: ");
//         long yer=Long.parseLong(br.readLine());
//     }
// }