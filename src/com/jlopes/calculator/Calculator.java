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

	public String refactorize(int i) {
		String result = "";
		String resultError = "nao fatoravel";
		int aux = i;
		boolean ready = false;
		int j = 2;
		if (i < 2) {
			return resultError;
		}
		while (!ready) {

			if (isPrimeNumber(j)) {
				if ((aux % j) == 0) {
					aux /= j;
					result += j+" ";

				} else {
					j++;

				}

			}

			if ((aux == 1) || (j > i)) {

				ready = true;
			}

		}
		if (aux == 1) {
			return result.trim();

		}
		if (j > i) {

			return resultError;

		}

		return "";
	}

}
