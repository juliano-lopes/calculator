package com.jlopes.calculator;

public class Calculator {

	public double add(int i, int j) {

		return i + j;
	}

	public double divide(int i, int j) throws DividerIsZeroException {

		if (j == 0) {
			throw new DividerIsZeroException();

		}

		return i / j;
	}

	public double subtractTwoValues(int i, int j) {

		return i - j;
	}

	public boolean isPrimeNumber(int i) {
		if (i <= 1) {
			return false;

		}
		for (int j = 2; j < i; j++) {
			if ((i % j) == 0) {

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
if ((refNumberToFactorize % counter) == 0) {
					refNumberToFactorize /= counter;
					result += counter+" ";

				} else {
					counter++;

				}

if ((refNumberToFactorize == 1) || (counter > numberToFactorize)) {
ready = true;
			}
}
		if (refNumberToFactorize == 1) {
			return result.trim();
}
		else{
return "";
		}
}

	public double squareRoot(int numberToSquareRoot) {
		if(numberToSquareRoot<0){
			throw new SquareRootShouldNotBeNegativeNumberException();
		}
		double result = Math.sqrt(numberToSquareRoot);
		
		
		return result;
	}

}
