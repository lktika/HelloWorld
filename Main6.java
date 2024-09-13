class Noodle5 {

  protected double lengthInCentimeters;
  protected double widthInCentimeters;
  protected String shape;
  protected String ingredients;
  protected String texture = "brittle";
  
  Noodle5(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    
  }
  
  public String getCookPrep() {
    return "Boil noodle for 7 minutes and add sauce.";
  }
}

class Pho1 extends Noodle5 {

  Pho1() {
    super(30.0, 0.64, "flat", "rice flour");
  }
	  
  @Override
  public String getCookPrep() {
    return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";
  }
}

class Ramen1 extends Noodle5 {

  Ramen1() {
    super(30.0, 0.3, "flat", "wheat flour");
  }
	  
  @Override
  public String getCookPrep() {
    return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";
  }
}

class Spaghetti1 extends Noodle5 {

  Spaghetti1() {
      super(30.0, 0.2, "round", "semolina flour");
  }
	  
  @Override
  public String getCookPrep() {
    return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";
  }
}

public class Main6 {
  public static void main(String[] args) {
    Noodle5 spaghetti, ramen, pho;
	    
    spaghetti = new Spaghetti1();
    ramen = new Ramen1();
    pho = new Pho1();
	        
    // Add your code below:
       Noodle5[] allTheNoodles = {spaghetti, ramen, pho};
       for(Noodle5 noodle: allTheNoodles){
         System.out.println(noodle.getCookPrep());
    }   
  }
}