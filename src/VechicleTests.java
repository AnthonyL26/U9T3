public class VechicleTests
{
  public static void main(String[] args)
  {
    Vehicle vehicle = new Vehicle("123", 5.5, 4);
    Car car = new Car("ABC", 5.5, 5, true);
    Truck truck = new Truck("abc", 5.5, 5, 6, false);
    Taxi taxi = new Taxi("TX1412", 13.75, 4, true, 2.0);

    System.out.println("Vehicle: ");
    vehicle.status();
    System.out.println("Car: ");
    car.status();
    System.out.println("Truck: ");
    truck.status();
    System.out.println("Taxi: ");
    taxi.status();

  }
}
