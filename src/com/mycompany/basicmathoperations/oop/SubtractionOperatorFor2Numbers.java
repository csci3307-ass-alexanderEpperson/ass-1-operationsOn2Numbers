package com.mycompany.basicmathoperations.oop;

public class SubtractionOperatorFor2Numbers extends OperatorFor2numbers implements Subtract {

	public SubtractionOperatorFor2Numbers(float _number1, float number2) {
		super(_number1, number2);
	}

	public SubtractionOperatorFor2Numbers() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.basicmathoperations.oop.Divide#divide(int, int)
	 */
	@Override
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.basicmathoperations.oop.Divide#divide(float, float)
	 */
	@Override
	public float subtract(float num1, float num2) {
		return num1 - num2;
	}

	@Override
	public float subtract2numbers() {
		return number1 / number2;
	}
	}


