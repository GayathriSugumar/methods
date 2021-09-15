package array;

public class Ac {
	
	public static void on() {
		System.out.println("Ac is on");	
	}
	public static void off() {
		System.out.println("Ac is off");	
	}
	public static void increaseTemperature() {
		System.out.println("Ac Temperature is increase ");	
	}
	public static void deccreaseTemperature() {
		System.out.println("Ac Temperature is decrease ");	
	}
	public static void main(String[] args) {
		System.out.println("switch on AC");
		Ac.on();
		Ac.off();
		Ac.increaseTemperature();
		Ac.deccreaseTemperature();
		System.out.println("Switch off AC");
	}

}
