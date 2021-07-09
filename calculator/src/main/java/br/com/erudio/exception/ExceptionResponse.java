package br.com.erudio.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = -6298672019176170456L;

	private int code;
	private Date timestamp;
	private String message;
	private String details;

	public ExceptionResponse(int code, Date timestamp, String message, String details) {
		this.code = code;
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public int getCode() {
		return code;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}
