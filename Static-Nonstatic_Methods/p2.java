


class Demo{

	int x=10;
	static int y=20;

	void fun(){                            //in non static context we can wright static as will as non static variable & method 
	
		System.out.println(x);
		System.out.println(y);
	
	}

	static void gun(){                        // but in static context we can wright static variable & method only
					     // do not wright the non static var & method
	
		System.out.println(y);

		//System.out.println(obj.y);  give the error
	
	}

}



class MainDemo{

	public static void main(String[] args){
	
	
		Demo obj=new Demo();

		obj.fun();
		obj.gun();

	    System.out.println(obj.x);
	    System.out.println(obj.y);
	
	
	}






}
