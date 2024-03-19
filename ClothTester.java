class ClothTester{
     public static void main(String wear[]){
	   
	  /* Cloth cloth  = new Cloth();
	   cloth.displayInfo();
	   cloth.brandName = "Levis";
	   cloth.material = "cotton";
	   cloth.price = 2500.00;
	   cloth.size = "s";
	   cloth.color = "white";
	   cloth.type = "Tshirt";
	   cloth.displayInfo();
	   
	     Cloth cloth1  = new Cloth();
	   cloth1.displayInfo();
	   cloth1.brandName = "Zara";
	   cloth1.material = "Polyster";
	   cloth1.price = 5000.00;
	   cloth1.size = "xs";
	   cloth1.color = "black";
	   cloth1.type = "Party wear";
	   cloth1.displayInfo();
	   
	     Cloth cloth2  = new Cloth();
	   cloth2.displayInfo();
	   cloth2.brandName = "Zudio";
	   cloth2.material = "Nylon";
	   cloth2.price = 800.00;
	   cloth2.size = "xs";
	   cloth2.color = "pink";
	   cloth2.type = "casual";
	   cloth2.displayInfo();*/
	   
	   Cloth cloth3  = new Cloth();
	   cloth3.displayInfo();
	   cloth3.brandName = "Levis";
	   cloth3.material = "cotton";
	   cloth3.price = 2500.00;
	   cloth3.size = "s";
	   cloth3.color = "white";
	   cloth3.type = "Tshirt";
	   cloth3.displayInfo();
	   
	   Cloth cloth  = new Cloth("Levis","cotton", 2500.00,"s","white","Tshirt");
	   cloth.displayInfo();
	   
	  

       Cloth cloth1  = new Cloth("Zara" ,"Polyster",5000.00,"xs" ,"black","Party wear");
	   cloth1.displayInfo();
	   
	   
	    Cloth cloth2  = new Cloth("Zudio" ,"Nylon",800.00,"xs","pink" ,"casual");
	   cloth2.displayInfo();
	  
	 }



}