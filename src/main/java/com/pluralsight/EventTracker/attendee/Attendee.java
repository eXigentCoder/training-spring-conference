package com.pluralsight.EventTracker.attendee;

import com.pluralsight.EventTracker.view.Phone;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Attendee {

	@Size(min=2,max=30)
	private String name;

	@NotEmpty
	@Email
	private String emailAddress;

	@NotEmpty
	@Phone
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
