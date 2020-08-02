/* {ALL} */
public class Circle {
  public static final float PI = 3.14f;
  private int radius;
  public Circle(final int r) {
    if (r == 0)
      this.radius = 1;
    else
      this.radius = r;
  }
  private float area() {
    float result = radius * radius * PI;
    return result;
  }
  public static void main(String[] args) {
    try {
      Circle c = new Circle(args[0]);
      System.out.println("Area: " + c.area());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Usage: java Circle [radius]");
    }
  }
}
/* {END} */
