
public class Order {
	private String itemName;
	private int quantity;
	private double price;
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String newName) {
		itemName = newName;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int newQuantity) {
		quantity = newQuantity;
	}
	
	public double  getPrice() {
		return price;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	@Override public String toString() {
		return itemName + "," + quantity +"," + price;
	}

}
