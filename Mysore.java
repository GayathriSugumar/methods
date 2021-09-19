package methods;

public class Mysore {
	public static String electricitybill(String custId,int amount) {
		String confirmMessage="Electricity paid successfull for customer "+amount;
		return confirmMessage;
	}
	public static String updateName(long adharNumber,String nameToBeUpdated) {
		return"Name updated successfully!!!!to " +nameToBeUpdated;
	}
	
	public static void main(String[] args) {
		String updateName=Mysore.updateName(432167895432l, "Gayathri");
		System.out.println(updateName);
		String confirmMessage=Mysore.electricitybill("g", 550);
		System.out.println(confirmMessage);
	}

}
