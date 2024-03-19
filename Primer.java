class Primer{

     String  brandName;
	 String  volume;
	 int price;
	 boolean isMadeInIndia;
	 String[] ingredients = new String[6];

	public Primer(){
		
	}
	
	public Primer(String brandName,String volume ,int price,boolean isMadeInIndia , String[] ingredients){
		System.out.println("Primer constructor is invoked");
		this.brandName = brandName;
		this.volume = volume;
		this.price = price;
		this.isMadeInIndia = isMadeInIndia;
		this.ingredients = ingredients;
	}
	
	public void face(){
		System.out.println();
	}
	
	public void displayInfo(){
		System.out.println("Primer before init");
		System.out.println("Primer brandName is " + brandName);
		System.out.println("Primer volume is " + volume);
		System.out.println("Primer price is " + price);
		System.out.println("is Primer MadeInIndia " + isMadeInIndia);
		System.out.println("ingredients used ");
		for(int index = 0 ; index<this.ingredients.length; index++){
			System.out.print(ingredients[index] + " , ");
		}
		System.out.println();
	}
}