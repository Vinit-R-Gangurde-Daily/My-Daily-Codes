/*
 
 
    identityHashCode of str1 and str2 is same but 
    the identityHashCode of str3 is differet Becouse it will get the space on scp 
 
 */




class Demo{

        int x=20;  // instance variable so enitialize in constructor 
       String str1="vinit"; //get store in SCP(string constant pull)
	
       
        void fun(){
	
	
		 String str2="vinit";    
		  System.out.println(System.identityHashCode(str2));

		 String str3=new String("vinit");
		 System.out.println(System.identityHashCode(str3));
	
	}
       
       public static void main(String[] args){
	
                  Demo obj=new Demo();

		  obj.fun();

       
	System.out.println(System.identityHashCode(obj.str1));
	
	
	}


}
