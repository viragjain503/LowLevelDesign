package DesginPatterns;

import java.util.List;

interface PaymentStrategy{
	
	void pay(int totalAmount);

}

class Item{
	String itemName;
	int price;
	
	public Item(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
	}

}

class ShoppingCart {
	List<Item> items;
	int totalAmount;
	
	public List<Item> getItems() {
		return items;
	}

	public void addtem(Item item) {
		items.add(item);
	}
	
	public int calculateTotalAmount() {
		this.totalAmount = 70;
		return this.totalAmount;
	}
	
	
	void pay(PaymentStrategy paymentStategy) {
		paymentStategy.pay(this.calculateTotalAmount());
	}
}

class CreditCardStrategy implements PaymentStrategy{
	String cardNumber;
	int cardPin;
	int cvv;
	
	public CreditCardStrategy(String cardNumber, int cardPin, int cvv) {
		this.cardNumber = cardNumber;
		this.cardPin = cardPin;
		this.cvv = cvv;
	}

	@Override
	public void pay(int totalAmount) {
		System.out.println("Implementing Credit card payment");
	}
	
}

class PayPalStrategy implements PaymentStrategy{
	String username;
	String password;
	
	public PayPalStrategy(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public void pay(int totalAmount) {
		System.out.println("Implementing Paypal payment");
	}
	
}

public class StrategyDesignPattern {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item("Toothpaste", 100);
		Item item2 = new Item("Brush", 20);
		cart.addtem(item1);
		cart.addtem(item2);
		
		cart.pay(new CreditCardStrategy("1234-123-12123-123",1921 , 158));
		cart.pay(new PayPalStrategy("viraguser","paypalpassword"));
	}

}
