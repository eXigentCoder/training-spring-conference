package com.pluralsight.EventTracker.attendee;

import com.pluralsight.EventTracker.view.Phone;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public @Data class Attendee {

	@Size(min=2,max=30)
	private String name;

	@NotEmpty
	@Email
	private String emailAddress;

	@NotEmpty
	@Phone
	private String phone;
}
