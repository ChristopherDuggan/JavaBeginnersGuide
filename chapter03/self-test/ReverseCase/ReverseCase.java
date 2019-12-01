/*
   The ASCII lowercase letters are separated from the uppercase letters by 32.
   Thus, to convert a lowercase letter to uppercase, subtract 32 from it. Use
   this information to write a program that reads characters from the keybeard.
   Have it convert all lowercase letters to uppercase, and all uppercase
   letters to lowercase, displaying the result. Make no changes to any other
   character. Have the program stop when the user enters a period. At the end,
   have the program display the number of case changes that have taken place.
   */

class ReverseCase {
  public static void main(String args[])
      throws java.io.IOException {

      int switchCount = 0;
      int input;

      do {
        input =System.in.read();
        if((input > 64) && (input < 91)) {
          switchCount++;
          input += 32;
        }
        else if((input > 96) && (input < 123)){
          switchCount++;
          input -= 32;
        }
        System.out.println((char)input);
      } while (input!='.');
      System.out.println(switchCount +  " cases were switched");
  }
}

  //todo
  //make it take in a full string and reverse each character
