class SoupTester{
    public static void main(String taste[]){
	System.out.println("main has started");
	
	String[] ingredients = {"Potato Starch" , "Dried Glucose Syrup" , "Salt" , "Sugar" , "Carrot", "Cabbage","Soybean", "Wheat", "Dehydrated Onion" , "Garlic", "Chilli Powder" , "Pepper Powder" , "Flavour Enhancer (E635)" , "Natural Colour (E150D)" , "Sunflower Oil", "Anticaking Agent (E551)", "Acidity Regulator (E296)"};
	
	
	      Soup soup = new Soup("chings" , "Manchow" , 60, ingredients);
		  soup.displayInfo();
		  
	System.out.println("main has ended");
		  
	
	
	}
}