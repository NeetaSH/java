class FaceWashTester{
     public static void main(String wash[]){
	 System.out.println("main has started");

	 String[] ingredients =  {"retinol" , "salicylic acid" ,  "ceramides" , "vitamin C", "glycerin", "chemical" , "physical exfoliants"};

	 
	 FaceWash faceWash = new FaceWash("Dot & key" , "10ml" , 211 ,true , ingredients);
		  faceWash.displayInfo();
		  
	      System.out.println("main has ended");	
		  
	}
}	