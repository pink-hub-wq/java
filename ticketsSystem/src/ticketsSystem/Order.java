package ticketsSystem;

public class Order {
	public String trips;
	public int price;
	public int number;
	public Order(String trips, int price, int number) {
		super();
		this.trips = trips;
		this.price = price;
		this.number = number;
	}
	public Order() {
		super();
	}
}
