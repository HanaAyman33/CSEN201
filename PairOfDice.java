public class PairOfDice {
	int d1;
	int d2;
	public static void main(String[] args) {
		PairOfDice p1 = new PairOfDice();
		System.out.println(p1.getTotal());
		int count = 1;
		while(p1.getTotal()!=2) {
			p1.roll();
			count++;
		}
		System.out.println("It took "+count+" rolls to get snake eyes");
	}
	public PairOfDice(){
		roll();
	}
	public void roll() {
		this.d1 =(int) (Math.random()*6);
		this.d2 =(int) (Math.random()*6);
	}
	public int getFirstDice() {
		return this.d1;
	}
	public int getSecondDice() {
		return this.d2;
	}
	public int getTotal() {
		return this.d1+this.d2;
	}
}
