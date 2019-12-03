# Chapter 4 **Self Test**

1. What is the difference between a class and an object?

A class defines the form of an object. An object is an instance of a class

2. How is a class defined?

` class *Class Name* {
  *statement(s)*;
} `

3. What does each object have its own copy of?

Class instance variables.

4. Using two separate statements, show how to declare an object called
   **counter** of a class called **MyCounter**.

MyCounter counter;
counter = new MyCounter();

5. Show how a method called **myMeth()** is declared if it has a return type of
   **double** and has two **int** parameters called **a** and **b**.

` double myMeth (int a, int b) {...} `

6. How must a method return if it returns a value?

` return *value*;`

7. What name does a contstructor have?

The same name as its class.

8. What does **new** do?

Creates a new object using a constructor and allocates memory for it.

9. What is garbage collection, and how does it work? What is **finalize()**?

Garbage collection is the automatic recycling of unused objects so the memory
that held them can be used for other things. **finalize()** is a method that is
called just before an object is garbage collected.

10. What is **this**?

**This** is a reference to the object that has invoked it.

11. Can a constructor have one or more parameters?

Yes.

12. If a method returns no value, what must its return type be?

**void**
