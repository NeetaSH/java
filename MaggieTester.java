class MaggieTester{
      public static void main(String eat[]){
		  
	  System.out.println("main has started");
	  
	  String[] ingredients = {"salt" , "peanut protein" , "palm oil" , "wheat flour", "palm oil" , "salt" , "wheat gluten", "calcium carbonate", "potassium chloride" , "sodium phosphate" , "potassium carbonate", "sodium carbonate" , "guar gum", "sugar" , "spices" , "onion powder" , "corn starch" , "red chili powder" , "garlic powder"};
	  
	      Maggie maggie = new Maggie(ingredients, "Nestle" , "420 grams" , 72, true);
		  
		  maggie.displayInfo();
		  
		System.out.println("main has ended");  
		  
		  
	  
	  }



}