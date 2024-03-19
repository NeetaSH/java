class TonerTester{
     public static void main(String clear[]){
	 System.out.println("main has started");
	 
	 String[] ingredients = {"salicylic acid", "witch hazel","alpha-hydroxy acids (AHAs)"};
	 
	  Toner toner = new Toner("plum" , "100ml", 213 , true , ingredients);
	  toner.displayInfo();
	 System.out.println("main has ended");
	 }


}