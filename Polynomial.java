public class Polynomial {
	int[] p;
	public Polynomial() {
		this.p = p;
	}
	public Polynomial(int[] p) {
		for(int i = 0;i<p.length;i++) {
			this.p[i] = p[i];
		}
	}
	public int degree() {
		for(int i = 0;i<this.p.length;i++) {
			if(p[i]!=0)
				break;
		return p[i]-i-1;
		}
	}
	public static Polynomial add(Polynomial p1,Polynomial p2) {
		int[] newPoly = new int[p1.length];
		for(int i = 0;i<p1.length;i++) {
			newPoly[i] = p1.degree()+p2.degree();
		}
		return new Polynomial(newPoly);
	}
	public Polynomial add(Polynomial p1) {
		int[] newPoly = new int[p.length];
		for(int i = 0;i<p.length;i++) {
			newPoly[i] = this.p[i]+p1.degree();
		}
		return new Polynomial(newPoly);
	}
	public String toString() {
		String s = "";
		for(int i = p.length-1;i<this.p.length && i!=0;i++) {
			s+=this.p[i]+"x^"+i+" + ";
		}
		s+=this.p[0];
		return s;
	}
	public static void main(String[] args) {
		int[] p1 = {3,4,5};
		Polynomial poly1 = new Polynomial(p1);
		int[] p2 = {1,2,3};
		Polynomial poly2 = new Polynomial(p2);
		System.out.println(poly2.degree());
		System.out.println(add(p1,p2));
		System.out.println(poly1.add(poly2));
		System.out.println(poly1);
	}
}
