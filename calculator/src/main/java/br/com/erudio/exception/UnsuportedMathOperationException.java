package br.com.erudio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationException extends RuntimeException{

	private static final long serialVersionUID = -3924395697786151751L;
	
	public UnsuportedMathOperationException(String message) {
		super(message);
	}

}
