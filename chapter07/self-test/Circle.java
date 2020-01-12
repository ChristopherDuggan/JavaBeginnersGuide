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
}
