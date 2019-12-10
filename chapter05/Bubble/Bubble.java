class Bubble {
  public static void main(String args[]) {
    int[] nums = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
    int a, b, temp;

    System.out.print("Original array is: ");
    for(int i = 0; i < nums.length; i++)
      System.out.print(" " + nums[i]);
    System.out.println();

    for(a = 1; a < nums.length; a++)
      for(b = nums.length-1; b >= a; b--) {
        if(nums[b-1] > nums[b]) {
          temp = nums[b-1];
          nums[b-1] = nums[b];
          nums[b] = temp;
        }
      }
    System.out.print("Sorted array is: ");
    for(int i = 0; i < nums.length; i++) {
      System.out.print(" " + nums[i]);
    }
      System.out.println();
  }
}
