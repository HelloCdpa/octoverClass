package java1019;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		int Number, num1, num2;
		Scanner scan = new Scanner(System.in);

		System.out.println("1. ���� 2. ���� 3. ���ϱ� 4.������");
		Number = scan.nextInt();
		Calculator cal = new Calculator();
		switch (Number) {

		case 1:
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			cal.sum(num1, num2);

			break;

		case 2:
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			cal.subtraction(num1, num2);

			break;

		case 3:
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			int result = cal.multiplication(num1, num2);
			System.out.println(result);
			break;

		case 4:
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			int result2 = cal.division(num1, num2);
			System.out.println(result2);

			break;

		}

	}

}
