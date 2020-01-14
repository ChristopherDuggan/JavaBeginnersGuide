class FixedQueue implements ICharQ  {
  private char q[];
  private int putIndex, getIndex;

  public FixedQueue(int size) {
    q = new char[size];
    putIndex = getIndex = 0;
  }

  public void put(char ch) {
    if(putIndex == q.length) {
      System.out.println(" - Queue is full.");
      return;
    }

    q[putIndex++] = ch;
  }

  public char get() {
    if(getIndex == putIndex) {
      System.out.println(" - Queue is empty.");
      return (char) 0;
    }

    return q[getIndex++];
  }
}

class CircularQueue implements ICharQ {
  private char q[];
  private int putIndex, getIndex;

  public CircularQueue(int size) {
    q = new char[size + 1];
    putIndex = getIndex = 0;
  }

  public void put(char ch) {
  if(putIndex + 1 == getIndex |
      ((putIndex == q.length - 1) & (getIndex == 0))) {
    System.out.println(" - Queue is full.");
    return;
      }

  q[putIndex++] = ch;
  if(putIndex == q.length) putIndex = 0;
  }

  public char get() {
    if(getIndex == putIndex) {

      System.out.println(" - Queue is empty.");
      return (char) 0;
  }

  char ch = q[getIndex++];
  if(getIndex == q.length) getIndex = 0;
  return ch;
  }
}

class DynQueue implements ICharQ {
  private char[] q;
  private int putIndex, getIndex;

  public DynQueue(int size) {
    q = new char[size];
    putIndex = getIndex = 0;
  }

  public void pit (char ch) {
    if(putIndex == q.length) {
      char[] t = new char[q.length * 2];

      for(int i = 0; i < q.length; i++)
        t[i] = q[i];

      q = t;
    }

    q[]
  }
}
