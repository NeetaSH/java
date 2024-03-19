class AutoMobileShopTester{

    public static void main(String shops[]){
	AutoMobileShop.addPartItems("air bag");
	AutoMobileShop.addPartItems("tyre");
	AutoMobileShop.addPartItems("rear camera");
	AutoMobileShop.addPartItems("mirrior");
	AutoMobileShop.addPartItems("seat");
	AutoMobileShop.addPartItems("seat cover");
	AutoMobileShop.addPartItems("bumper");
	AutoMobileShop.addPartItems("video devices");
	AutoMobileShop.addPartItems("wiper");
	AutoMobileShop.addPartItems("engine");
	
		AutoMobileShop.getPartItems();
		
		AutoMobileShop.updatePartItem("window cover" , "seat");
		AutoMobileShop.getPartItems();
   AutoMobileShop.deletePartItem("bumper");
 		AutoMobileShop.getPartItems();
  
	}


}