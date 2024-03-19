class Toner{

     String  brandName;
	 String  volume;
	 int price;
	 boolean isMadeInIndia;
	 String[] ingredients = new String[3];

	public Toner(){
		
	}
	
	public Toner(String brandName,String volume ,int price,boolean isMadeInIndia , String[] ingredients){
		System.out.println("Toner constructor is invoked");
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
		System.out.println("Toner before init");
		System.out.println("Toner brandName is " + brandName);
		System.out.println("Toner volume is " + volume);
		System.out.println("Toner price is " + price);
		System.out.println("is Toner MadeInIndia " + isMadeInIndia);
		System.out.println("ingredients used ");
		for(int index = 0 ; index<this.ingredients.length; index++){
			System.out.print(ingredients[index] + " , ");
		}
		System.out.println();
	}
}