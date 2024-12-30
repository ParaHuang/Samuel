package day1;

import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//guessing game
		//generate a random number
		Random random = new Random();
//		int answer = random.nextInt();
//		int answer = random.nextInt(x);  //0 ~ x-1
		int answer = random.nextInt(1, 101);
//		System.out.println(answer);
		Scanner scnr = new Scanner(System.in);
//		for(;;) {//endless loop
//			System.out.println("guess what it is?");
//			int guess = scnr.nextInt();
//			//check the guess
//			if(guess < answer) {
//				System.out.println("too small");
//			}else if(guess > answer) {
//				System.out.println("too big");
//			}else {
//				System.out.println("congratulations, you guessed right");
//				break;//end a loop
//			}
//		}
		/*
		//while
		while(true) {//endless loop
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
		*/
		/*
		do{
			//xxxxxx
			
		}while(condition) ;
		*/
		

		int guess = -1;
		do{//endless loop
			System.out.println("guess what it is?");
			guess = scnr.nextInt();
			//check the guess
			if(guess < answer) {
				System.out.println("too small");
			}else if(guess > answer) {
				System.out.println("too big");
			}
		}while(guess!=answer);
		
		System.out.println("you guessed right!!");
		
		
		
		
		
		
		
		
	}

}
