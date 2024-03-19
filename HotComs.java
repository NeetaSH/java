import java.util.Arrays;
class HotComs{
     static String name = "more";
static String vegetables[] = {null , null, null , null , null, null,null,null,null,null};
	 static String ownerName = "neet";
	 static String location = "marathahalli";
	 static int index ;
	 
	 
	 
	 // method 
	 public static boolean addVegetables(String vegetable){
	 System.out.println("inside addVegetables():");
	 boolean isAdded = false ;
	 if(vegetable != null){
	   vegetables[index] = vegetable;
	   index++;
	   
	   isAdded = true;
	 System.out.println(" vegetables added successfully");
	 
	 
	 }
	 else{
	 System.out.println("vegetables can't be null");
	 }
	 System.out.println("end of addVegetables():");
	 return isAdded;
	 
	 }
      public static void  getVegetables(){
	  for(int index=0 ; index < vegetables.length; index++){
	  System.out.println(vegetables[index]);
	  }
	  }
	  public static boolean updateVegetable(String newVegetable , String oldVegetable){
		  boolean isUpdated=false;
		  for(int index=0; index<vegetables.length; index++){
			  if(vegetables[index] == oldVegetable){
				  vegetables[index] = newVegetable;
				  isUpdated = true;
			  }
		  }
		  
		  return isUpdated;
	  }
	  public static void deleteVegetable(String vegetable){
		  System.out.println("deleteVegetables");
		  int newIndex, oldIndex;
		  for(newIndex = 0 , oldIndex =0 ; oldIndex< vegetables.length ; oldIndex++){
			  if(vegetables[oldIndex] != vegetable){
				  vegetables[newIndex++] = vegetables[oldIndex];
			  }
		  }
		  vegetables = Arrays.copyOf(vegetables , newIndex);
		  System.out.println("end of deleteVegetables");
		  return;
	  }



} 