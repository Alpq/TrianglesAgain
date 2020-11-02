// Thank you to Christopher Liu and Steven Lei for helping with Test Cases.
public class Point{
    private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y)
  {
    x=X;
    y=Y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p)
  {
    x= p.x;  //private access in the same file is allowed!
    y= p.y;
  }

  public void setPointCoords(double x, double y)
  {
    this.x= x;
    this.y= y;
  }

  public double getX()
  {
    return x;
  }

  public double getY()
  {
    return y;
  }

  public double distanceTo(Point other)
  {
    double beeg = Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2);
    return Math.sqrt(beeg);
  }
  public boolean equals( Point other)
  {
    return (this.x == other.x && other.y == other.y);
  }

}
