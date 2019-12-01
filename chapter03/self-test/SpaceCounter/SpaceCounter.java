class SpaceCounter {
  public static void main(String args[])
      throws java.io.IOException {
      char input;
      int count = 0;

      System.out.println("Type anything and I'll count the spaces before you type '.'");
      do {
        input = (char) System.in.read();
        if (input == ' ') count++;
      } while (input != '.');
      System.out.println("The number of spaces before your first '.' is " + count);
  }
}
