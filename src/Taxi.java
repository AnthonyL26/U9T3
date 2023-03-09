public class Taxi extends Car {
  private double fareCollected;

  public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
    super(licensePlate, tollFee, passengers, isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
  }

  public double getFareCollected() {
    return fareCollected;
  }
  public void printInfo() {
    super.printInfo();
    System.out.println("Total Fare Collected: " + fareCollected);
  }
  public void status() {
    super.status();
    System.out.println("going out style.");
  }
  public boolean chargeAndDropOffRiders (double farePerRider) {
    fareCollected += farePerRider * (getPassengers()-1);
    return dropOffPassengers(getPassengers()-1);
  }
}