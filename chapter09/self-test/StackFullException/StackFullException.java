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
