class Noodle4 {

  protected double lengthInCentimeters;
  protected double widthInCentimeters;
  protected String shape;
  protected String ingredients;
  protected String texture = "brittle";
	  
  Noodle4(double lenInCent, double wthInCent, String shp, String ingr) {
	    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
	    
  }
	  
  public void cook() {
    this.texture = "cooked";
  }
}

class BiangBiang extends Noodle4 {
    BiangBiang() { 
      super(50.0, 5.0, "flat", "high-gluten flour, salt, water"); 
    }
}

class Dinner {
  public void makeNoodles(Noodle4 noodle, String sauce) {
    noodle.cook();
    System.out.println("Mixing " + noodle.texture + " noodles made from " + noodle.ingredients + " with " + sauce + ".");
    System.out.println("Dinner is served!");
  }  
}


public class Main5{
  public static void main(String[] args) {
    Dinner noodlesDinner = new Dinner();
    // Add your code here: 
    Noodle4 biangBiang = new BiangBiang();
    noodlesDinner.makeNoodles(biangBiang,"soy sauce and chili oil");
  }
}