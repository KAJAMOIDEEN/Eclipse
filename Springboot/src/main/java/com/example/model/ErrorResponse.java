package com.example.model;

import java.time.LocalDateTime;

public class ErrorResponse {
	private LocalDateTime DateTimeStamp;
	private String errorMessage;
	private String errorDetails;

	public ErrorResponse(LocalDateTime dateTimeStamp, String errorMessage, String errorDetails) {
		super();
		DateTimeStamp = dateTimeStamp;
		this.errorMessage = errorMessage;
		this.errorDetails = errorDetails;
	}

	public LocalDateTime getDateTimeStamp() {
		return DateTimeStamp;
	}

	public void setDateTimeStamp(LocalDateTime dateTimeStamp) {
		DateTimeStamp = dateTimeStamp;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}
}
