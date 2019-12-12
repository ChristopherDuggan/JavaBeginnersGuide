#Chapter 5 **Self Test**

1. Show two ways to declare a one-dimensional array of 12 *doubles*.

  `
  double[] arr = new double[12];
  `
  or
  `
  double arr[] = new double[12];
  `
2. Show how to initialize a one-dimensional array of integers to the values
   1 through 5.

   `
   integer[] arr = {1, 2, 3, 4, 5};
   `
3. Write a program that uses an array to find the average of 10 *double*
    values. Use any 10 values you like.

`
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
`

4. Change the sort in *Try This 5-1* so that it sorts an array of strings.
   Demonstrate that it works.

`
class SortString {
  public static void main(String args[]) {
    String[] strings = {
      "This is the first string.",
      "This is the second.",
      "Here comes string number three, my dude.",
      "I bet you expected this fourth one, but maybe not here.",
      "But could you gave guessed there would be a fifth?",
      "The sixth string contains the twist! this is where you learn that the length is what they'll be sorted by!"
    };
    int a, b;
    String temp;

    System.out.print("Original array is: ");
    for(int i = 0; i < strings.length; i++)
      System.out.print(" " + strings[i]);
    System.out.println();
    System.out.println();
    System.out.println();

    for(a = 1; a < strings.length; a++)
      for(b = strings.length - 1; b >= a; b--) {
        if(strings[b-1].length() > strings[b].length()) {
          temp = strings[b - 1];
          strings[b - 1] = strings[b];
          strings[b] = temp;
        }
      }
    System.out.print("The sorted strings are: ");
    for(int i = 0; i < strings.length; i++) {
      System.out.print(" " + strings[i]);
    }
    System.out.println();
  }
}
`
