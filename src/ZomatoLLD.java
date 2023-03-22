import java.util.List;

class ZomatoBase {
	List<Restraunt> restraunt;
	List<Users> users;
	List<DeliveryBoys> deliveryBoys;
	Cart cart;
	Order order;
	Coupon coupon;
}

class Restraunt {
	private String name;
	private String location;
	private Menu menu;

	// constructor
	public void registerRestraunt(String name, String location, Menu menu) {
		// api call
	}

}

class Users {
//	create,update,delete,get;
	// search restraunt
	String name;
	String userId;

	public void create() {

	}

	public void update() {

	}

	public void delete() {

	}

	public void get() {

	}

	public void searchRestraunt(String name) {

	}
}

class Cart {
	List<Item> items;

	public void addItem(Item item) {
		//
	}

	public void RemoveItem(Item item) {
		//
	}
}

class DeliveryBoys {

}

class Order {
	String orderId;

	enum status {
		outForDelivery, Delivered, canceled
	}

	Order.status orderStatus;

	String placeOrder() {
		return orderId;
	}

	void cancelOrder(String orderId) {
		// cancel order
		orderStatus = status.canceled;
	}

	Order.status getOrderStatus(String orderId) {
		return status.Delivered;
	}
}

class Coupon {
	String CouponCode;
	Integer PercentageDiscount;
}

class Menu {
	List<Item> foodItems;

	public void add(Item newItem) {
		// adding to the list.
	}

	public boolean remove(Item newItem) {
		// removing from the list.
		return true;
	}
}

interface Item {
	Integer cost = null;

}

class FoodItem implements Item {
	String name;

	enum Cuisine {
		INDIAN, WESTERN
	}

	Integer cost = 5;
}

public class ZomatoLLD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
