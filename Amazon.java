package array;

public class Amazon {
	public static void  categories() {
		System.out.println("beauty products\n"+"glosaries\n"+"Footware\n"+"women &mens clothings");
	}
	public static void  addToCart() {
		System.out.println("Items is added to cart");
	}
	public static void  paymentMethod() {
		System.out.println("payment method\n"+"COD\n"+"Phonepay\n"+"Amazonpay\n"+"Google pay\n");
	}
	public static void  orderAndReturns() {
		System.out.println("order placed successfully\n"+"return are refund\n");
	}
	public static void main(String[] args) {
		System.out.println("Login to Amazon\n"+"Successfully login : ");
		Amazon.categories();
		Amazon.addToCart();
		Amazon.paymentMethod();
		Amazon.orderAndReturns();
		System.out.println("logout\n"+"your logout successfully");
	}
}
