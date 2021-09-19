package methods;

public class PMUResult {
	public static double result(String USN) {
		return 9.04;
	}

	public static void main(String[] args) {
		double pmuResult = PMUResult.result("1190452188");
		System.out.println(pmuResult);
	}

}
