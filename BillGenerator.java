package methods;

public class BillGenerator {
	public static int calculateBillAmount(int price, int quantity) {
		int totalBillAmount = price * quantity;
		return totalBillAmount;
	}

	public static void main(String[] args) {

		int price = 45;
		int quantity = 50;
		int totalAmount;
		totalAmount = BillGenerator.calculateBillAmount(price, quantity);

		System.out.println(totalAmount);
	}
}
