import java.util.Arrays;
class HealthAndGlow{
       static String name = "plam";
		static String cosmetics[]= {null,null,null,null,null,null,null,null,null,null};
		static String ownerName = "sneha";
		static String location = "ramamurthy nagar";
		static int index;
			 


// method
 public static boolean addCosmetics(String cosmetic){
 System.out.println("inside addCosmetics():");
 boolean isAdded = false;
 if(cosmetic != null){
 cosmetics[index++] = cosmetic;
 isAdded = true ;
 System.out.println("added cosmetics successfully");
 }
 else{
 System.out.println("cosmetic can't be null");
 }
 System.out.println("end of addCosmetics");
 return isAdded;
 }
 public static void getCosmetics(){
 for(int index = 0 ; index< cosmetics.length; index++){
 System.out.println(cosmetics[index]);
 }
 }
 
 public static boolean updateCosmetic(String newCosmetic , String oldCosmetic){
	// System.out.println("updateCosmetics");
	 boolean isUpdated = false;
	 for(int index=0 ; index< cosmetics.length; index++){
		 if(cosmetics[index]==oldCosmetic){
			 cosmetics[index] = newCosmetic;
			 isUpdated = true;
	// System.out.println("updated successfully");
			 
		 }
	 }
	 //System.out.println("end of updateCosmetics");	 
	 return isUpdated;
 }
 public static void deleteCosmetic(String cosmetic){
	 System.out.println("deleteCosmetics");
	 int newIndex , oldIndex ;
	 for(newIndex =0 , oldIndex = 0 ; oldIndex < cosmetics.length ; oldIndex++){
		 if(cosmetics[oldIndex] != cosmetic){
			 cosmetics[newIndex++] = cosmetics[oldIndex];
		 }
	 }
	 cosmetics = Arrays.copyOf(cosmetics , newIndex);
	 	 System.out.println("end of deleteCosmetics");

	 return;
 }
}