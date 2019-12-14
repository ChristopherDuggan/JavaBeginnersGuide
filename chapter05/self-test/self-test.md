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
5. What is the difference between the string methods *indexOf()* and
   *lastIndexOf()*?

   *indexOf()* finds the index of the first occurrence of a pattern starting
   from the front of the object. *lastIndexOf()*  finds the index of the first
   occurrence of a pattern starting from the end of the object.

6. Since all strings are objects of type *String*, show how you can tell the *length()* and *charAt()* methods on this string literal: "I like Java".

You can use `"I like Java".length()` to show the length and `"I like
Java".charAt(x)` to show the char at x.

7. Expanding on the *Encode* cipher class, modify it so that it uses and
   eight-character string as the key.
`
class Encode {
  public static void main(String args[]) {
    String msg = "This is a test";
    String encmsg = "";
    String decmsg = "";
    String  key = "a string";
    int n = 0;

    System.out.print("Original message: ");
    System.out.println(msg);

    for(int i = 0; i < msg.length(); i++){
      encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(n));
      n++;
      if(n == 8) n = 0;
    }

    System.out.print("Encoded message: ");
    System.out.println(encmsg);

    n = 0;
    for(int i = 0; i < msg.length(); i++){
      decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(n));
      n++;
      if(n == 8) n = 0;
    }

    System.out.print("Decoded message: ");
    System.out.println(decmsg);
  }
}
`

8. Can the bitwise operators be applied to the *double* type?

no.

9. Show how this sequence can be rewritten using the *?* operator.
    `if(x < 0) y = 10;
    else y = 20;`

`x<0 ? y = 10: y = 20;`
or
`y = x < 0 ? 10 : 20;`

10. In the following fragment, is the *&* a bit-wise or logical operator?
    Why?

    `boolean a, b;
    // ...
    if(a & b)...`

It is a logical operator because the operands are booleans

11. Is it an error to overrun the end of an array? Is it an error to index
    an array with a negative value?

    yes and yes.

12. What is the unsigned right-shift operator?
  `>>>`

13. Rewrite the *MinMax* class shown earlier in this chapter so that it uses a
    for-each style *for* loop.

    `
class MinMax {
  public static void main(String args[]) {
    int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
    int min, max;

    min = max = nums[0];
    for(int n: nums) {
      if(n < min) min = n;
      if(n > max) max = n;
    }
    System.out.println("min and max: " + min + " " + max);
  }
}
`
14. Can the for loops that perform sorting in the *Bubble* class shown in *Try
    This 5-1* be converted into for-each style loops? If not, why?

No. The inner loop needs to get the current value of the outer loop and out
of order values need to be reassigned. You can't do that with a for-each
loop.

15. Can a *String* control a *switch* statement?

Yes.
