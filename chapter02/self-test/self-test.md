# Chapter 2 *Self Test*

1. Why does Java strictly specify the range and behavior of its primitive
   types?

   Java requires strict interpretation of all primitive types so a piece of Java
   code will run absolutely consistently across all JVM environments.

2. What is Java's character type, and how does it differ from the character type
   used by some other programming languages?


3. A *boolean* value can have any value you like because any non-zero value is
   true. True or False?

   False. A boolean can be either true or false.

4. Given this output,
    `One
     Two
     Three`
   using a single string, show the *println()* statement that produced it.


5. What is wrong with this fragment?
    `for(i = 0; i < 10; i++) {
      int sum;

      sum = sum+i;
    }`

    System.out.println("One\nTwo\nThree");

6. Explain the difference between the prefix and postfix forms of the increment
   operator.

   A prefixed ++ or -- will perform the appropriate operation on a variable
   before it is used by the rest of the expression. If it's a postfix, the
   expression will get the value, then increment or decrement.

7. Show how a short-circuit AND can be used to prevent a divide-by-zero error.

   A short-circuit AND stops the evaluation process if the conditional on the
   left side of the operator is false. A single '&' will evaluate both sides,
   regardless of the truth value of the left side.

   `if(n != 0 && x/n)`

8. In an expression, what type are *byte* and *short* promoted to?

   *Bytes* and *shorts* are promoted to *ints* in an expression.

9. In general, when is a cast needed?

   Automatic type conversion only works with widening conversions between
   compatible types. In all other cases, you have to use casting.

10. Write a program that finds all of the prime numbers between 2 and 100.

    This is a brute force solution that is ugly and should be improved.

`class FindAllPrimes {
  public static void main(String args[]) {
    System.out.println("An inclusive list of all prime numbers between 2 and 100!");
    for (int i = 2; i < 101; i++) {
      int count = 0;
      for (int num = i; num > 0; num--)  {
        if (i % num == 0) count++;
      }
      if (count == 2) System.out.print(i + ", ");
    }
    System.out.println();
  }
}`

11. Does the use of a redundant parenthesis affect program performance?


12. Does a black define a scope?
