package methods;

public class JavaLogin {
	public static boolean logIn(String userName, String password) {
		boolean login;
		String name = "GAYATHRI";
		String pwd = "1210";
		if (userName == name && password == pwd) {
			System.out.println("Login successfull.");
			login = true;
		} else {
			System.out.println("Invalid username and password.");
			login = false;
		}
		return login;
	}

	public static void main(String[] args) {
		System.out.println(JavaLogin.logIn("GAYATHRI", "1210"));
	}
}
