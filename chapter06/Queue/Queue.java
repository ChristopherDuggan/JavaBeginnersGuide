class Queue {
  private char[] q;
  private int putIndex, getIndex;

  Queue(int size) {
    q = new char[size];
    putIndex = getIndex = 0;
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

class QDemo {
  public static void main(String args[]) {
    Queue bigQ = new Queue(100);
    Queue smallQ = new Queue(4);
    char ch;
    int i;

    System.out.println("Using bigQ to store the alphabet.");
    for(i = 0; i < 26; i++)
      bigQ.put((char) ('A' + i));

    System.out.print("Contents of biQ: ");
    for(i = 0; i < 26; i++) {
      ch = bigQ.get();
      if(ch != (char) 0) System.out.print(ch);
    }
    System.out.println("\n");

    System.out.println("Using smallQ to generate errors.");
    for(i = 0; i < 5; i++) {
      System.out.print("Attempting to store " + (char) ('Z' - i));

      smallQ.put((char) ('Z' - i));

      System.out.println();
    }
    System.out.println();

    System.out.print("Contents of smallQ: ");
    for(i = 0; i < 5; i++) {
      ch = smallQ.get();

      if(ch != (char) 0) System.out.print(ch);
    }
  }
}
