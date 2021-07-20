package br.com.erudio.validator;

public class Validator {

	public static boolean isNumeric(String strNumber) {
		if (strNumber == null || strNumber.trim().isEmpty()) {
			return false;
		}
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
