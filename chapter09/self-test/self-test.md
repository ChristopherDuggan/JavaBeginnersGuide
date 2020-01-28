# Chapter 9 **Self Test**

1. What class is at the top of the exception hierarchy?

Throwable

2. Briefly explain how to use *try* and *catch*.

Using *try* makes the JVM monitor the block for exceptions. When one pops up,
*catch* says what to do.

3. What is wrong with this fragment?
  `// ...
  vals[18] = 10;
  catch (ArrayIndexOutOfBoundsException exc) {
    // handle error
  }`

  There is a *catch* without a *try*.

4. What happens if an exception is not caught?

The program terminates.

5. What is wrong with this fragment?

  `class A extends Exception { ...

  class B extends A { ...

  // ...
  try {
    // ...
  }
  catch (A exc) { ... }
  catch (B exc) { ... }
  `
The superclass *catch* is before the subclass *catch*, making the subclass
*catch* unreachable.

6. Can an inner *catch* rethrow an exception to an outer *catch*?

Yes

7. The *finally* block is the last bit of code executed before your program
   ends. True or False? Explain your answer.

False. *Finally* happens at the end of a *try* block, not at the end of the
program.

8. What type of exceptions must be explicitly declared in a *throws* clause of a
   method?

All except *RuntimeException* and *Error*.

9. What is wrong with this fragment?
  
  `class MyClass { // ... }
    // ...
    throw new MyClass();
  `

*MyClass* needs to extend *Throwable* so it can be thrown by *throw*.

10. In question 3 of the __Chapter 6__ Self Test, you created a *Stack* class.
    Add custom exceptions to your class that report stack full and stack empty
    conditions.

    `
class StackFullException extends Exception {
  int length;

  StackFullException(int s) { length = s; }

  public String toString() {
    return "\nStack is full. Maximum length is " + length;
  }
}

class StackEmptyException extends Exception {
  public String toString() {
    return "\nStack is empty.";
  }
}

class Stack {
  private char[] stack;
  private int top;

  Stack(int length) {
    stack = new char[length];
    top = 0;
  }

  Stack(Stack ob) {
    top = ob.top;
    stack = new char[ob.stack.length];

    for(int i = 0; i < top; i++) stack [i] = ob.stack[i];
  }

  Stack(char[] a) {
    stack = new char[a.length];

    for(int i = 0; i < a.length; i++){
      try {
        push(a[i]);
      }
      catch (StackFullException exc) {
        System.out.println(exc);
      }
    }
  }


  void push(char ch) throws StackFullException {
    if (top == stack.length)
      throw new StackFullException(stack.length);

    stack[top] = ch;
    top++;
  }

  char pop() throws StackEmptyException {
    if (top == 0)
      throw new StackEmptyException();
    top--;
    return stack[top];
  }
}
    `

11. What are three ways that an exception can be generated?

A JVM error, a program error, or through a defined *throw* statement.

12. What are the two direct subclasses of *Throwable*?

*Error* and *Exception*.

13. What is the multi-catch feature?

Using one *catch* for multiple exceptions.

14. Should your code typically catch exceptions of type *Error*?

No.
