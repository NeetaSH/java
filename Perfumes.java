class Perfumes{
    String brandName;
	String size;
	double price;
	
	
	/*public Perfumes(){
	System.out.println("object is created ");
	}
	
	public Perfumes(String bName, String sze, double prc){
	System.out.println("object is created ");
	        brandName = bName;
	        size = sze;
	        price = prc;
			
	}*/
	
	public Perfumes(String brandName, String size, double price){
	System.out.println("Perfumes constructor is invoked ");
	        this.brandName = brandName;
	        this.size = size;
	        this.price = price;
	}		
	
	public void fregance(){
	System.out.println("to smell good");
	}
	
	public void displayInfo(){
		System.out.println("perfumes info before init ");
		System.out.println("perfumes brandName is " + brandName);
		System.out.println("perfumes size is " + size);
		System.out.println("perfumes price is " + price);
	}

}