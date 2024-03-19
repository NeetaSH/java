class FaceWash{

     String  brandName;
	 String  volume;
	 int price;
	 boolean isMadeInIndia;
	 String[] ingredients = new String[7];

	public FaceWash(){
		
	}
	
	public FaceWash(String brandName,String volume ,int price,boolean isMadeInIndia , String[] ingredients){
		System.out.println("FaceWash constructor is invoked");
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
		System.out.println("FaceWash before init");
		System.out.println("FaceWash brandName is " + brandName);
		System.out.println("FaceWash volume is " + volume);
		System.out.println("FaceWash price is " + price);
		System.out.println("is FaceWash MadeInIndia " + isMadeInIndia);
		System.out.println("ingredients used ");
		for(int index = 0 ; index<this.ingredients.length; index++){
			System.out.print(ingredients[index] + " , ");
		}
		System.out.println();
	}
}