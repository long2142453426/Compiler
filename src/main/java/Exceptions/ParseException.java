package Exceptions;

import java.util.List;

/** Exception class wrapping a list of error messages. */
public class ParseException extends Exception {


	public ParseException(List<String> messages) {
		super(messages.toString());
	}




}