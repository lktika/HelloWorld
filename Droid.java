public class Droid {
  int batteryLevel;
  String name;


  public String toString() {
    return "Hello, I'm the droid: " + name;
  }

  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
  }

  public void energyReport(){
    System.out.println(batteryLevel);
   }

  public void energyTransfer(int newBatteryLevel) {
    this.batteryLevel = newBatteryLevel;
  }

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public static void main(String[] args) {
    Droid Codey = new Droid("Codey");
    Droid Margot = new Droid("Margot");
    System.out.println(Codey);
    Codey.performTask("dancing");
    Codey.energyReport();
    Margot.energyTransfer(Codey.batteryLevel);
    System.out.println(Margot);
    Margot.performTask("levitating");
    Margot.energyReport();
  }
}