class PetShopTester{
   public static void main(String shop[]){
   
   PetShop.addPetAccessories("chew chicken");
   PetShop.addPetAccessories("pet lint roller");
   PetShop.addPetAccessories("toys bone");
   PetShop.addPetAccessories("adjustable muzzle");
   PetShop.addPetAccessories("leather pet products");
   PetShop.addPetAccessories("pet bottle");
   PetShop.addPetAccessories("lilio shit ");
   PetShop.addPetAccessories("leash set");
   PetShop.addPetAccessories("notix shmpoo");
   PetShop.addPetAccessories("pet dog medicine");

   PetShop.getPetAccessories();
   PetShop.updatePetAccessory("ear wipes" , "leash set");
   PetShop.getPetAccessories();
   PetShop.deletePetAccessory("toys bone");
   PetShop.getPetAccessories();

   }



}