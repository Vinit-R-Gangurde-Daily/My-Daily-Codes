

class ICC{

	ICC(){
	
		System.out.println("in ICC Constructor");
	
	}

	


}


class BCCI extends ICC{

	
	BCCI(){
	
		System.out.println("in BCCI Constructor");
	}

}

class Clint{

	public static void main(String[] args){
	
	BCCI obj=new BCCI();
	
	}
}
