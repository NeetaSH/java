import java.util.Arrays;
class MobileAccessories{
     static String name = "iphone";
     static String accessories[] = {null, null,null,null, null,null, null,null,null,null};
     static int index;


     //method 
     public static boolean addAccessories(String accessory){
	 System.out.println("inside addAccessory() :");
	 boolean isAdded= false;
	 if(accessory != null){
	    accessories[index] = accessory;
		index++;
		isAdded = true;
	 System.out.println("added successfully");
	 
	 }
	 else{
	 System.out.println("accessory can't be null");
	 }
	 	 System.out.println("end of accessory");
		 return isAdded;
		 
	 } 	 
     public static void getAccessories(){
	 for(int index = 0 ; index< accessories.length; index++){
	 	 System.out.println(accessories[index]);

	 }
	 }
      public static boolean updateAccessory(String newAccessory, String oldAccessory){
	  System.out.println("update accessory");
	  boolean isUpdated = false ;
	  
	  for(int index=0 ; index<accessories.length ; index++){
		  
		  if(accessories[index]==oldAccessory){
			  accessories[index] = newAccessory;
			  isUpdated = true;
		  }
	      }
		  System.out.println("accessory updates successfully");
		  return isUpdated;
	  }

	 public static void deleteAccessory(String accessory){
		 System.out.println("delete accessories");
		 int newIndex, oldIndex;
		 for(newIndex =0 , oldIndex =0 ; oldIndex < accessories.length ; oldIndex++){
			 if(accessories[oldIndex] != accessory){
				 accessories[newIndex++] = accessories[oldIndex] ;
				 //System.out.println("accessories deleted successfully");
			 }
		 }
		 accessories = Arrays.copyOf(accessories , newIndex);
		 System.out.println("end of delete accessories");
		 return;
	 } 

}