class LogicalOpTable {
  public static void main(String args[]) {
    boolean p = q = true;
    System.out.println("| p \t| q \t| p == q \t| p!=q \t| p & q \t| p | q \t| p ^ q \t| p || q \t| p && q \t| !p \t|");
    for (int i = 0; i < 4; i++) {
      if (i = 1) q = false;
      if (i = 2) {
        p = false;
        q = true;
      }
      if (i = 3) q = false;
      System.out.println("| " + p + "\t|" + q + "\t|" p == q + "\t|" + p != q + "\t| " + p & q + "\t| " + p | q + "\t|" + p ^ q + "\t|" + p || q + "\t|" + p && + "\t|" + !p + "\t|");
    }
  }
}
