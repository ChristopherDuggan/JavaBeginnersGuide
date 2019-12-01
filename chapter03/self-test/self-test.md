# Chapter 3 **Self Test**

1. Write a program that reads characters from the keyboard until a period is
   received. Have the program count the number of spaces. Report the total at
   the end of the program.

    `class SpaceCounter {
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
    }`

2. Show the general form of the **if-else-if** ladder.

    if(*condition*)
      *statement*;
    else if(*condition*)
      *statement*;
    else if(*condition*)
      *statement*;
    .
    .
    .
    else
      *statement*;

3. Given

   `if (e < 10)
      if (y > 100) {
        if (!done) x = z;
        else y = z;
      }
      else System.out.println("error"); //what if?`

   to what **if** does the last **else** associate?

if (y > 100).

4. Show the **for** satement for a loop that counts from 1000 to 0 by -2.

`for (int i = 1000; i >=0; i-=2)`

5. Is the following fragment valid?

   `for(int i = 0; i < num; i++)
      sum += i;

     count = i;`

No. the **count** cannot see the i that is created inside of the for loop. It
could be made valid by moving **count = i** into the same scope as **i**, either
by wrapping the code after the **for** into a block or declaring **i** before
the for loop.

6. Explain what **break** does. Be sure to explain both of its forms.

A regular break immediately ends a loop or switch statement. A break with a
label transfers control to the end of the labeled block.

7. In the following fragment, after the **break** statement executes, what is
   displayed?

   `for(i=0; i < 10; i++) {
      while (running){
        if (x < y) break;
      }
      System.out.println("after while");
    }
    System.out.println("After for");`

after while

8. What does the following fragment print?

    `for(int i = 0; i < 10; i++) {
      System.out.print(i + " ");
      if((i % 2) == 0) continue;
      System.out.println();
    }`

0 1
2 3
4 5
6 7
8 9

9. The iteration expression in a **for** loop need not always alter the loop
   control variable by a fixed amount. Instead, the loop control variable can
   change in any arbitrary way. Using this concept, write a program that uses a
   **for** loop to generate and display the progression 1, 2, 4, 8, 16, 32, and
   so on.

`
class Power2Loop {
  public static void main(String args[]){
    for(int i = 1; i < 33; i*=2) System.out.println(i);
  }
}
`

10. The ASCII lowercase letters are separated from the uppercase letters by 32.
    Thus, to convert a lowercase letter to uppercase, subtract 32 from it. Use
    this information to write a program that reads characters from the keybeard.
    Have it convert all lowercase letters to uppercase, and all uppercase
    letters to lowercase, displaying the result. Make no changes to any other
    character. Have the program stop when the user enters a period. At the end,
    have the program display the number of case changes that have taken place.

`
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
`

11. What is an infinite loop?

A loop that continues indefinitely.

12.  When using **break** with a label, must the label be on a block that
     contains the  **break**?

     Yes.
