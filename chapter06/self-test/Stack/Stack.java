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
