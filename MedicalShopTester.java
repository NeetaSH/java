class MedicalShopTester{

  public static void main(String shop[]){
  
  MedicalShop.addItems("tbalets");
  MedicalShop.addItems("syrup");
  MedicalShop.addItems("shampoo");
  MedicalShop.addItems("lotations");
  MedicalShop.addItems("staples");
  MedicalShop.addItems("surgical blade");
  MedicalShop.addItems("syringes");
  MedicalShop.addItems("bandages");
  MedicalShop.addItems("oral solutions");
  MedicalShop.addItems("tape");
  
  
  MedicalShop.getItems();
  MedicalShop.updateItem("face wash" , "staples");
    MedicalShop.getItems();
    MedicalShop.deleteItem("shampoo");
     MedicalShop.getItems();
 
  }
}