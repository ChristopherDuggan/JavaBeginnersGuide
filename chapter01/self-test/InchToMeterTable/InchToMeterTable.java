class InchToMeterTable {
  public static void main(String args[]) {
    int count = 0;
    for (double i=10; i <= 144; i++) {
      System.out.println(i + " inches is equal to " + (i/39.37) + " meters.");
      count++;
      if (count == 12) {
        System.out.println();
        count = 0;
      }
    }
  }
}
