class LaptopTester{
    public static void main(String lap[]){
	/*Laptop laptop =new Laptop();
	laptop.displayInfo();
	laptop.name= "Lenovo";
	laptop.hardDiskSize = "512 Gb";
	laptop.color = "Iron Grey";
	laptop.ram = "8GB";
	laptop.displayInfo();
	System.out.println(laptop.name + " " + laptop.hardDiskSize + " " + laptop.color + " " + laptop.ram);
	
	Laptop laptop1 =new Laptop();
	laptop1.displayInfo();
	laptop1.name= "Asus";
	laptop1.hardDiskSize = "512 Gb";
	laptop1.color = "Transparent Silver";
	laptop1.ram = "4Gb";
	laptop1.displayInfo();
	System.out.println(laptop1.name + " " + laptop1.hardDiskSize + " " + laptop1.color + " " + laptop1.ram);
	
	Laptop laptop2 =new Laptop();
	laptop2.displayInfo();
	laptop2.name= "Dell";
	laptop2.hardDiskSize = "512 GB";
	laptop2.color = "Dark Shadow Grey";
	laptop2.ram = "16Gb";
	laptop2.displayInfo();
	System.out.println(laptop2.name + " " + laptop2.hardDiskSize + " " + laptop2.color + " " + laptop2.ram);
	
	Laptop laptop3 =new Laptop();
	laptop3.displayInfo();
	laptop3.name= "HP";
	laptop3.hardDiskSize = "512 GB";
	laptop3.color = "natural silver";
	laptop3.ram = "8Gb";
	laptop3.displayInfo();
	System.out.println(laptop3.name + " " + laptop3.hardDiskSize + " " + laptop3.color + " " + laptop3.ram);
	
	Laptop laptop4 =new Laptop();
	laptop4.displayInfo();
	laptop4.name= "Apple";
	laptop4.hardDiskSize = "1Tb";
	laptop4.color = "Space Black";
	laptop4.ram = "48GB";
	laptop4.displayInfo();
	System.out.println(laptop4.name + " " + laptop4.hardDiskSize + " " + laptop4.color + " " + laptop4.ram);*/
	
	Laptop laptop =new Laptop("Lenovo","512 Gb","Iron Grey","8GB");
	laptop.displayInfo();
	
	
	Laptop laptop1 =new Laptop("Asus","512 Gb", "Transparent Silver","4Gb");
	laptop1.displayInfo();
	
	
	Laptop laptop2 =new Laptop("Dell","512 GB","Dark Shadow Grey","16Gb");
	laptop2.displayInfo();
	
	
	Laptop laptop3 =new Laptop("HP","512 GB","natural silver","8Gb");
	laptop3.displayInfo();
	
	
	Laptop laptop4 =new Laptop("Apple","1Tb","Space Black","48GB");
	laptop4.displayInfo();
	}



}