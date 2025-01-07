
/*
 
   in this program we will create two constuctor having same parameter list of same class which is not possible we will create only one constructor which have same parameter list for each class (we can create many constuctor for same class but it will have different parameter list)
 
           error 
	          constructor Demo() is already defined in class Demo

		  ------this will be possible becouse of method segnature -------

*/
class Demo{

	
	Demo(){
	
		System.out.println("in Constructor 1");
	
	}

	Demo(){
        
		System.out.println("in Constructor 2");
	
	}
	
	public static void main(String[] args){
	


	
	}

}
