public class Store4 {
  // instance fields
  String productType;
  
  // constructor method
  public Store4(String product) {
    productType = product;
  }
  
  // main method
  public static void main(String[] args) {
    Store4 lemonadeStand = new Store4("lemonade");
    System.out.println(lemonadeStand.productType);
  }
}