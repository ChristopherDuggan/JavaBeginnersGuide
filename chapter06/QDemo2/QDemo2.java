class Queue {
  private char[] q;
  private int putIndex, getIndex;

  Queue(int size) {
    q = new char[size];
    putIndex = getIndex = 0;
  }

  Queue(Queue ob) {
    putIndex = ob.putIndex;
    getIndex = ob.getIndex;
    q = new char[ob.q.length];

    for(int i = getIndex; i < putIndex; i++)
      q[i] = ob.q[i];
  }

  Queue(char[] a) {
    putIndex = 0;
    getIndex = 0;
    q = new char[a.length];

    for(int i = 0; i < a.length; i++) put(a[i]);
  }

  void put(char ch) {
    if (putIndex == q.length) {
     System.out.println(" - The queue is full.");
     return;
    }

    q[putIndex++] = ch;
  }

  char get() {
    if (getIndex == putIndex) {
      System.out.println(" - The queue is empty.");
      return (char) 0;
    }
    return q[getIndex++];
  }
}

class QDemo2{
  public static void main(String args[]) {
    Queue q1 = new Queue(10);

    char[] name = {'T', 'o', 'm'};

    Queue q2 = new Queue(name);

    char ch;
    int i;

    for(i = 0; i < 10; i++)
      q1.put((char) ('A' + i));

    Queue q3 = new Queue(q1);

    System.out.print("Contents of q1: ");
    for(i = 0; i < 10; i++) {
      ch = q1.get();

      System.out.print(ch);
    }

    System.out.println("\n");

    System.out.print("Contents of q2: ");
    for(i = 0; i < 3; i++) {
      ch = q2.get();
      System.out.print(ch);
    }

    System.out.println("\n");


    System.out.print("Contents of q3: ");
    for(i = 0; i < 10; i++) {
      ch = q3.get();
      System.out.print(ch);
    }
  }
}
