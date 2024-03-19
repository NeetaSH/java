class FaceSerumTester{
       public static void main(String wash[]){
	   System.out.println("main has started");
	   
	   String[] ingredients = {"Niacinamide", "Hyaluronic Acid", "Vitamin C", "Retinol" , "Green Tea", "Vitamin E", "Alpha Hydroxy Acids (AHAs)" , "Beta Hydroxy Acids (BHA’s)" };
	   
	   FaceSerum faceSerum = new FaceSerum("Dot & key" , "25ml" , 499 ,true , ingredients);
		  faceSerum.displayInfo();
		  
	      System.out.println("main has ended");	
	   }

}