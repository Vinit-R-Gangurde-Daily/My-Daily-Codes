


/*
 
 change the value of private variables or string from another class using method
 
 */
class lab{

	private int Books=0;
	private String BookName=null;

	void labIncharge(int Books,String BookName){

	this.Books=Books;
        this.BookName=BookName;

          
              System.out.println(Books + " = " + BookName);	
	
	}


}


class Student{



	public static void main(String[] args){
	
	
		lab obj1=new lab();
                  obj1.labIncharge(2,"Oxfoert");

		 lab obj2=new lab();
		   obj2.labIncharge(4,"Sham Chi Aaie");

	
	}

}
