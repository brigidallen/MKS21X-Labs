public class Point{
   private double x,y;
   public Point(double X, double Y){
     x=X;
     y=Y;
   }
   public Point(Point p){
     x= p.x;
     y= p.y;
   }
   public double getX(){
     return x;
   }
   public double getY(){
     return y;
   }
   public static double distance(Point a, Point b) {
     double answer = Math.pow(a.x-b.x, 2) + Math.pow(a.y-b.y, 2);
     answer = Math.sqrt(answer);
     return answer;
   }
   public double distanceTo(Point a) {
     double answer = Math.pow(a.x-x, 2) + Math.pow(a.y-y, 2);
     answer = Math.sqrt(answer);
     return answer;
   }
 }
