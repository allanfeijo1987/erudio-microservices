package br.com.erudio.converteres;

import br.com.erudio.validator.Validator;

public class Converter {
	public static double convertToDouble(String strNumber) {
		if (strNumber == null || strNumber.trim().isEmpty()) {
			return 0D;
		}
		String number = strNumber.replaceAll(",", ".");
		return Validator.isNumeric(number) ? Double.parseDouble(number) : 0D;
	}
}
