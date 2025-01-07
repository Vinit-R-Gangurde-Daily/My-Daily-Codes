class player{
	String player1 ="Messi";
	int age =35;

	void goal_score(){ 
	int goal=800;
	
	int assist=350;

	System.out.println("Goal score by "+player1+" "+goal);

	System.out.println("Assists by "+player1+" "+assist);
	}
}
class football{
	public static void main (String args[]){
	player obj=new player();
	obj.goal_score();
	}
}



	
