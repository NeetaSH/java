class PerfumesTester{
     public static void main(String per[]){
	      /*Perfumes perfumes = new Perfumes();
		  perfumes.displayInfo();
		  perfumes.brandName= "Wild Stone";
		  perfumes.size = "100 ml";
		  perfumes.price= 585.00;
		  perfumes.displayInfo();
		  System.out.println(perfumes.brandName + " " + perfumes.size + " " + perfumes.price);
		  
		  Perfumes perfumes1 = new Perfumes();
		  perfumes.displayInfo();
		  perfumes1.brandName= "ARRAS";
		  perfumes1.size = "200 ml";
		  perfumes1.price= 574.00;
		  perfumes.displayInfo();
		  System.out.println(perfumes1.brandName + " " + perfumes1.size + " " + perfumes1.price);
		  
		  Perfumes perfumes2 = new Perfumes();
		  perfumes.displayInfo();
		  perfumes2.brandName= "Bella Vita Luxury";
		  perfumes2.size = "500ml";
		  perfumes2.price= 600.00;
		  perfumes.displayInfo();
		  System.out.println(perfumes2.brandName + " " + perfumes2.size + " " + perfumes2.price);
		  
		  Perfumes perfumes3 = new Perfumes();
		  perfumes.displayInfo();
		  perfumes3.brandName= "RENEE";
		  perfumes3.size = "200ml";
		  perfumes3.price= 1000.00;
		  perfumes.displayInfo();
		  System.out.println(perfumes3.brandName + " " + perfumes3.size + " " + perfumes3.price);
		  
		  Perfumes perfumes4 = new Perfumes();
		  perfumes.displayInfo();
		  perfumes4.brandName= "Park Avenue";
		  perfumes4.size = "121 ml";
		  perfumes4.price= 199.00;
		  perfumes.displayInfo();
		  System.out.println(perfumes4.brandName + " " + perfumes4.size + " " + perfumes4.price);*/
	 
	      Perfumes perfumes = new Perfumes("Wild Stone", "100 ml",585.00);
		  perfumes.displayInfo();
		  
		  Perfumes perfumes1 = new Perfumes("ARRAS","200 ml",574.00);
		  perfumes1.displayInfo();
		  
	      Perfumes perfumes2 = new Perfumes("Bella Vita Luxury","500ml",600.00);
		  perfumes2.displayInfo();
		  
		  Perfumes perfumes3 = new Perfumes("RENEE","200ml",1000.00);
		  perfumes3.displayInfo();
		  
		  Perfumes perfumes4 = new Perfumes("Park Avenue","121 ml",199.00);
		  perfumes4.displayInfo();
	 
	 }
}