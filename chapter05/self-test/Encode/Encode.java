class Encode {
  public static void main(String args[]) {
    String msg = "This is a test";
    String encmsg = "";
    String decmsg = "";
    String  key = "a string";
    int n = 0;

    System.out.print("Original message: ");
    System.out.println(msg);

    for(int i = 0; i < msg.length(); i++){
      encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(n));
      n++;
      if(n == 8) n = 0;
    }

    System.out.print("Encoded message: ");
    System.out.println(encmsg);

    n = 0;
    for(int i = 0; i < msg.length(); i++){
      decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(n));
      n++;
      if(n == 8) n = 0;
    }

    System.out.print("Decoded message: ");
    System.out.println(decmsg);
  }
}
