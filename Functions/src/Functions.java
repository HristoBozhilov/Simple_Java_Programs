import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("0. Exit.");
		System.out.println("1. Finding Perfect Numbers.");
		System.out.println("2. Finding SUM & AVG of a Sequence");
		System.out.println("Enter a number:");
		int func = input.nextInt();
		switch (func) {
		case 0:
			System.out.println("End of the program!!!");
			break;
		case 1:
			System.out.println("Enter start of the sequence: ");
			int start = input.nextInt();
			System.out.println("Enter end of the sequence: ");
			int end = input.nextInt();
			for (int i = start; i <= end; i++) {
				int sum = 0;
				for (int j = 1; j < i; j++) {
					if (i % j == 0)
						sum += j;
				}
				if (sum == i)
					System.out.print(i + " ");
			}
			break;
		case 2:
			System.out.println("Enter start of the sequence: ");
			int start_1 = input.nextInt();
			System.out.println("Enter end of the sequence: ");
			int end_1 = input.nextInt();
			double sum = 0;
			double average = 0;
			for (int i = start_1; i <= end_1; i++) {
				sum += i;
				average = sum / i;
			}
			System.out.println("The sum of the numbers from " + start_1 + " to " + end_1 + " is " + (int) sum);
			System.out.println("The average of the numbers from " + start_1 + " to " + end_1 + " is " + average);
			break;
		}

	}
}
