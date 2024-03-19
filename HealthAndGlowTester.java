class HealthAndGlowTester{

public static void main(String cosmetic2[]){

HealthAndGlow.addCosmetics("face wash");
HealthAndGlow.addCosmetics("sunscreen");
HealthAndGlow.addCosmetics("moisturizer");
HealthAndGlow.addCosmetics("toner");
HealthAndGlow.addCosmetics("foundation");
HealthAndGlow.addCosmetics("kajal");
HealthAndGlow.addCosmetics("lipstic");
HealthAndGlow.addCosmetics("face mask");
HealthAndGlow.addCosmetics("shower gel");
HealthAndGlow.addCosmetics("handwash");


HealthAndGlow.getCosmetics();

HealthAndGlow.updateCosmetic("lipliner" , "lipstic");
HealthAndGlow.getCosmetics();
HealthAndGlow.deleteCosmetic("toner");
HealthAndGlow.getCosmetics();

}



}