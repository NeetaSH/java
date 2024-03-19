import java.util.Arrays;
class AutoMobileShop{
     static String name = "sangeeta" ;
	 static String partItems[] = {null,null,null,null,null,null,null,null,null,null};
		static String ownerName = "kolya";
	 static String  location = "ramamurthy nagar";
	 static int index; 
			   
    public static boolean addPartItems(String partItem){
	System.out.println("add partItems() :");
	boolean isAdded = false;
	if(partItem != null){
	partItems[index++]= partItem;
	
	isAdded = true;
	System.out.println("part items added successfully");
	
	}
	else{
	System.out.println("part item can't be null");
	}
	System.out.println("end of addPartItems");
	return isAdded;
	}
	public static void getPartItems(){
	for(int index = 0 ; index < partItems.length; index++){
	System.out.println(partItems[index]);
	}
  }
  
  public static boolean updatePartItem(String newPartitem, String oldPartItem){
	  
	  boolean isUpdated = false;
	  for(int index = 0 ; index<partItems.length ; index++){
		  if(partItems[index] == oldPartItem){
			  partItems[index] = newPartitem ;
			  isUpdated = true;
		  }
	  }
	  
	  return isUpdated;
  }
  public static void deletePartItem(String partItem){
	  System.out.println("deletepPartItem");
	  int newIndex, oldIndex;
	  for(newIndex = 0 , oldIndex = 0 ; oldIndex < partItems.length ; oldIndex++){
		  if(partItems[oldIndex] != partItem){
			  partItems[newIndex++] = partItems[oldIndex];
		  }
	  }
	  partItems = Arrays.copyOf(partItems , newIndex);
	  	  System.out.println("end of deletepPartItem");

	  return;
  }
}


