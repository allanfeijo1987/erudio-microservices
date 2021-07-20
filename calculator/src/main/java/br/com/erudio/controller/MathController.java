package br.com.erudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.converteres.Converter;
import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.math.SimpleMath;
import br.com.erudio.validator.Validator;

@RestController
public class MathController {

	@Autowired
	private SimpleMath math;

	@RequestMapping(method = RequestMethod.GET, value = "/soma/{number1}/{number2}")
	public Double soma(@PathVariable(value = "number1") String number1, @PathVariable(value = "number2") String number2)
			throws UnsuportedMathOperationException {
		if (!Validator.isNumeric(number1) || !Validator.isNumeric(number2)) {
			throw new UnsuportedMathOperationException("Informar valores numéricos!");
		}
		return math.soma(Converter.convertToDouble(number1), Converter.convertToDouble(number2));
	}

	@RequestMapping(method = RequestMethod.GET, value = "/subtracao/{number1}/{number2}")
	public Double subtracao(@PathVariable(value = "number1") String number1,
			@PathVariable(value = "number2") String number2) throws UnsuportedMathOperationException {
		if (!Validator.isNumeric(number1) || !Validator.isNumeric(number2)) {
			throw new UnsuportedMathOperationException("Informar valores numéricos!");
		}
		return math.subtracao(Converter.convertToDouble(number1), Converter.convertToDouble(number2));
	}

	@RequestMapping(method = RequestMethod.GET, value = "/multiplicacao/{number1}/{number2}")
	public Double multiplicacao(@PathVariable(value = "number1") String number1,
			@PathVariable(value = "number2") String number2) throws UnsuportedMathOperationException {
		if (!Validator.isNumeric(number1) || !Validator.isNumeric(number2)) {
			throw new UnsuportedMathOperationException("Informar valores numéricos!");
		}
		return math.multiplicacao(Converter.convertToDouble(number1), Converter.convertToDouble(number2));
	}

	@RequestMapping(method = RequestMethod.GET, value = "/divisao/{number1}/{number2}")
	public Double divisao(@PathVariable(value = "number1") String number1,
			@PathVariable(value = "number2") String number2) throws UnsuportedMathOperationException {
		if (!Validator.isNumeric(number1) || !Validator.isNumeric(number2)) {
			throw new UnsuportedMathOperationException("Informar valores numéricos!");
		}
		return math.divisao(Converter.convertToDouble(number1), Converter.convertToDouble(number2));
	}

	@RequestMapping(method = RequestMethod.GET, value = "/media/{number1}/{number2}")
	public Double media(@PathVariable(value = "number1") String number1,
			@PathVariable(value = "number2") String number2) {
		if (!Validator.isNumeric(number1) || !Validator.isNumeric(number2)) {
			throw new UnsuportedMathOperationException("Informar valores numéricos!");
		}
		return math.media(Converter.convertToDouble(number1), Converter.convertToDouble(number2));
	}

	@RequestMapping(method = RequestMethod.GET, value = "/raizquadrada/{number}")
	public Double raizQuadrada(@PathVariable(value = "number") String number) {
		if (!Validator.isNumeric(number)) {
			throw new UnsuportedMathOperationException("Informar valor numérico!");
		}
		return math.raizQuadrada(Converter.convertToDouble(number));
	}

}
