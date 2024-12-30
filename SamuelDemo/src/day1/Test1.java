package day1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//guessing game
		int answer = 45;
		Scanner scnr = new Scanner(System.in);
		for(;;) {//endless loop
			System.out.println("guess what it is?");
			int guess = scnr.nextInt();
			//check the guess
			if(guess < answer) {
				System.out.println("too small");
			}else if(guess > answer) {
				System.out.println("too big");
			}else {
				System.out.println("congratulations, you guessed right");
				break;//end a loop
			}
		}
		
		//while
	}

}
