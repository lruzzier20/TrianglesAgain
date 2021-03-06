public class Triangle{
  public Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c){
    v1=a;
    v2=b;
    v3=c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    Point d = new Point(x1, y1);
    Point e = new Point(x2, y2);
    Point f = new Point(x3, y3);
    v1=d;
    v2=e;
    v3=f;
  }

  public double getPerimeter(){
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public double getArea(){
    double sideA = v1.distanceTo(v2);
    double sideB = v2.distanceTo(v3);
    double sideC = v3.distanceTo(v1);
    double semiPerimeter = getPerimeter() / 2;
    return Math.round(Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC)) * 10000.0) / 10000.0;
  }

  public String classify(){
    double sideA = v1.distanceTo(v2);
    double sideB = v2.distanceTo(v3);
    double sideC = v3.distanceTo(v1);
    if(sideA == sideB && sideB == sideC){return "equilateral";}
    if(sideA == sideB || sideB == sideC || sideA == sideC){return "isosceles";}
    return "scalene";
  }

  public String toString(){
    return "v1("+v1.getX()+", "+v1.getY()+") v2("+v2.getX()+", "+v2.getY()+") v3("+v3.getX()+", "+v3.getY()+")";
  }

  public void setVertex(int index, Point newP){
    if(index==0){v1=newP;}
    if(index==1){v2=newP;}
    if(index==2){v3=newP;}
  }
}
