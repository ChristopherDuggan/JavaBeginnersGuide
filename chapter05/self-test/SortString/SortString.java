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
