import static org.junit.Assert.*;
import com.alibaba.fastjson.JSON;

import org.junit.Test;

public class ShopTest {

	@Test
	public void test() {
		Shop shop = new Shop();
		shop.setId(1);
		shop.setName("David");
		String jsonString1 = JSON.toJSONString(shop);
		assertEquals("{\"id\":1,\"name\":\"David\",\"orders\":[]}", jsonString1);
		
		Order order1 = new Order();
		order1.setItemName("Ice cream");
		order1.setPrice(3.5);
		order1.setQuantity(2);
		String jsonString2 = JSON.toJSONString(order1);
		assertEquals("{\"itemName\":\"Ice cream\",\"price\":3.5,\"quantity\":2}", jsonString2);
		
		Order order2 = new Order();
		order2.setItemName("Chocolate");
		order2.setPrice(5.5);
		order2.setQuantity(3);
		
		shop.addOrder(order1);
		shop.addOrder(order2);
		String jsonString3 = JSON.toJSONString(shop);
		assertEquals("{\"id\":1,\"name\":\"David\",\"orders\":[{\"itemName\":\"Ice cream\",\"price\":3.5,\"quantity\":2},{\"itemName\":\"Chocolate\",\"price\":5.5,\"quantity\":3}]}", jsonString3);
		
		Shop newShop = JSON.parseObject(jsonString3, Shop.class);
		assertEquals("1,David,[Ice cream,2,3.5, Chocolate,3,5.5]",newShop.toString());
	}

}
