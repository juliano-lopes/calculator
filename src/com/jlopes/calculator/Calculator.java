package com.jlopes.calculator;



public class Calculator {

public double add(int i, int j) {
	
	return i + j;
}

public double divide(int i, int j) throws DividerIsZeroException {
	
	
	if(j==0){
		throw new DividerIsZeroException();
		
		
	}
		
	return i/j;
}

public double subtractTwoValues(int i, int j) {
	
	return i-j;
}

public boolean isPrimeNumber(int i) {
	if(i<=1){
		return false;
		
	}
	for(int j=2;j<i;j++){
		if((i%j)==0){
	
	return false;
	}
	}
	return true;
	

}

}
