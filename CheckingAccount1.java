public class CheckingAccount1{
  private String name;
  private int balance;
  
  public CheckingAccount1(String inputName, int inputBalance){
    name = inputName;
    balance = inputBalance;
  }
  
  private void addFunds(int fundsToAdd){
    balance += fundsToAdd;
  }
  
  public void printBalance() {
    System.out.println("Account balance is " + balance);
  }

  private void getInfo(){
    System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
  }

  public static void main(String[] args){
	 CheckingAccount1 accountOne = new CheckingAccount1("Zeus", 100);
	 CheckingAccount1 accountTwo = new CheckingAccount1("Hades", 200);
	 CheckingAccount1 myAccount = new CheckingAccount1("Mike", 300);
	 myAccount.printBalance(); 
  }
}