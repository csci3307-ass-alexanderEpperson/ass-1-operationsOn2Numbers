package com.mycompany.basicmathoperations.oop;

public class AdditionOperatorFor2Numbers extends OperatorFor2numbers implements Add {

	public AdditionOperatorFor2Numbers(float _number1, float number2) {
		super(_number1, number2);
	}

	public AdditionOperatorFor2Numbers() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.basicmathoperations.oop.Divide#divide(int, int)
	 */
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.basicmathoperations.oop.Divide#divide(float, float)
	 */
	@Override
	public float add(float num1, float num2) {
		return num1 + num2;
	}

	@Override
	public float add2numbers() {
		return number1 + number2;
	}

}
