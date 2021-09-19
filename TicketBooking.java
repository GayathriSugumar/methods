package methods;

public class TicketBooking {
	public static String chennaiExpress(int Trainno, String time) {
		return"Chennai Express Arrives at" +time+ "\nTrainno :"+Trainno;
	}
	public static String ticketBooking(String coach, int seatNumber,String seatType) {
		return "ticket booking is done\n"+coach+"your seat Number is :"+seatNumber+"\nseatType is "+seatType;
	}
	public static String timeDuration(String arrivalTime,String destinationTime) {
		return"Train Arrive at Thajavur juction:\n"+arrivalTime+"Train Arrive at Chennai junction:\n"+destinationTime;
	}
	public static void main(String[] args) {
		String ticketbooking=TicketBooking.chennaiExpress(450897, "10PM");
		System.out.println(ticketbooking);
		String seatType=TicketBooking.ticketBooking("A-1", 23, "sleeper");
		System.out.println(seatType);
	}

}
