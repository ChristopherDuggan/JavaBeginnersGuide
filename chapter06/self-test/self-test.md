#Chapter 6 **Self Test**

1. Given this fragment,

`
class X {
  private int count
` 
is the following fragment correct?
`
class Y {
  public static void main(String args[]) {
  X ob = new X();

  ob.count = 10;
`

No, because the count member of ob cannot be accessed externally, since it's
private.

2. An access modifier must __________ a member's declaration. 

precede

3. The complement of a que is a stack. It uses first-in, last out accessing and
   is often likened to a stack of plates. The first plate put on the table is
   the last plate used. Create a stack class called *Stack* that can hold
   characters. Call the methods that access the stack *push()* and *pop()*.
   Allow the user te specify the size of the stack when it is created. Keep all
   other members of the *Stack* class private. (Hint: You can use the *Queue*
   class as a model; just change the way the data is accessed.)

    `  
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

        for(int i = 0; i < a.length; i++) push(a[i]);
      }


      void push(char ch) {
        if(top == stack.length) {
          System.out.println(" - The stack is full.");
          return;
        }

        stack[top] = ch;
        top++;
      }

      char pop() {
        if(top == 0) {
          System.out.println(" - The stack is empty.");
          return (char) 0;
        }

        top--;
        return stack[top];
      }
    }

    class StackDemo {
      public static void main(String[] args) {
        Stack stack1 = new Stack(10);

        char name[] = {'C', 'h', 'r', 'i', 's'};

        Stack stack2 = new Stack(name);

        char ch;
        int i;

        for(i = 0; i < 10; i++) stack1.push((char) ('A' + i));

        Stack stack3 = new Stack(stack1);

        System.out.print("Contents of stack1: ");
        for(i = 0; i < 10; i++) {
          ch = stack1.pop();
          System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of stack2: ");
        for(i = 0; i < 5; i++) {
          ch = stack2.pop();
          System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of stack3: ");
        for(i = 0; i < 10; i++) {
          ch = stack3.pop();
          System.out.print(ch);
        }
        System.out.println();
      }
    }
    `

4. Given this class 

  `class Test {
    int a;
    Test(int i) { a = i;}
  }`

  write a method called *swap()* that exchanges the contents of the objects
  referred to by two *Test* object references.

  `void swap(Test ob1, Test ob2) {
    int temp;

    temp = ob1.a;
    ob1.a = ab2.a;
    ob2.a = temp;
  }`

5. Is the following fragment correct?
  `class X { 
    int meth(int a, int b) { ... }
    String meth(int a, int b) { ... }
  }`

  No. Because the parameter lists are the same, the compiler won't know which
  method to use.

6. Write a recursive method that displays the contents of a string backwards.

`class BackwardString {
  String str;

  BackwardString(String s) {
    str = s;
  }
  void backward(int index) {
    if(index != str.length() -1) backward(index+1);

    System.out.print(str.charAt(index));
  }
}

class BSDemo{

  public static void main(String[] args) {
    BackwardString s = new BackwardString("hello, Chris");

    s.backward(0);
  }
}`
