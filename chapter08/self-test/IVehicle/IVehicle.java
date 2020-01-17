interface IVehicle {
  int range();
  double fuelneeded(int miles);

  int getPassengers();
  void setPassengers(int p);
  int getFuelCap();
  void setFuelCap(int f);
  int getMpg();
  void setMpg(int m);
}
