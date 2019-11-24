# Chapter 1 *Self Test*

1. What is bytecode and why is it important to Java's use for Internet
   programming?

Bytecode is a highly optimized set of instructions that is run inside of the
JVM (Java virtual machine), which is effectively an interpreter for bytecode. This is what allows a Java program to run in so many different environments, since only the JVM needs to be implemented. The added benefit of running programs in the JVM is it adds an extra layer of security, since the program does not have access to the user's machine directly.

2. What are the three main principles of object-oriented programming?
  1. Encapsulation - code contained in "black boxes"
  2. Polymorphism - objects of different types being accessed through the same
     interface
  3. Inheritance - objects heirarchically acquiring the properties of other objects


3. Where do Java programs begin execution?

At the main() method.

4. What is a variable

A variable is a name bound to a piece of memory location.

5. Which of the following variable names is invalid?
  [a] count
  [b] $count
  [c] count27
  [d] 67count

[d] Variables cannot begin with numbers.]

6. How do you create a single-line comment? How do you create a multiline
   comment?

   Single line comments begin with "//" and end automatically with a newline. Multiline comments open with "/*" and must be closed with "*/".

7. Show the general form of the *if* statement. Show the general form of the
   *for* loop.

if statement: `if (*conditional*) *statement*;`
for loop:     `for (initialization; condition; iteration) *statement*;`

In both cases the statement can be a code block.j

8. How do you create a block of code?

`{
  *code goes here*;
}`

9. The moon's gravity is about 17 percent that of earth's. Write a program that
   computes your effective weight on the moon.
10. Adapt Try This 1-2 so that it prints a conversion table of inches to meters.
    Display 12 feet of conversions, inch by inch. Output a blank line every 12
    inches. (one meter equals approximately 39.37 inches).
11. If you make a typing mistake when entering your program, what sort of error
  will record?
12. Does it matter where on a line you put a statement?
