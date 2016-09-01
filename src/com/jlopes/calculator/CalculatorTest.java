package com.jlopes.calculator;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CalculatorTest {
	
	 // ler test unitário 
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



}

