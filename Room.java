public class Room {
	int nroom;
	String guest;
	double rate;
	int ndays;
	int nbeds;
	public static void main(String[] args) {
		Room r = new Room("Blake",123,1,123.50,5);
		System.out.println(r);
		r.addBed();
		r.calculateTotal();
		System.out.println();
		System.out.println(r);
	}
	public Room(String guest,int nroom,int nbeds,double rate,int ndays) {
		this.guest = guest;
		this.nroom = nroom;
		this.nbeds = nbeds;
		this.rate = rate;
		this.ndays = ndays;
	}
	public void calculateTotal() {
		this.rate*=this.ndays;
	}
	public void addBed() {
		if(this.nbeds<2)
			this.nbeds++;
		else
			System.out.println("Reached number of maximum beds");
	}
	public String toString() {
		return "Guest: "+this.guest+"\n"+
			"Rooms: "+this.nroom+"\n"+
			"Beds: "+this.nbeds+"\n"+
			"Rate: "+this.rate+"\n"+
			"Rented for : "+this.ndays+" days";
	}
}
