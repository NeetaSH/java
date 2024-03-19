class PerfumeTester{
      public static void main(String per[]){
		  
		  System.out.println("main has started");
		  String ingredients[] = {"Rose water", "jasmine" , "floral nectar"};
		  
		  
	       Perfume perf  = new Perfume(ingredients , "Skinn" , "50 ml" , 1610.00 , true);
		   perf.displayInfo();
	  
	  
	     System.out.println("main has ended");
	  }


}