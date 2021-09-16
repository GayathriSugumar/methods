package methods;

public class ArrayLength {

	
		public static int length(int array[]) {
			return array.length;
		}

		public static void main(String[] args) {

			int numbers[] = {3,6,9,12,21,11,10,98};

			int lenghtOfArray = ArrayLength.length(numbers);

			System.out.println("The length of array is " + lenghtOfArray);
		}
}
