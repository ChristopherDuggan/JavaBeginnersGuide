class BackwardString {
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
}
