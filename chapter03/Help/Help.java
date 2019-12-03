class HelpMethods {

  void selectTopic(int topic) {
    switch (topic) {
      case '1':
        System.out.println("The if:\n");
        System.out.println("if (condition) satement;");
        System.out.println("else statement;\n");
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
        System.out.println("    statement sequence;\n");
        break;
      case '3':
        System.out.println("The for:\n");
        System.out.println("for(init; condition; iteration)");
        System.out.println(" statement\n");
        break;
      case '4':
        System.out.println("The while:\n");
        System.out.println("while (condition) statement;\n");
        break;
      case '5':
        System.out.println("The do-while:\n");
        System.out.println("do {");
        System.out.println("  statement;");
        System.out.println("} while (condition)\n");
        break;
      case '6':
        System.out.println("The break:\n");
        System.out.println("break; or break label;\n");
        break;
      case '7':
        System.out.println("The continue:\n");
        System.out.println("continue; or continue label;\n");
        break;
    }
  }

  void showMenu() {
    System.out.println("Get help with:");
    System.out.println(   "1. if");
    System.out.println(   "2. switch");
    System.out.println(   "3. for");
    System.out.println(   "4. while");
    System.out.println(   "5. do-while");
    System.out.println(   "6. break");
    System.out.println(   "7. continue\n");
    System.out.print("Choose one (or press 'q' to quit): ");
  }

  boolean isValid(int ch) {
    if (ch < '1' | ch > '7' & ch != 'q') return false;
    else return true;
  }

}

class Help {
  public static void main(String args[])
      throws java.io.IOException {
      char choice, ignore;
      HelpMethods methods = new HelpMethods();
      for (;;) {
        do {
          methods.showMenu();

          choice = (char) System.in.read();

          do {
            ignore = (char) System.in.read();
          } while (ignore != '\n');

        } while ( !methods.isValid(choice));

        if (choice == 'q') break;

        System.out.println("\n");

        methods.selectTopic(choice);
      }
  }
}
