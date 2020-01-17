#Chapter 8 **Self Test**

1. Using the code from *Try This 8-1*, put the *ICharQ* interface and its three
   implementations into a package called *qpack*. Keeping the queue
   demonstration class *IQDemo* in the default package, show how to import and use
   the classes in *qpack*.

   The implementation to this is located in the nested *ICharQ* directory.

2. What is a namespace? Why is it important that Java allows you to partition
   the namespace?

   The namespace is a scope. Partitioning the namespace prevents conflicting
   names.

3. Packages are stored in ___________.

   Directories

4. Explain the difference between *protected* and default access.

   Protected access means a thing can be used by code within its package and by
   any subclasses, regardless of their package. A thing with default access can
   only be used within its package.

5. Explain the two ways that the members of a package can be used by other
   packages.

   Either by importing member from the other package or by invoking its complete
   path name

6. "One interface, multiple methods" is a key tenet of Java. What feature best
   exemplifies it? 

   Interfaces

7. How many classes can implement an interface? How many interfaces can a class
   implement? 

   An interface can be implemented by any number of classes and a class can
   implement an unlimited number of interfaces.

8. Can interfaces be extended?

   Yes.

9. Create an interface for the *Vehicle* class from chapter 7. Call the
   interface *IVehicle*.

`interface IVehicle {
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
  int range();
  double fuelneeded(int miles);

  int getPassengers();
  void setPassengers(int p);
  int getFuelCap();
  void setFuelCap(int f);
  int getMpg();
  void setMpg(int m);
} `

10. Variables declared in an interface are implicitly *static* and *final.* Can
    they be shared with other parts of a program? 

    Yes. They can be used bi importing the interface.

11. A package is in essence, a container for classes. T or F?

True
