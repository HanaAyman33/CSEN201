public class Triangle {
	Point p1;
	Point p2;
	Point p3;
	static int count;
	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = new Point(3,4);
		Point p3 = new Point(5,6);
		Triangle t1= new Triangle(p1,p2,p3);
		System.out.println(t1);
		System.out.println("X-coordinate of Point 1: "+t1.p1.x);
		System.out.println("y-coordinate of Point 1: "+t1.p1.y);
		t1.rotate();
		System.out.println(t1);
		Triangle t2 = t1.copy();
		Triangle t3 = t1.copy();
		System.out.println("Triangles created = "+count);
		System.out.println("Points created = "+Point.count);
	}
	public Triangle() {
		p1 = new Point(0,0);
		p2 = new Point(0,0);
		p3 = new Point(0,0);
		count++;
	}
	public Triangle(Point p1,Point p2,Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		count++;
		Point.count+=3;
	}
	public String toString() {
		return "p1:"+this.p1+",p2:"+this.p2+",p3:"+this.p3;
	}
	public Triangle copy() {
		return new Triangle(this.p1,this.p2,this.p3);
	}
	public void rotate() {
		Point temp = p1;
		p1 = p2;
		p2 = p3;
		p3 = temp;
	}
}
