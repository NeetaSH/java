class Perfume{
    String ingredients[] = new String[3];
    String brandName;
	String volume;
	double price;
	boolean isMadeInIndia;
	
	public Perfume(){
	
	}
     
	
	public Perfume(String ingredients[] ,String brandName, String volume, double price, boolean isMadeInIndia){
	System.out.println("Perfumes constructor is invoked ");
	        this.ingredients = ingredients;
	        this.brandName = brandName;
	        this.volume = volume;
	        this.price = price;
			this.isMadeInIndia = isMadeInIndia ;
	}		
	
	public void fregance(){
	System.out.println("to smell good");
	}
	
	public void displayInfo(){
		System.out.println("perfumes info before init ");
		System.out.println("perfumes brandName is " + brandName);
		System.out.println("perfumes volume is " + volume);
		System.out.println("perfumes price is " + price);
		System.out.println("perfumes isMadeInIndia " + isMadeInIndia);
		System.out.println("ingredients Used : ");
		for(int index = 0 ; index < this.ingredients.length; index++){
		System.out.print(this.ingredients[index] +" ,");
		}
		System.out.println();
	}

}