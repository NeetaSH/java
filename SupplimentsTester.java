class SupplimentsTester{
    public static void main(String items3[]){
	
	Suppliments.addItems("vitamin b12");	
	Suppliments.addItems("monohydreate");	
	Suppliments.addItems("healthy u");	
	Suppliments.addItems("cabmide forte");	
	Suppliments.addItems("groviva");	
	Suppliments.addItems("bcaa powder");	
	Suppliments.addItems("aur nutrition");	
	Suppliments.addItems("360 gut");	
	Suppliments.addItems("probotics gut");	
	Suppliments.addItems("well being");	
	
	
	
	
	Suppliments.getItems();
	
	Suppliments.updateItem("protien bar" , "360 gut");
		Suppliments.getItems();
      Suppliments.deleteItem("360 gut");
		Suppliments.getItems();
	  
	}


}