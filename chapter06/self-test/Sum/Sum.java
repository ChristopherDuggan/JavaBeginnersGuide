class Sum {
  int sum(int ... nums) {
    int total = 0;

    for(int i = 0; i < nums.length; i++) total += nums[i];
    return total;
  }
}

class SumDemo {
  public static void main(String[] args) {
    Sum sumOb = new Sum();

    int total = sumOb.sum(1, 2, 3, 4);
    System.out.println("The sum of 1, 2, 3, and 4 is " + total);
  }
}
