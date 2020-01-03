#Chapter 6 **Self Test**

1. Given this fragment,

`
class X {
  private int count
` 
is the following fragment correct?
`
class Y {
  public static void main(String args[]) {
  X ob = new X();

  ob.count = 10;
`

No, because the count member of ob cannot be accessed externally, since it's
private.

2. An access modifier must __________ a member's declaration. 

precede

3. The complement of a que is a stack. It uses first-in, last out accessing and
   is often likened to a stack of plates. The first plate put on the table is
   the last plate used. Create a stack class called *Stack* that can hold
   characters. Call the methods that access the stack *push()* and *pop()*.
   Allow the user te specify the size of the stack when it is created. Keep all
   other members of the *Stack* class private. (Hint: You can use the *Queue*
   class as a model; just change the way the data is accessed.)
