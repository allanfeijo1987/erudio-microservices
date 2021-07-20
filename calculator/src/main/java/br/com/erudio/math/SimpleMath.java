package br.com.erudio.math;

import org.springframework.stereotype.Service;

@Service
public class SimpleMath {

	public double soma(Double number1, Double number2) {
		return number1 + number2;
	}

	public double subtracao(Double number1, Double number2) {
		return number1 - number2;
	}

	public double multiplicacao(Double number1, Double number2) {
		return number1 * number2;
	}

	public double divisao(Double number1, Double number2) {
		return number1 / number2;
	}

	public double media(Double number1, Double number2) {
		return (number1 + number2) / 2;
	}

	public double raizQuadrada(Double number) {
		return Math.sqrt(number);
	}
}
