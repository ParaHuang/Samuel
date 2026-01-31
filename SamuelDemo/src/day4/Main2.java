package day4;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		System.out.println("hello" == "hello");
		
		Scanner scanner = new Scanner(System.in);
		String msg = scanner.next();
		System.out.println("what saved in variable msg is "+msg);
		System.out.println("hello" == msg);
		System.out.println("hello".equals(msg));
		
	}
}
