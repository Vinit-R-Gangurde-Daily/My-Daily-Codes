
import java.util.*;


class Players implements Comparable{

	String Name=null;
	int jerNo=0;

	Players(String Name,int jerNO){
	
		this.Name=Name;
		this.jerNo=jerNO;
	
	}

	
	public int compareTo(Object obj){

		return (Name.compareTo(((Players)obj).Name));
	
	
	}
	public String toString(){
	
		return Name;
	
	}
	


}

class TreeSetDemo{

	public static void main(String[] args){
	
		TreeSet St=new TreeSet();
	
           St.add(new Players("Bhushan",45));
           St.add(new Players("Akash",25));
           St.add(new Players("Dhanu",55));
           St.add(new Players("Tanu",35));
	
	System.out.println(St);
	
	
	}


}
