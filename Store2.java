public class Store2 {
  // declare instance fields here!
  String productType;
  
  // constructor method
  public Store2() {
    System.out.println("I am inside the constructor method.");
  }
  
  // main method
  public static void main(String[] args) {
    System.out.println("This code is inside the main method.");
    
    Store2 lemonadeStand = new Store2();
    
    System.out.println(lemonadeStand);
  }
}