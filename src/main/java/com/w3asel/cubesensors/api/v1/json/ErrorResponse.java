package com.w3asel.cubesensors.api.v1.json;

import java.util.List;

/**
 * Class to parse out the elements in the error response and print them.
 *
 * @author Joe
 */
public class ErrorResponse {
	public boolean ok;
	public int code;
	public List<String> errors;

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Error ").append(code).append(": ");
		for (final String error : errors) {
			sb.append("\n\t").append(error);
		}
		return sb.toString();
	}
}
