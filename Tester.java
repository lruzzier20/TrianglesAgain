public class Tester{
  public static void main(String[] args){
    Point x = new Point(0, 0);
    Point y = new Point(0, 1);
    Point z = new Point(1, 1);
    System.out.println(x.getX());
    System.out.println(x.getY());
    System.out.println(x.distanceTo(y));
    System.out.println(x.equals(y));
    Triangle I = new Triangle(x, y, z);
    Triangle J = new Triangle(0, 0, 3, 0, 3, 4);
  }
}
