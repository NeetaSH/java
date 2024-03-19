class Detergents{

      String  name;
	  String itemForm;
	  String quantity;
	  
	  /*public Detergents(){
	  System.out.println("object is created");
	  }*/
	  
	  /*public Detergents(String nam, String itmFrm , String qut){
	  System.out.println("object is created");
	      name = nam;
		  itemForm = itmFrm;
		  quantity = qut;
	  }*/
	  
	  public Detergents(String name, String itemForm , String quantity){
	  System.out.println("object is created");
	      this.name = name;
		  this.itemForm = itemForm;
		  this.quantity = quantity;
	  }
	  
	  public void clean(){
	  System.out.println("to wash");
	  }
	  
	  public void displayInfo(){
		  System.out.println("Detergents info before init");
		  System.out.println("Detergents name is " + name);
		  System.out.println("Detergents itemForm is " + itemForm);
		  System.out.println("Detergents quantity is " + quantity);
		  
		  
	  }

}