class LogicalOpTable {
  public static void main(String args[]) {
    boolean p = true;
    boolean q = true;
    System.out.println("p \tq\tp == q\tp!=q\tp & q\tp | q\tp ^ q \tp || q\tp && q\t!p\t");
    for (int i = 0; i < 4; i++) {
      if (i == 1) q = false;
      if (i == 2) {
        p = false;
        q = true;
      }
      if (i == 3) q = false;
      System.out.println(p + "\t" + q + "\t" + (p == q) + "\t" + (p !=q) + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (p || q) + "\t" + (p && q) + "\t" + !p);
    }
  }
}
