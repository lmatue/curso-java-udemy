package Program;
import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Exerc_Enums {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);

	}

}
