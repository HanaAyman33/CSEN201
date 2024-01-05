public class Point {
   int x,y;
   static int count;
   public static void main(String[] args) {
	   Point p1 = new Point(3,5);
	   System.out.println(p1);
	   Point p2 = new Point(1,2);
	   p1.swap(p2);
	   System.out.println(p1);
	   System.out.println(p2);
	   swap(p1,p2);
	   System.out.println(p1);
	   System.out.println(p2);

   }
   public Point(int x,int y) {
	   this.x = x;
	   this.y = y;
	   count++;
   }
   public String toString() {
	   return "("+this.x+","+this.y+")";
   }
   public Point() {
	   x = 0;
	   y = 0;
	   count++;
   }
   public static Point add(Point p1,Point p2) {
	   return new Point(p1.x+p2.x,p1.y+p2.y);
   }
   public void add(Point p) {
	   this.x+=p.x;
	   this.y+=p.y;
   }
   public static void swap(Point p1,Point p2) {
	   	int temp1 = p1.x;
	   	p1.x = p2.x;
	   	p2.x = temp1;
	   	int temp2 = p1.y;
	   	p1.y = p2.y;
	   	p2.y = temp2;
   }
   public void swap(Point p) {
	   int temp1 = this.x;
	   this.x = p.x;
	   p.x = temp1;
	   int temp2 = this.y;
	   this.y = p.y;
	   p.y = temp2;
   }
}
