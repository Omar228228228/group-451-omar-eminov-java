package classwork12;

import java.util.Scanner;

public class task {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Polojitelnoe");
		} else {
			System.out.println("Otricatelnoe ili nol");
		}
		//2
		int num2 = sc.nextInt();
		if (num2 % 2 == 0) {
			System.out.println("Chetnoe");
		} else {
			System.out.println("Nechetnoe");
		}
		//3
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a < b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		//4
		int age = sc.nextInt();
		if (age < 18) {
			System.out.println("Nesovershennoletniy");
		} else {
			System.out.println("Sovershennoletniy");
		}
		//5
		int score = sc.nextInt();
		if (score >= 90 && score <= 100) {
			System.out.println("Otlichno");
		} else if (score >= 70) {
			System.out.println("Horosho");
		} else if (score >= 50) {
			System.out.println("Udovletvoritelno");
		} else {
			System.out.println("Ne sdal");
		}

		//6
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		int max = x;

		if (y > max) {
			max = y;
		}

		if (z > max) {
			max = z;
		}

		System.out.println(max);

		//7
		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Visokosniy god");
		} else {
			System.out.println("Ne visokosniy");
		}

		//8
		sc.nextLine();
		int password = sc.nextInt();

		if (password==12345) {
			System.out.println("Dostup razreshen");
		} else {
			System.out.println("Neverniy parol");
		}
		//9
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		int op = sc.nextInt();
		if (op == '+') {
			System.out.println(n1 + n2);
		} else if (op == '-') {
			System.out.println(n1 - n2);
		} else if (op == '*') {
			System.out.println(n1 * n2);
		} else if (op == '/') {
			if (n2 != 0) {
				System.out.println(n1 / n2);
			} else {
				System.out.println("Delenie na nol nevozmojno");
			}
		} else {
			System.out.println("Oshibka");
		}
		//10
		int price = sc.nextInt();
		double discount = 0;
		if (price > 1000) {
			discount = price * 0.10;
		} else if (price > 500) {
			discount = price * 0.05;
		}
		double finalPrice = price - discount;
		System.out.println(discount);
		System.out.println(finalPrice);
		sc.close();
	}
}
