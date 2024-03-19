import java.util.Arrays;
class Suppliments{

   static String name= "ramdev";
   static String items[] = {null,null,null,null,null,null,null,null,null,null};
   static String owner= "vidya";
    static String  location = "ramamurthy nagar";
    static int index;	

    public static boolean addItems(String item){
	System.out.println("inside addItems(): ");
	boolean isAdded = false;
	if(item != null){
	items[index++]= item;
	isAdded = true;
	System.out.println("items added successfully ");
	}
	else{
	System.out.println("item can't be null");
	}
	System.out.println("end of addItems");
	return isAdded;
	}
	public static void getItems(){
	for(int index=0 ; index< items.length ; index++){
	System.out.println(items[index]);
	}
	
	}
	
	public static boolean updateItem(String newItem , String oldItem){
		boolean isUpdated = false;
		for(int index = 0 ; index<items.length ; index++){
			if(items[index] == oldItem){
				items[index] = newItem;
				isUpdated = true;
			}
		}
		return isUpdated;
	}
	public static void deleteItem(String item){
		System.out.println("deleteItem");
		int newIndex , oldIndex;
		for(newIndex =0 , oldIndex =0 ; oldIndex<items.length ; oldIndex++){
			if(items[oldIndex] != item){
				items[newIndex++] = items[oldIndex];
			}
		}
		items = Arrays.copyOf(items , newIndex);
		System.out.println("end of deleteItem");
		return;
	}
}
