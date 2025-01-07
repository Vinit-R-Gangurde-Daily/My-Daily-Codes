/*
 
   in java we can access static method and variable with the help of class name
 
 
 */


class Demo{

	static int a=10;

	static String str="vinit";

	static void fun(){
	
		System.out.println(a);
		System.out.println(str);
	
	}



}


class MainDemo{

	public static void main(String[] args){
	
	
         System.out.println(Demo.a);             //here we are accessing the all variable  and method of demo in MainDemo without crating any objec 
	 System.out.println(Demo.str);      // becouse all variables and method of demo is static and in java we are capable to accessing the static
					     // method & variable with the help of class name
	 Demo.fun();
	
	}


}
