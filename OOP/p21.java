

class IPL{

	void matchinfo(String team1,String team2){
	
		System.out.println(team1+" vs "+team2);
	}

	void matchinfo(String team1,String team2,String vanue){
	
		System.out.println(team1+" vs "+team2);
		System.out.println("vanue="+vanue);
	}

}

class Client{

	public static void main(String[] args){
	
	
		IPL obj=new IPL();
		obj.matchinfo("CSK","GT");
		obj.matchinfo("CSK","GT","GPSC");
	
	}

}
