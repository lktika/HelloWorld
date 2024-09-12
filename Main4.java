class Noodle3 {
  protected double lengthInCentimeters;
  protected double widthInCentimeters;
  protected String shape;
  protected String ingredients;
  protected String texture = "brittle";
  
  Noodle3(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    
  }
  
  public void cook() {
    System.out.println("Boiling.");
    this.texture = "cooked";
  }
}

class Spaetzle extends Noodle3 {
  Spaetzle() {
    super(3.0, 1.5, "irregular", "eggs, flour, salt");
    this.texture = "lumpy and liquid";     
  }
  @Override
  public void cook() {
    System.out.println("Grinding or scraping the dough into the pot of boiling water.");
    this.texture = "cooked";
    System.out.println("Boiling");
  }
}

public class Main4{
  public static void main(String[] args) {
    Spaetzle kaesespaetzle = new Spaetzle();
    kaesespaetzle.cook();
  }
}
