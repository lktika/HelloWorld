public class CheckingAccount{
  //private String name;
  public String name;
  private int balance;
  private String id;
  
  public CheckingAccount(String inputName, int inputBalance, String inputId){
    name = inputName;
    balance = inputBalance;
    id = inputId;
  }
  
  public void addFunds(int fundsToAdd){
    balance += fundsToAdd;
  }
  
  public void getInfo(){
    System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
  }
  
  public static void main(String[] args){
	CheckingAccount accountOne = new CheckingAccount("Zeus", 100, "1");
	CheckingAccount accountTwo = new CheckingAccount("Hades", 200, "2");
	System.out.println(accountOne.name);
	accountOne.addFunds(5);
	accountOne.getInfo();
	  }

  }