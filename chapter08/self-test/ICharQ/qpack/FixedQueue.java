package qpack;

public class FixedQueue implements ICharQ  {
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
