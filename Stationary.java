import java.util.Arrays;
class Stationary{
     static String name = "gurudev";
     static String items[] = {null , null, null , null , null, null,null,null,null,null};
	 
	 static String location = "marathahalli";
	 static int index ;
	 
  //method 
  public static boolean addItems(String item){
  
  System.out.println("inside addItems() :");
  boolean isAdded = false ;
  if(item != null){
  items[index++] = item ;
  
  isAdded = true;
  System.out.println("items added successfully");
  
  }
  else{
  System.out.println("item can't be null");
  }
  System.out.println("end of add items");
  return isAdded;
  
  }
  public static void getItems(){
  for(int index=0; index<items.length ; index++){
  System.out.println(items[index]);
  }
  }
public static boolean updateItem(String newItem , String oldItem){
	System.out.println("update item");
	
	boolean isUpdated = false;
	for(int index = 0; index< items.length ; index++){
		if(items[index] == oldItem){
			items[index] = newItem;
			isUpdated = true;
			System.out.println("item updated successfully");
		}
		
	}
	System.out.println("end of update item");
		return isUpdated;
	
}
  public static void deleteItem(String item){
	  System.out.println("deleteItem");
	  int newIndex , oldIndex;
	  for(newIndex =0 , oldIndex = 0 ; oldIndex < items.length ; oldIndex++){
		  	  //System.out.println("item deleted successfully");

		  if(items[oldIndex] != item){
			  items[newIndex++] = items[oldIndex] ;
		  }
	  }
	  items = Arrays.copyOf(items , newIndex);
	  	  System.out.println("end of deleteItem");

	  return;
  }
}