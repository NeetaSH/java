class Laptop{
   String name;
   String hardDiskSize;
   String color;
   String ram;
   
  /* public Laptop(){
   System.out.println("object is created");
   }*/
   /*public Laptop(String nam,String hDS,String clr,String rm){
   System.out.println("Laptop constructor is invoked");
       name = nam ;
	   hardDiskSize = hDS;
	   color = clr;
	   ram = rm;
   }*/
   
    public Laptop(String name,String hardDiskSize,String color,String ram){
   System.out.println("Laptop constructor is invoked");
       this.name = name ;
	   this.hardDiskSize = hardDiskSize;
	   this.color = color;
	   this.ram = ram;
   }
     
	 public void lap(){
	 System.out.println("create a 3d modeling");
	 }
	 
	 public void displayInfo(){
		 System.out.println("Laptop before init");
		 System.out.println("laptop name is " + name);
		 System.out.println("laptop hardDiskSize is " + hardDiskSize);
		 System.out.println("laptop color is " + color);
		 System.out.println("laptop ram is " + ram);
	 }

}