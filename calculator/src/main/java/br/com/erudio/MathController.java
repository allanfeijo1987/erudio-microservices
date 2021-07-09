package br.com.erudio;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsuportedMathOperationException;

@RestController
public class MathController {

	@RequestMapping(method = RequestMethod.GET, value = "/sum/{number1}/{number2}")
	public Double sum(@PathVariable(value = "number1") String number1, @PathVariable(value = "number2") String number2)
			throws UnsuportedMathOperationException {
		if (!isNumeric(number1) || !isNumeric(number2)) {
			throw new UnsuportedMathOperationException("Informar valores numéricos!");
		}
		return convertToDouble(number1) + convertToDouble(number2);
	}

	private double convertToDouble(String strNumber) {
		if (strNumber == null || strNumber.trim().isEmpty()) {
			return 0D;
		}
		String number = strNumber.replaceAll(",", ".");
		return isNumeric(number) ? Double.parseDouble(number) : 0D;
	}

	private boolean isNumeric(String strNumber) {
		if (strNumber == null || strNumber.trim().isEmpty()) {
			return false;
		}
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
