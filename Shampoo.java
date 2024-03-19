class Shampoo{

     String  brandName;
	 String  volume;
	 int price;
	 boolean isMadeInIndia;
	 String[] ingredients = new String[17];

	public Shampoo(){
		
	}
	
	public Shampoo(String brandName,String volume ,int price,boolean isMadeInIndia , String[] ingredients){
		System.out.println("Shampoo constructor is invoked");
		this.brandName = brandName;
		this.volume = volume;
		this.price = price;
		this.isMadeInIndia = isMadeInIndia;
		this.ingredients = ingredients;
	}
	
	public void wash(){
		System.out.println();
	}
	
	public void displayInfo(){
		System.out.println("Shampoo before init");
		System.out.println("Shampoo brandName is " + brandName);
		System.out.println("Shampoo volume is " + volume);
		System.out.println("Shampoo price is " + price);
		System.out.println("is Shampoo MadeInIndia " + isMadeInIndia);
		System.out.println("ingredients used ");
		for(int index = 0 ; index<this.ingredients.length; index++){
			System.out.print(ingredients[index] + " , ");
		}
		System.out.println();
	}
}