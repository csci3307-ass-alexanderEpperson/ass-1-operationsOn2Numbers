/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author green
 *
 */
public class DivideOperatorFor2numbers extends OperatorFor2numbers implements Divide {

	public DivideOperatorFor2numbers(float _number1, float number2) {
		super(_number1, number2);
	}

	public DivideOperatorFor2numbers() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.basicmathoperations.oop.Divide#divide(int, int)
	 */
	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mycompany.basicmathoperations.oop.Divide#divide(float, float)
	 */
	@Override
	public float divide(float num1, float num2) {
		return num1 / num2;
	}

	@Override
	public float divide2numbers() {
		return number1 / number2;
	}

}
