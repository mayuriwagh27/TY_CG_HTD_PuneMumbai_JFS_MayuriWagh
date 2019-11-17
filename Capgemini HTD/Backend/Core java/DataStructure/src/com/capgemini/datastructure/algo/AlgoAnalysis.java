package com.capgemini.datastructure.algo;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {

	public static void main(String[] args) {
		countTwo();
		countOne();
	}

	public static long addUpto(Long number) {
		long total = 0L;
		for (long i = 0; i <= number; i++) {
			total = total + i;
		}
		return total;
	}// End of addUpto()

	public static long addUptoQuick(Long number) {
		return number * (number + 1) / 2;
	}// End of addUptoQuick()

	public static void countOne() {
		long number = 999999999L;
		Instant strat = Instant.now();
		System.out.println("addUpto: " + addUpto(number));
		Instant end = Instant.now();
		long duration = Duration.between(strat, end).toMillis();
		double seconds = duration / 1000.0;
		System.out.println("addUpto : " + seconds + "seconds");
	}// End of countOne()

	public static void countTwo() {
		long number = 999999999L;
		Instant strat = Instant.now();
		System.out.println("addUptoQuick: " + addUptoQuick(number));
		Instant end = Instant.now();
		long duration = Duration.between(strat, end).toMillis();
		double seconds = duration / 1000.0;
		System.out.println("addUptoQuick: " + seconds + "seconds");
	}// End of countOne()
}// End of class
