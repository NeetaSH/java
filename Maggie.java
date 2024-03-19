class Maggie{

    String[] ingredients = new String[19];
	String brandName;
	String volume;  
	int price ;
	boolean isMadeInIndia ;
	
	
	public Maggie(){
	}
	
	public Maggie(String[] ingredients ,String brandName,String volume,int price,boolean isMadeInIndia ){
	System.out.println("Maggie constructor is invoked");
	               this.ingredients = ingredients;
				   this.brandName = brandName;
				   this.volume = volume;
				   this.price = price;
				   this.isMadeInIndia = isMadeInIndia;
	
	}
	
	public void taste(){
	System.out.println("to eat");
	}
	
	public void displayInfo(){
	System.out.println("maggie before init");
	System.out.println("Maggie brandName is " + brandName);
	System.out.println("Maggie volume is " + volume);
	System.out.println("Maggie price is " + price);
	System.out.println("is Maggie MadeInIndia " + isMadeInIndia);
	System.out.println("ingredients Used ");
	for(int index = 0; index < this.ingredients.length ; index++){
	System.out.print(this.ingredients[index] + " , ");
	}
	System.out.println();
	
	}
	
	



}