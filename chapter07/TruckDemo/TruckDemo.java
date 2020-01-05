class Vehicle {
  private int passengers, fuelCap, mpg;

  Vehicle(int p, int f, int m) {
    passengers = p;
    fuelCap = f;
    mpg = m;
  }

  int range() { return mpg* fuelCap; }

  double fuelNeeded(int miles) { return (double) miles / mpg; }

  int getPassengers() { return passengers; }
  void setPassengers(int p) { passengers = p; }
  int getFuelCap() { return fuelCap; }
  void setFuelCap(int f) { fuelCap = f; }
  int getMpg() { return mpg; }
  void setMpg(int m) { mpg = m; }
}

class Truck extends Vehicle {
  private int cargoCap;

  Truck(int p, int f, int m, int c) {
    super(p, f, m);

    cargoCap = c;
  }

  int getCargo() { return cargoCap; }
  void putCargo(int c) { cargoCap = c; }
}

class TruckDemo {
   public static void main(String[] args) {

     Truck semi = new Truck(2, 200, 7, 44000);
     Truck pickup = new Truck(3, 28, 15, 2000);
     double gallons;
     int dist = 252;

     gallons = semi.fuelNeeded(dist);

     System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
     System.out.println("To go " + dist + " miles, semi needs " + gallons + "gallons of fuel.\n");

     gallons = pickup.fuelNeeded(dist);

     System.out.println("Pickup can carry " + pickup.getCargo() + " pounds.");
     System.out.println("To go " + dist + " miles pickup needs " + gallons + " gallons of fuel.");
   }
}
