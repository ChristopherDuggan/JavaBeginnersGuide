/* Start Building a Java Help System
 * This project builds a simple help system that displays the syntax for the
 * Java control statements. The program displays a menu containing the control
 * statements and then waits for you to choose one. After one is chosen, the
 * syntax of the statement is displayed. In this ifrst version of the program,
 * help is available for only the if and switch statements. The other control
 * statements are added in subsequent projects.
 */

class Help {
  public static void main(String args[])
    throws java.io.IOException {
    System.out.println("Get help with:");
    System.out.println("1. if");
    System.out.println("2. switch");
    System.out.print("Choose one: ");

    char choice = (char) System.in.read();

    System.out.println("You chose " + choice);
    switch (choice) {
      case '1':
        System.out.println("The if:\n");
        System.out.println("if (condition) satement;");
        System.out.println("else statement;");
        break;
      case '2':
        System.out.println("The switch:\n");
        System.out.println("switch (expression) {");
        System.out.println("  case constant:");
        System.out.println("    statement sequence");
        System.out.println("    break;");
        System.out.println("  case constant:");
        System.out.println("    statement sequence");
        System.out.println("    break;");
        System.out.println("  // ...");
        System.out.println(" default:");
        System.out.println("    statement sequence;");
        break;
      default:
        System.out.println(choice + " is not a recognized option.");
    }
  }
}
