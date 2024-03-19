class MobileAccessoriesTester{
 public static void main(String access[]){
 
 MobileAccessories.addAccessories("holder");
 MobileAccessories.addAccessories("back case");
 MobileAccessories.addAccessories("screen guard");
 MobileAccessories.addAccessories("tempered glass");
 MobileAccessories.addAccessories("charger");
 MobileAccessories.addAccessories("power bank");
 MobileAccessories.addAccessories("selfie stick");
 MobileAccessories.addAccessories("data cable");
 MobileAccessories.addAccessories("bluetooth speaker");
 MobileAccessories.addAccessories("tripod stand");
 
 
 MobileAccessories.getAccessories();
 
 MobileAccessories.updateAccessory("charger cable" , "charger");
  MobileAccessories.getAccessories();
  MobileAccessories.deleteAccessory("selfie stick");
  MobileAccessories.getAccessories();

 }



}