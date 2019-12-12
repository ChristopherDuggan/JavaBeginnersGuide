class Average {
  public static void main(String args[]) {
    double[] arr = {12, 43, 2, 38, 129, 30, 84, 3, 8, 567};
    int sum = 0;

    for(double d : arr)
      sum += d;

    double avg = sum/arr.length;
    System.out.println("the average of the numbers is: " + avg);
  }
}
