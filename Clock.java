class Clock{
	  String brandName;
      String shape;
	  int price;
	  String color;
	  String material;
	  
	 // initialize the instance variables of clock class
	  /*public Clock(){
	  System.out.println("clock constructor is invoked");
	  }
	  
	  public Clock(String bName , String shp , int prc , String clr , String mtl ){
	  System.out.println("clock constructor is invoked");
	           brandName = bName;
			   shape = shp;
			   price = prc;
			   color = clr;
			   material= mtl;
	  
	  }*/
	  
	  public Clock(String brandName , String shape , int price , String color , String material ){
	  System.out.println("clock constructor is invoked");
	           this.brandName = brandName;
			   this.shape = shape;
			   this.price = price;
			   this.color = color;
			   this.material= material;
	  
	  }
	  
	  public void time(){
	  System.out.println("to know the time");
	  }
	  
	  
	  public void displayInfo(){
		  System.out.println("clock info before Init");
		  System.out.println("clock brandName is " + brandName);
		  System.out.println("clock material is " + shape);
		  System.out.println("clock price is " + price);
		  System.out.println("clock size is " + color);
		  System.out.println("clock color is " + material);
	  }



}