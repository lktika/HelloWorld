public class Store8 {
  // instance fields
  String productType;
  
  // constructor method
  public Store8(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }
  
  // main method
  public static void main(String[] args) {
    String cookie = "Cookies";
    Store8 cookieShop = new Store8(cookie);
    
    cookieShop.advertise();
  }
}