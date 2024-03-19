class SumArray{
   public static void main(String number[]){
   
   sum();
   fact();
   }
   
   public static void sum(){
   int number[] = {30, 29, 76, 57};
    int sum=0;
   for(int index = 0 ; index < number.length ; index++){
	   
      sum = sum + number[index] ;
   }
         System.out.println("sum of array elements" + sum);

   
   }

     public static void factorial(){
		int fact[] = {4,8, 9, 6};
      	for(int f=1; f< fact.length ; f++){
			fact = fact * fact.length ;
			
			
			
			
		}	
		 
		 System.out.println(fact);
		 
		 
		 
		 
		 
		 
	 }












}