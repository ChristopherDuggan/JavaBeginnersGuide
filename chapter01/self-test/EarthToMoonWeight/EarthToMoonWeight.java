/*
The moon's gravity is about 17 percent that of earth's. Write a program that
computes your effective weight on the moon.
*/

class EarthToMoonWeight {
  public static void main(String args[]) {
    double earthLbs = 210.0;
    double moonLbs = earthLbs * 0.17;

    System.out.print("If your weight on earth is " + earthLbs + ", your weight on the moon would be " + moonLbs + ".");
  }

}
