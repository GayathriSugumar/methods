package methods;

public class Phonepe {
	
	public static String checkBalance(int pwd,int amount) {
		return "Your Account balance is :"+pwd;
	}
	public static String mobileRecharge(long mobileNumber,String network) {
		return "mobile recharge successfully "+mobileNumber;
	}
	public static String educationFees(String name,int amount) {
		return"Fees paid successfully "+amount;
	}
	public static String broadBrand(int amount) {
		return"your Airtel Broadbrand recharge successfully "+amount;
	}
	public static String creditCardBill(int amount) {
		return"Bill paid"+amount;
	}
	public static String lic(String name,int amount,int licNo) {
		return"your policy number :"+licNo+" due was paid successfully "+name;
	}
	public static void main(String[] args) {
		String balanceCheck=Phonepe.checkBalance(1234,5000);
		System.out.println( balanceCheck);
		String collagefees=Phonepe.educationFees("Gayathri",22000);
		System.out.println(collagefees);
		String lic=Phonepe.lic("Vijaya", 500, 1203);
		System.out.println(lic);
	}

}
