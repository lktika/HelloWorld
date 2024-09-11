class Noodle {
  double lengthInCentimeters;
  String shape;
  String texture = "brittle";
  
  public void cook() {
    
    this.texture = "cooked";
    
  }
}

class Spaghetti extends Noodle {

}

public class Main1{
  public static void main(String[] args) {
    Spaghetti spaghettiPomodoro = new Spaghetti();
    System.out.println(spaghettiPomodoro.texture); 
    }
}