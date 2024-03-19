import java.util.Arrays;
class Decathlon{
     static String name = "decathlon";
static String products[] = {null , null, null , null , null, null,null,null,null,null};
	 static String ownerName = "vidya";
	 static String location = "ramamurthy nagar";
	 static int index ;
	 
	 
	 
	 // method 
	 public static boolean addProducts(String product){
	 System.out.println("inside addProducts():");
	 boolean isAdded = false ;
	 if(product != null){
	   products[index] = product;
	   index++;
	   
	   isAdded = true;
	 System.out.println(" products added successfully");
	 
	 
	 }
	 else{
	 System.out.println("products can't be null");
	 }
	 System.out.println("end of products():");
	 return isAdded;
	 
	 }
      public static void  getProducts(){
	  for(int index=0 ; index < products.length; index++){
	  System.out.println(products[index]);
	  }
	  }
	  public static boolean updateProduct(String newProduct , String oldProduct){
		  boolean isUpdated = false;
		  for(int index =0 ; index<products.length ; index++){
			  if(products[index] == oldProduct){
				  products[index] = newProduct;
				  isUpdated = true;
			  }
		  }
		  return isUpdated;
	  }
    public static void deleteProduct(String product){
		System.out.println("deleteProducts");
		int newIndex , oldIndex ; 
		for(newIndex = 0 , oldIndex =0 ; oldIndex < products.length ; oldIndex++){
			if(products[oldIndex] != product){
				products[newIndex++] = products[oldIndex];
			}
		}
		products = Arrays.copyOf(products , newIndex);
		System.out.println("end of deleteProducts");
		return;
	}


} 