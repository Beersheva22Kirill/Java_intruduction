package telran.text;

import java.util.Arrays;

public class Strings {
	/**
	 * 
	 * @param str
	 * @param anagram
	 * @return true if "str" anagram of "anagram"
	 */
	public static boolean isAnagram(String str , String anagram) {
		boolean res = true;
		char[] arrayCharStr = str.toCharArray();
		char[] arrayCharAnagram = anagram.toCharArray();
		int[] helper = new int [maxCharElement(arrayCharStr) + 1];
		
		if (arrayCharStr.length == arrayCharAnagram.length) {
			for (int i = 0; i < arrayCharStr.length; i++) {	
				helper[arrayCharStr[i]] += 1; 			
			}
			for (int i = 0; i < arrayCharAnagram.length; i++) {
				
				if (helper[(int)arrayCharAnagram[i]] > 0)  {
					helper[(int)arrayCharAnagram[i]]--;
				} else {
					res = false;
				}
			}
		} else {
			res = false;
		}
		
		return res;
		
	}
	/**
	 * 
	 * @param array
	 * @return max number value of array character
	 */
	public static int maxCharElement (char array[]) {
		int res = 0;
		for (int i = 0; i < array.length; i++) {
			if (res < (int)array[i]) {
				res = (int)array[i];
			}
		}		
		return res;
	}
	
	public static void sortStringNumbers (String[] arrayStr ) {
		
		int [] helper = new int [Byte.MAX_VALUE + (-Byte.MIN_VALUE) + 1];
		for (int i = 0; i < arrayStr.length; i++) {
			int index = (int) (Byte.parseByte(arrayStr[i]) + (-Byte.MIN_VALUE));
				helper[index] += 1;				
		}
		int i = 0;
		int indexForRes = 0;
		while(i < helper.length) {
			if (helper[i] != 0) {
				for (int j = 0; j < helper[i]; j++) {
					arrayStr[indexForRes ++] = Integer.toString(i - (-Byte.MIN_VALUE));
				}				
			}			
		i++;		
		}		
	}
	
	public static String javaNameExp() {
		return "([a-zA-Z$][\\w$]*|_[\\w$]+)";
	}
	
	public static String ipV4Octet() {

		return "([01]?[\\d]?[\\d]|2[0-4][\\d]|25[0-5])";
	}
	
	public static String ipV4() {
	
		String strRegExIP = ipV4Octet();
		for (int i = 0; i < 3; i++) {
			strRegExIP +="\\." + ipV4Octet();
		}		
		return strRegExIP;
	}
	
	public static String ipV4_v2() {
				
		return String.format("(%1$s\\.){3}%1$s", ipV4Octet());
	}
	
	public static String arithmeticExpression() {
		String operatorExp = operator();
		String operandExp = operand();
		String leftBrace = "(\\()*";
		String rightBrace = "(\\))*";

		return String.format("%3$s%1$s%4$s(%2$s%3$s%1$s%4$s)*", operandExp, operatorExp,leftBrace,rightBrace);
	}							
	public static String operand() {

		return "((\\d+\\.?\\d*|\\.\\d+)" + "|" + javaNameExp() + ")";
	}
	
	public static String number() {

		return "(\\d+\\.?\\d*|\\.\\d+)";
	}
	
	private static String operator() {
		
		return "([-+*/])";
	}
	
	public static boolean isArithmeticExpression(String expression) {
		expression = expression.replaceAll("\\s+", "");
		
		return expression.matches(arithmeticExpression());
	}
	/**
	 * 
	 * @param expression
	 * @param values
	 * @param namesSorted - variable names sorted
	 * @return comuted value of a given expression or Double.NaN
	 */
	public static Double computeArithmeticExpression(String expression, 
			double[] values, String[] names) {
		// 10 (* 2)
		//10 * 2 (())
		Double res = Double.NaN;
		if (isArithmeticExpression(expression) && checkBraces(expression)) {
			expression = expression.replaceAll("[\\s()]+" , "");
			String[] operands = expression.split(operator());
			String[] operators = expression.split(operand());
			res = getOperandValue(operands[0], values, names);
			int index = 1;
			while(index < operands.length && !res.isNaN()) {
				double operandValue = getOperandValue(operands[index], values, names);
				res = computeOperation(res, operandValue, operators[index]);
				index++;
			}		
		}
		return res;
	}
	
	private static Double computeOperation(Double operand1, double operand2, String operatorStr) {
		Double res = Double.NaN;
		if (!Double.isNaN(operand2)) {
			switch(operatorStr) {
			case "+" : res = operand1 + operand2; break;
			case "-" : res = operand1 - operand2; break;
			case "*" : res = operand1 * operand2; break;
			case "/" : res = operand1 / operand2; break;
			default: res = Double.NaN;
			}
		}
		return res;
	}
	private static Double getOperandValue(String operand, double[] values, String[] names) {

		String value = "";
		String name = "";
		int index = -1;
		double operandValue = Double.NaN;
		if (values != null && names != null) {
			index = Arrays.binarySearch(names, operand);
			
			if (index > -1) {
				operandValue = values[index];
			} else if (operand.matches(number())) {
				operandValue = Double.parseDouble(operand);
			} 
		} else if (operand.matches(number())) {
			operandValue = Double.parseDouble(operand);
		}				
		return operandValue;
	}
	/**
	 * 
	 * @param expression
	 * @return true if counter the braces = 0;
	 */
	public static boolean checkBraces(String expression) {
		int counter = 0;
		char[] array = expression.toCharArray();
	
		for (int i = 0; i < array.length; i++) {
			switch(array[i]) {
			case '(' : counter++; break;
			case ')' : counter--; break;
			}
			if (counter < 0) {
				break;
				}
		}		
		return counter == 0 ? true : false;
	}
	
	
}
