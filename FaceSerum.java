class FaceSerum{

     String  brandName;
	 String  volume;
	 int price;
	 boolean isMadeInIndia;
	 String[] ingredients = new String[8];

	public FaceSerum(){
		
	}
	
	public FaceSerum(String brandName,String volume ,int price,boolean isMadeInIndia , String[] ingredients){
		System.out.println("FaceSerum constructor is invoked");
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
		System.out.println("FaceSerum before init");
		System.out.println("FaceSerum brandName is " + brandName);
		System.out.println("FaceSerum volume is " + volume);
		System.out.println("FaceSerum price is " + price);
		System.out.println("is FaceSerum MadeInIndia " + isMadeInIndia);
		System.out.println("ingredients used ");
		for(int index = 0 ; index<this.ingredients.length; index++){
			System.out.print(ingredients[index] + " , ");
		}
		System.out.println();
	}
}