package com.Roomy.Util;

public class Response {

	public Response(int statusCode, String statusMessage, String customerToken, Object result) {
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
		this.customerToken = customerToken;
		this.result = result;
	}

	private int statusCode;
	private String statusMessage;
	private Object result;
	private String customerToken;

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getCustomerToken() {
		return customerToken;
	}

	public void setCustomerToken(String customerToken) {
		this.customerToken = customerToken;
	}

}
