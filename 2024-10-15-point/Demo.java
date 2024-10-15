public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    double square = Math.pow(a.getX() - b.getX(),2) + Math.pow(a.getY() - b.getY(),2);
    double answer = Math.sqrt(square);
    return answer;
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
	Point p4 = new Point(9, 8);
	Point p5 = new Point(22, 78);
	System.out.println(p4);
	System.out.println(p5);
    System.out.println(distance(p4,p5));
    System.out.println(Point.distance(p4,p5));
    System.out.println(p4.distanceTo(p5));
    Point p6 = new Point(0,0);
    Point p7 = new Point(0.5,Math.sqrt(3) / 2);
    Point p8 = new Point(1, 0);
    System.out.println(p6);
    System.out.println(p7);
    System.out.println(p8);
    System.out.println("Distance from p6 to p7: " + distance(p6,p7));
    System.out.println("Distance from p7 to p8: " + Point.distance(p7,p8));
    System.out.println("Distance from p8 to p6: " + p8.distanceTo(p6));
  }
}