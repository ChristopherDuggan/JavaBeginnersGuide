#Chapter 7 **Self Test**

1. Does a superclass have access to the members of a subclass? Does a
   subclass have access to the members of a superclass?

   A superclass does not have access to the members of the subclass but the
   subclass has access to the members of the superclass.

2. Create a subclass of *TwoDShape* called *Circle*. Include an *area()* method
   that computes the area of the circle and a constructor that uses *super* to
   initialize the *TwoDShape* portion.
   `
class Circle extends TwoDShape {
  Circle() {
    super();
  }
  Circle (double x) {
    super (x, "circle");
  }

  Circle (Circle ob) {
    super(ob);
  }

  double area() {
    return (getWidth() / 2) * (getWidth() / 2) * 3.14159;
  }
}`

3. How do you prevent a subclass from having access to a member of a superclass? 

Declare the superclass' member as private.

4. Describe the purpose and use of the two versions of *super* described in this
   chapter.

   The *super* keyword can either be used to call a superclass constructor ex:
   `super (parameters)`
   or can be used to access a superclass member ex: 
   `super.member`

5. Given the following hierarchy, in what order do the constructors for these
   classes complete their execution when a *Gamma* object is instantiated?
   ` class Alpha { ...

   class Beta extends Alpha { ... 

   Class Gama extends Beta { ...`

   The super classes are created before their subclasses so it goes *Alpha*,
   *Beta*, *Gamma*.

6. A superclass reference can refer to a subclass object. Explain why this is
   important as it is related to method overriding.

   The type of the object being referred to determines which version of the
   method is called.

7. What is an abstract class?

    A class that contains at least one "undefined" method that has to be
    determined by a subclass.

8. How do you prevent a method from being overridden? How do you prevent a class
   from being inherited?

   Both are accomplished by declaring the method or class as *final*.

9. Explain how inheritance, method overriding, and abstract classes are used to
   support polymorphism.

   They let you create a class structure that follows the "one interface, many
   methods" concept. 

10. What class is a superclass of every other class? 

   Object 

11. A class that contains at least one abstract method must, itself, be
    declared abstract. True or false?

    True

12. What keyword is used to create a named constant?

    final
