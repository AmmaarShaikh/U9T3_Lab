public class Taxi extends Car {
  private double fareCollected;

  public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
    super(licensePlate, tollFee, passengers, isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
  }

  public double getFareCollected() {
    return fareCollected;
  }


  public boolean chargeAndDropOffRiders(double farePerRider){
    fareCollected += (getPassengers() - 1)*farePerRider;
    return dropOffPassengers(getPassengers()-1);
  }

  @Override
  public void printInfo(){
    super.printInfo();
    System.out.println("Fare collected: " + fareCollected);
  }
}