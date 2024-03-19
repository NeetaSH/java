class Soup{
    String brandName;
	String flavour;
	int price;
	String[] ingredients = new String[17];
	
	
	public Soup(){
		
	}
	
	public Soup(String brandName,String flavour,int price,String[] ingredients){
		System.out.println("Soup constructor is invoked");
		this.brandName = brandName;
		this.flavour = flavour;
		this.price = price;
		this.ingredients = ingredients;
	}
	
	public void richTeste(){
		System.out.println();
	}
	
	public void displayInfo(){
		System.out.println("soup before init");
		System.out.println("soup brandName is " + brandName);
		System.out.println("soup flavour is " + flavour);
		System.out.println("soup price is " + price);
		System.out.println("ingredients used ");
		for(int index = 0 ; index<this.ingredients.length; index++){
			System.out.print(ingredients[index] + " , ");
		}
		System.out.println();
	}
}