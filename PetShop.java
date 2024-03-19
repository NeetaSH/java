import java.util.Arrays;
class PetShop{
     static String name = "jungle";
static String petAccessories[] = {null , null, null , null , null, null,null,null,null,null};
	 static String ownerName = "vidya";
	 static String location = "marathahalli";
	 static int index ;
	 
	 
	 
	 // method 
	 public static boolean addPetAccessories(String petAccessory){
	 System.out.println("inside addPetAccessories():");
	 boolean isAdded = false ;
	 if(petAccessory != null){
	   petAccessories[index] = petAccessory;
	   index++;
	   
	   isAdded = true;
	 System.out.println(" petAccessories added successfully");
	 
	 
	 }
	 else{
	 System.out.println("petAccessory can't be null");
	 }
	 System.out.println("end of addPetAccessories():");
	 return isAdded;
	 
	 }
      public static void  getPetAccessories(){
	  for(int index=0 ; index < petAccessories.length; index++){
	  System.out.println(petAccessories[index]);
	  }
	  }
  public static boolean updatePetAccessory(String newPetAccessory , String oldPetAccessory){
	  boolean isUpdated = false;
	  for(int index=0 ; index< petAccessories.length ; index++){
		  if(petAccessories[index] == oldPetAccessory){
			  petAccessories[index] = newPetAccessory;
			  isUpdated = true;
		  }
	  }
	  System.out.println("petAccessory is added sucessfully");
	  return isUpdated;
  }
  public static void deletePetAccessory(String petAccessory){
	  System.out.println("deletePetAccessories");
	  int newIndex , oldIndex ;
	  for(newIndex=0 , oldIndex =0 ; oldIndex< petAccessories.length ; oldIndex++){
		  if(petAccessories[oldIndex] != petAccessory){
			  petAccessories[newIndex++] = petAccessories[oldIndex];
		  }
	  }
	  petAccessories = Arrays.copyOf(petAccessories , newIndex);
	  	  System.out.println("end of deletePetAccessories");

	  return;
  }

} 