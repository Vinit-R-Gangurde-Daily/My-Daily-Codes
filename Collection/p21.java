

import java.util.*;

class Movies{

	String MovName=null;
	double MovColl=0.0;
	float IMDBRating=0.0f;

	Movies(String MovName,double MovColl,float IMDBRating){

		this.MovName=MovName;
		this.MovColl=MovColl;
		this.IMDBRating=IMDBRating;
	
	
	}

	public String toString(){
	
		return "{" + MovName +" : "+ MovColl +" : "+IMDBRating+"}";
	
	}


}

class SortByName implements Comparator<Movies>{

	public int compare(Movies obj1,Movies obj2){
	
		return obj1.MovName.compareTo(obj2.MovName);

	}



}

class SortByColl implements Comparator<Movies>{

	public int compare(Movies obj1,Movies obj2){
	
		return (int)(obj1.MovColl-obj2.MovColl);
	
	}


}

class SortByIMDB implements Comparator<Movies>{

	public int compare(Movies obj1,Movies obj2){
	
		return (int)(obj1.IMDBRating-obj2.IMDBRating);
	
	}


}


class ListSortDemo{

	public static void main(String[] args){
	
		ArrayList ar=new ArrayList();


		ar.add(new Movies("Gaddar",450000,9.6f));
		ar.add(new Movies("OMG2",780000,8.6f));
		ar.add(new Movies("OppenHam",890000,3.6f));
		ar.add(new Movies("Barbi",650000,1.6f));

		System.out.println(ar);

		Collections.sort(ar,new SortByName());

		System.out.println(ar);


                 Collections.sort(ar,new SortByColl());

		 System.out.println(ar);


		 Collections.sort(ar,new SortByIMDB());

		 System.out.println(ar);

	
	
	}


}

