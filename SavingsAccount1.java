public class SavingsAccount1{

  public String owner;
  public double balanceDollar;
  public double balanceEuro;

  public SavingsAccount1(String owner, double balanceDollar){
    // Complete the constructor
    this.owner = owner;
    this.balanceDollar = balanceDollar;
    this.balanceEuro = balanceDollar * 0.85;
  }

  public void addMoney(int balanceDollar){
    // Complete this method
    System.out.println("Adding " + balanceDollar + " dollars to the account.");
    this.balanceDollar += balanceDollar;
    System.out.println("The new balance is " + this.balanceDollar + " dollars.");
  }

  public static void main(String[] args){
	SavingsAccount1 zeusSavingsAccount = new SavingsAccount1("Zeus", 1000);

	// Make a call to addMoney() to test your method
	zeusSavingsAccount.addMoney(2000);
  }
}