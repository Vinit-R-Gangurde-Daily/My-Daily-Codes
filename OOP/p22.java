


class Match{


	void MatchType(){
	
		System.out.println("T20/IPL/TEST");
	
	
	}


}

class T20 extends Match{

	void MatchType(){
	
		System.out.println("T20");
	
	
	}


}

class IPL extends Match{


	void MatchType(){
	
		System.out.println("IPL");
	
	}

}

class Client{

	public static void main(String[] args){
	
		Match obj1=new T20();
		obj1.MatchType();
		
		Match obj2=new IPL();
	        obj2.MatchType();
	}

}



