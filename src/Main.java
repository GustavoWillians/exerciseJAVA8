import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write a number");
		
		int number = sc.nextInt();
		
		if (number % number == 0) {
			System.out.println("The number ir even");
		}
		else {
			System.out.println("The number is odd");
		}

	}

}
