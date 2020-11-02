// Thank you to Christopher Liu and Steven Lei for helping with Test Cases.
public class Triangle{
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c)
  {
    {
      Point t1 = a;
      Point t2 = b;
      Point t3 = c;
      if (!((t1.equals(t2) || t2.equals(t3)) || t3.equals(t1))){v1 = t1;v2 = t2;v3 = t3;}
    }
  }
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3)
  {
    {
      Point t1 = new Point(x1, y1);
      Point t2 = new Point(x2, y2);
      Point t3 = new Point(x3, y3);
      if (!((t1.equals(t2) || t2.equals(t3)) || t3.equals(t1))){v1 = t1;v2 = t2;v3 = t3;}

    }
  }
  public double getPerimeter() //Return the perimeter without any rounding.
  {
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    return a + b + c;
  }

   public double getArea()
   {
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
 		double s = this.getPerimeter() / 2;
 		return Math.sqrt((s - c)*(s - b)*(s - a)*s);
   }

   public String classify()
   {
     double a = Math.round(v1.distanceTo(v2) * 1000);
     double b = Math.round(v2.distanceTo(v3) * 1000);
     double c = Math.round(v3.distanceTo(v1) * 1000);
     a = a / 1000;
     b = b / 1000;
     c = c / 1000;
     if (!(((a == b) || b == c ) || c == a))
      {
        return "scalene";
      }
      if (((a == b) && b == c ) && c == a)
      {
        return "equilateral";
      }
      else
      {
        return "isosceles";
      }
    }
  public String toString()
  {
    String x1 = String.valueOf(this.v1.getX());
    String x2 = String.valueOf(this.v2.getX());
    String x3 = String.valueOf(this.v3.getX());
    String y1 = String.valueOf(this.v1.getY());
    String y2 = String.valueOf(this.v2.getY());
    String y3 = String.valueOf(this.v3.getY());
    return "v1(" + x1 + ", " + y1 + ") v2(" + x2 + ", " + y2 + ") v3(" + x3 + ", " + y3 + ")";
  }
  public void setVertex(int index, Point newP)
  {
    if (index == 1) {this.v1.setPointCoords(newP.getX(), newP.getY());}
    if (index == 2) {this.v2.setPointCoords(newP.getX(), newP.getY());}
    if (index == 3) {this.v3.setPointCoords(newP.getX(), newP.getY());}
  }
}
