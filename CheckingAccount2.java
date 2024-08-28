public class CheckingAccount2{
  public String name;
  private int balance;
  private String id;
  
  public CheckingAccount2(String inputName, int inputBalance, String inputId){
    name = inputName;
    balance = inputBalance;
    id = inputId;
  }

  public int getBalance() { 
  return balance; 
  }  

  public void setBalance(int newBalance) { 
  balance = newBalance; 
  }  

  public static void main(String[] args){
	CheckingAccount2 accountOne = new CheckingAccount2("Zeus", 100, "1");
	CheckingAccount2 accountTwo = new CheckingAccount2("Hades", 200, "2");
	  
	System.out.println(accountOne.getBalance());
	accountOne.setBalance(5000);
	System.out.println(accountOne.getBalance());
  }
}