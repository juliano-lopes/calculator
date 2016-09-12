package com.jlopes.calculator;

public class Calculator {

	public double addition(int number1, int number2) {
		return number1 + number2;
	}

	public double divide(int numberToBeDivided, int divider)
			throws DividerIsZeroException {
		if (divider == 0) {
			throw new DividerIsZeroException();
		}
		return numberToBeDivided / divider;
	}

	public double subtractTwoValues(int number1, int number2) {
		return number1 - number2;
	}

	public boolean isPrimeNumber(int number) {
		if (number <= 1) {
			return false;
		}
		for (int counter = 2; counter < number; counter++) {
			if (remainderAfterDivisionIsZero(number, counter)) {
				return false;
			}
		}
		return true;
	}

	public String refactorize(int numberToFactorize) {
		String result = "";
		int refNumberToFactorize = numberToFactorize;
		boolean ready = false;
		int counter = 2;
		if (numberToFactorize < 2) {
			return "";
		}
		while (!ready) {
			if (remainderAfterDivisionIsZero(refNumberToFactorize, counter)) {
				refNumberToFactorize /= counter;
				result += counter + " ";
			} else {
				counter++;
			}
			if ((refNumberToFactorize == 1) || (counter > numberToFactorize)) {
				ready = true;
			}
		}
		if (refNumberToFactorize == 1) {
			return result.trim();
		} else {
			return "";
		}
	}

	public double squareRoot(int numberToSquareRoot) {
		if (numberToSquareRoot < 0) {
			throw new SquareRootShouldNotBeNegativeNumberException();
		}
		return Math.sqrt(numberToSquareRoot);
	}

	public double power(int base, int exponent) {
		return Math.pow(base, exponent);
	}

	private boolean remainderAfterDivisionIsZero(int numberToBeDivided,
			int divider) {
		if ((numberToBeDivided % divider) == 0) {
			return true;
		} else {
			return false;
		}

	}

}