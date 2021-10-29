public class Triangle{
   private Point v1,v2,v3;
   public Triangle(Point a, Point b, Point c){
     v1 = a;
     v2 = b;
     v3 = c;
   }
   public Triangle(int a1, int a2, int b1, int b2, int c1, int c2){
     v1 = new Point(a1, a2);
     v2 = new Point(b1, b2);
     v3 = new Point(c1, c2);
   }
   public Point getVertex(int inty){
     if (inty == 1){
       return v1;
     } else if (inty == 2){
       return v2;
     } return v3;
   }
   public void setVertex(int inty, Point newp){
     if (inty == 1){
       v1 = newp;
     } else if (inty == 2){
       v2 = newp;
     } else {
       v3 = newp;
     }
   }
   public String toString(){
     return "{" + v1 + ", " + v2 + ", " + v3 + "}";
   }
   public double getPerimeter(){
     double sidea = Point.distance(v1, v2);
     double sideb = Point.distance(v2, v3);
     double sidec = Point.distance(v3, v1);
     return sidea + sideb + sidec;
   }
}
