// find all primes between 2 and 100
class FindAllPrimes {
  public static void main(String args[]) {
    System.out.println("An inclusive list of all prime numbers between 2 and 100!");
    for (int i = 2; i < 101; i++) {
      int count = 0;
      for (int num = i; num > 0; num--)  {
        if (i % num == 0) count++;
      }
      if (count == 2) System.out.print(i + ", ");
    }
    System.out.println();
  }
}
