class EcommerceTester{
  public static void main(String products3[]){
  
  Ecommerce.addProducts("shoes");
  Ecommerce.addProducts("tshirt");
  Ecommerce.addProducts("shirt");
  Ecommerce.addProducts("sandals");
  Ecommerce.addProducts("cap");
  Ecommerce.addProducts("jeans");
  Ecommerce.addProducts("skirt");
  Ecommerce.addProducts("charger");
  Ecommerce.addProducts("phone");
  Ecommerce.addProducts("power bank");
  
    Ecommerce.getProducts();
    Ecommerce.updateProduct("tv" , "charger");
     Ecommerce.getProducts();
   Ecommerce.deleteProduct("cap");
     Ecommerce.getProducts();
   
  }



}