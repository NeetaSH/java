class PrimerTester{
     public static void main(String clean[]){
	 System.out.println("main has started");
	 
	 String[] ingredients = {"Silica", "Water","Mica", "Talc" , "cyclomethicone" , "dimethicone" };
	 
	  Primer primer = new Primer("Insight" , "30ml", 261 , true , ingredients);
	  primer.displayInfo();
	 System.out.println("main has ended");
	 }


}