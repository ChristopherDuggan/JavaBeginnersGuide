package qpack;

public class DynQueue implements ICharQ {
  private char[] q;
  private int putIndex, getIndex;

  public DynQueue(int size) {
    q = new char[size];
    putIndex = getIndex = 0;
  }

  public void put (char ch) {
    if(putIndex == q.length) {
      char[] t = new char[q.length * 2];

      for(int i = 0; i < q.length; i++)
        t[i] = q[i];

      q = t;
    }

    q[putIndex++] = ch;
  }

  public char get() {
    if(getIndex == putIndex) {
      System.out.println(" - Qeue is empty.");
      return (char) 0;
    }
    return q[getIndex++];
  }
}
