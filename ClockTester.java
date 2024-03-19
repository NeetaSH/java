class ClockTester{

     public static void main(String time[]){
	 
	        /*Clock clock = new Clock();
			clock.displayInfo();
	        clock.brandName = "Ajanta";
			clock.shape = "Round";
			clock.price = 900;
			clock.color = "White & Black";
			clock.material = "Plastic";
			clock.displayInfo();
			System.out.println(clock.brandName + " " + clock.shape + " " + clock.price + " " + clock.color + " " + clock.material);
			
			Clock clock1 = new Clock();
			clock1.displayInfo();
	        clock1.brandName = "Rylan";
			clock1.shape = "Square";
			clock1.price = 700;
			clock1.color = "Yellow";
			clock1.material = "Glass";
			clock1.displayInfo();
			System.out.println(clock1.brandName + " " + clock1.shape + " " + clock1.price + " " + clock1.color + " " + clock1.material);
			
			
			
			Clock clock2 = new Clock();
			clock2.displayInfo();
	        clock2.brandName = "Rizik";
			clock2.shape = "Rectangle";
			clock2.price = 1500;
			clock2.color = "Red";
			clock2.material = "Metal";
			clock2.displayInfo();
			System.out.println(clock2.brandName + " " + clock2.shape + " " + clock2.price + " " + clock2.color + " " + clock2.material);
			
			
			Clock clock3 = new Clock();
			clock3.displayInfo();
	        clock3.brandName = "Zintex";
			clock3.shape = "Round";
			clock3.price = 1900;
			clock3.color = "Silver";
			clock3.material = "glass";
			clock3.displayInfo();
			System.out.println(clock3.brandName + " " + clock3.shape + " " + clock3.price + " " + clock3.color + " " + clock3.material);
			
			
			Clock clock4 = new Clock();
			clock4.displayInfo();
	        clock4.brandName = "Craftel";
			clock4.shape = "Square";
			clock4.price = 500;
			clock4.color = "Gold";
			clock4.material = "Metal";
			clock4.displayInfo();
			System.out.println(clock4.brandName + " " + clock4.shape + " " + clock4.price + " " + clock4.color + " " + clock4.material);*/
			
	        Clock clock = new Clock("Ajanta","Round",900,"White & Black","Plastic" );
			clock.displayInfo();
			
			Clock clock1 = new Clock("Rylan" , "Square",700,"Yellow","Glass" );
			clock1.displayInfo();
			
			Clock clock2 = new Clock("Rizik","Rectangle",1500 ,"red","Metal");
			clock2.displayInfo();
			
			Clock clock3 = new Clock("Zintex","Round",1900,"Silver" ,"glass" );
			clock3.displayInfo();
			
			Clock clock4 = new Clock("Craftel","Square",500,"Gold","Metal");
			clock4.displayInfo();
	 }


}