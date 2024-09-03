public class CheckingAccount3{
  private String name;
  private int balance;
  private String id;
  private double interestRate;
  
  public CheckingAccount3(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
  }
  
  public void getAccountInformation(){
    System.out.println("Money in account: " + this.getBalance());
    System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest());
  }
  
  private int getBalance(){
    return this.balance;
  }
  
  private double calculateNextMonthInterest() {
    return this.balance * this.interestRate;
  }

  public static void main(String[] args){
    CheckingAccount3 accountOne = new CheckingAccount3("Zeus", 100, "1");
    accountOne.getAccountInformation();
  }
}