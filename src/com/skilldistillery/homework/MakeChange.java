package com.skilldistillery.homework;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double itemPrice;
		double tenderedAmt;
		double differenceAmt;
		int numOnes = 0;
		int numFives = 0;
		int numTens = 0;
		int numTwentys = 0;
		int numQuarters = 0;
		int numDimes = 0;
		int numNickels = 0;
		int numPennies = 0;

		System.out.print("Please enter the price of the item: $");
		itemPrice = kb.nextDouble();

		System.out.print("Enter the amount paid: $");
		tenderedAmt = kb.nextDouble();

		if (tenderedAmt < itemPrice) {
			System.out.println("Error insufficent amount paid.");
		} else if (tenderedAmt == itemPrice) {
			System.out.println("No change due");
		} else if (tenderedAmt > itemPrice) {
			differenceAmt = tenderedAmt - itemPrice;
			differenceAmt = Math.round(differenceAmt * 100.0)/100.0;
			System.out.println("Change due: $"+differenceAmt+"\n");
			while (differenceAmt >= 0.009) {
//				System.out.println("TOP Difference: $" + differenceAmt);
				if (differenceAmt >= 20) {
					differenceAmt = differenceAmt - 20.0;
					numTwentys++;
//					System.out.println("$20: " + differenceAmt);
				} else if (differenceAmt >= 10) {
					differenceAmt = differenceAmt - 10.0;
					numTens++;
//					System.out.println("$10: " + differenceAmt);
				} else if (differenceAmt >= 5) {
					differenceAmt = differenceAmt - 5.0;
					numFives++;
//					System.out.println("$5: " + differenceAmt);
				} else if (differenceAmt >= 1) {
					differenceAmt = differenceAmt - 1.0;
					numOnes++;
//					System.out.println("$1: " + differenceAmt);
				} else if (differenceAmt >= 0.25) {
					differenceAmt = differenceAmt - 0.25;
					numQuarters++;
//					System.out.println("$0.25: "+ differenceAmt);
				} else if (differenceAmt >= 0.10) {
					differenceAmt = differenceAmt - 0.10;
					numDimes++;
//					System.out.println("$0.10: "+ differenceAmt);
				} else if (differenceAmt >= 0.05) {
					differenceAmt = differenceAmt - 0.05;
					numNickels++;
//					System.out.println("$0.05: "+ differenceAmt);
				} else if (differenceAmt >= 0.009) {
					differenceAmt = differenceAmt - 0.01;
					numPennies++;
//					System.out.println("$0.01: "+ differenceAmt);
				}
//				System.out.println("Bottom Difference: " + differenceAmt);
			}
			printAmount(numTwentys,numTens,numFives,numOnes,numQuarters,numDimes,numNickels,numPennies);
//			System.out.println("#20: " + numTwentys + " #10: " + numTens + " #5: " + numFives + " #1: " + numOnes);
//			System.out.println("#.25: " + numQuarters + " #.10: " + numDimes + " #.5: " + numNickels + " #.01: " + numPennies);
		}

		kb.close();

	}
	
	public static void printAmount(int numTwentys, int numTens, int numFives, int numOnes, int numQuarters, int numDimes, int numNickels, int numPennies) {
		if (numTwentys > 0) {
			System.out.println(numTwentys+" twenty dollar bill");
		}
		if (numTens > 0) {
			System.out.println(numTens+" ten dollar bill");
		}
		if (numFives > 0) {
			System.out.println(numFives+" five dollar bill");
		}
		if (numOnes > 0) {
			System.out.println(numOnes+" one dollar bill");
		}
		if (numQuarters > 0) {
			System.out.println(numQuarters+" quarter(s)");
		}
		if (numDimes > 0) {
			System.out.println(numDimes+" dime(s)");
		}
		if (numNickels > 0) {
			System.out.println(numNickels+" nickel(s)");
		}
		if (numPennies > 0) {
			System.out.println(numPennies+" penny(s)");
		}
	}

}
