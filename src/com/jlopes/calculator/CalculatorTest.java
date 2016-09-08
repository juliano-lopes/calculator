package com.jlopes.calculator;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CalculatorTest {
	
	 // ler test unit�rio 
	 // ler sobre TDD
	 // fatorar
	 // raiz quadrada
	 // numero primo
	 // subtracao
	 // exponencial

	
	
	
@Test
public void shouldSumTwoValues(){
	Calculator calculator = new Calculator();
	 double result = calculator.add(5,2);
	 assertThat(result, is(7.0));
}

@Test
public void shouldDivideTwoValues() throws DividerIsZeroException{
	Calculator calculator = new Calculator();
	 double result = calculator.divide(8,2);
	 assertThat(result, is(4.0));
}

@Test(expected=DividerIsZeroException.class)
public void dividerShouldNotBeZero() throws DividerIsZeroException{
	Calculator calculator = new Calculator();
	 calculator.divide(10,0);

}
@Test
public void shouldSubtractTwoValues(){
	Calculator calculator = new Calculator();
	 double result = calculator.subtractTwoValues(2,8);
	 assertThat(result, is(-6.0));
	
	
}

@Test
public void shouldReturnTrueForPrimeNumber(){
	Calculator calculator = new Calculator();
	boolean result = calculator.isPrimeNumber(73);
	assertThat(result, is(true));
	
	
}

@Test
public void shouldReturnFalseIfNotPrimeNumber(){
	Calculator calculator = new Calculator();
	boolean result = calculator.isPrimeNumber(10);
	assertThat(result, is(false));
	
	
}


@Test
public void shouldReturnFalseIfNumberLessThanTwo(){
	Calculator calculator = new Calculator();
	boolean result = calculator.isPrimeNumber(-7);
	assertThat(result, is(false));
	
	
}

@Test
public void shouldReturnStringWithNumbersThatFactorizeTheNumberGiven(){
	Calculator calculator = new Calculator();
	String result = calculator.refactorize(24);
	assertThat(result, is("2 2 2 3"));
}
@Test
public void shouldReturnEmptyString(){
	Calculator calculator = new Calculator();
	String result = calculator.refactorize(1);
	assertThat(result, is(""));
}
@Test
public void shouldReturnTheSquareRoot(){
	Calculator calculator = new Calculator();
	double result = calculator.squareRoot(25);
	assertThat(result, is(5.0));
}
@Test(expected=SquareRootShouldNotBeNegativeNumberException.class)
public void dividerShouldNotBeNegativeNumber() throws DividerIsZeroException{
	Calculator calculator = new Calculator();
	 calculator.squareRoot(-25);

}
@Test
public void shouldReturnProductNumberToThePowerOf(){
	Calculator calculator = new Calculator();
	double result = calculator.power(5,2);
	assertThat(result, is(25.0));
	
}




}

