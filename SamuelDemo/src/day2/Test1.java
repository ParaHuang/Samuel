package day2;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto.generated method stub
		//the loop can stop
		//1. we know how many times it's gonna execute
		// a. initial value
		// b. condition
		// c. increment
		/*
		for(a ; b ; c) {
			//d
		}
		//a .> b .> d .> c .> b .> d .> c .> b .> d .> c .> b(end the loop when condition is no longer be true)
		for(int i=1 ; i<=5 ; i++) {
			System.out.println(i);
		}
		*/
		/*
		int i=1 ;			//a
		while(i<=5) {		//b
			//operations	//d
			i++;			//c
		}
		*/
		//2. not sure how many times   .. while
		/*
		while(true) {
			//operations
			if(condition1) {
				break;
			}
		}*/
		
		/*
		while(condition2) {
			//operation
		}
		*/
		//condition1 is the opposite of condition2
		
		//Mike is going to open pet shop
		//he wants to buy some dogs and cats
		//the only condition is, he only need 5 cats, then he can open the shop
		Scanner scnr = new Scanner(System.in);
		int cats = 0;
		while(true) {
			System.out.println("what do you want to buy? 1.dog 2.cat");
			//choose 1/2
			int option1 = scnr.nextInt();//1
			if(option1 == 2) {
				cats++;
			}
			if(cats == 5) {
				break;
			}

		}
		
		

		while(cats != 5) {
			//operation
			System.out.println("what do you want to buy? 1.dog 2.cat");
			//choose 1/2
			int option1 = scnr.nextInt();//1
			if(option1 == 2) {
				cats++;
			}
		}
		
		System.out.println("now he can open the shop");
		
		
		
		
		
	}

}
