class GuessTheLetter {
  public static void main(String args[])
    throws java.io.IOException {
    char ch, ignore, answer = 'k';

    System.out.println("I'm thinking of a letter between a and z.");
    System.out.println("Can you guess it in 5 tries?: ");

    for (int i = 0; i < 5; i++) {
      ch = (char) System.in.read();
      do {
        ignore = (char) System.in.read();
      } while (ignore != '\n');

      if (ch == answer){
        System.out.println("Right!");
        break;
      }
      else { System.out.print("Sorry, your answer was too ");
        if (ch < answer) {
          System.out.println("low");
        }
        else {
          System.out.println("high");
        }
      }
      System.out.println("That was guess number " + (i+1));
    }
        System.out.println("The letter was " + answer);
  }
}

/* todo
 * pick the letter at random
 * ask if they'd like to play again (y or n)
 * if y, start over
 * if n, exit
 */
