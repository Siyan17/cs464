import java.util.*;
import com.alibaba.fastjson.JSON;
public class Shop  {
	private int id;
	private String name;
	private List<Order> orders = new ArrayList<>();
	
	
	public int  getId() {
		return id;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public List<Order> getOrders(){
		return orders;
	}
	
	public void setOrders(List<Order> orders ) {
		this.orders = orders;
	}
	
	public void addOrder(Order order){
		orders.add(order);
	}
	
	@Override 
	public String toString() {
		return id + ","+ name +"," + orders;
	}
	
	
	
}
