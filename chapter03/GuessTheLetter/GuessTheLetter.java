class GuessTheLetter {
  public static void main(String args[])
    throws java.io.IOException {
    char ch, answer = 'k';

    System.out.println("I'm thinking of a letter between a and z.");
    System.out.print("Can you guess it?: ");

    ch = (char) System.in.read();
    if (ch == answer) System.out.println("Right!");
    else System.out.println("Sorry, that was wrong. The letter was " + answer);
  }
}

/* todo
 * pick the letter at random
 * limit them to 5 tries
 * after 5 wrong answers, reveal the correct answer
 * ask if they'd like to play again (y or n)
 * if y, start over
 * if n, exit
 */
