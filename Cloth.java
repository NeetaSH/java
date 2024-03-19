class Cloth{
     
       String brandName;
	   String material;
	   double price;
	   String size;
	   String color;
	   String type;
	   
	   /*public Cloth(){
	   System.out.println("objected created");
	   }*/
	  //initialize the instance variables of cloth class 
	   /*public Cloth(String bName ,String mtl,double pce, String s,String clr,String typ){
	   System.out.println("cloth constructor is invoked.");
	 instance variable = parameter variable ;
	          brandName=bName ;
              material=mtl;
              price=pce;
              size = s;
              color=clr;
              type = typ;*/	
			  
		public Cloth(String brandName ,String material,double price, String size,String color,String type){
	   System.out.println("cloth constructor is invoked.");	  
           this.brandName = brandName;
           this.material = material;
           this.price = price;
            this.size = size;
           this.color = color;
            this.type = type;		   
	             
	   }
	   
	   public void designingCloth(){
	   System.out.println("designing cloth");
	   }
      
	  public void displayInfo(){
		  System.out.println("clothes info before Init");
		  System.out.println("Cloth brandName is " + brandName);
		  System.out.println("Cloth material is " + material);
		  System.out.println("Cloth price is " + price);
		  System.out.println("Cloth size is " + size);
		  System.out.println("Cloth color is " + color);
		  System.out.println("Cloth type is " + type);
		  
	  }



}