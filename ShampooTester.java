class ShampooTester{
     public static void main(String hair[]){
	 System.out.println("main has started");
	 
	 String[] ingredients = {"Water (Aqua)", "Sodium Laureth Sulfate", "Glycol Distearate", "Cocamidopropyl Betaine" , "Sodium Chloride" , "Fragrance (Parfum)", "Glycerin" , "Dimethicone" , "Dimethiconol" , "Acrylates/Beheneth-25 Methacrylate Copolymer" , "Styrene/Acrylates Copolymer" , "Guar Hydroxypropyltrimonium Chloride" , "Citric Acid, Tetrasodium Edta" , "Amodimethicone", "Dmdm"};
	 
	      Shampoo shampoo = new Shampoo("Dove" , "1L" , 498,true , ingredients);
		  shampoo.displayInfo();
		  
	      System.out.println("main has ended");	 
	 
	 
	 }
	 
}