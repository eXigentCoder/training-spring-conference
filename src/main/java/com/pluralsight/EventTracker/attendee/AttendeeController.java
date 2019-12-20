package com.pluralsight.EventTracker.attendee;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class AttendeeController {
	@PreAuthorize("hasRole('USER')")
	@RequestMapping(value="/attendee", method = RequestMethod.GET)
	public String displayAttendeePage(Model model) {
		Attendee attendee = new Attendee();
		
		model.addAttribute("attendee", attendee);
		
		return "attendee";
	}

	@PreAuthorize("hasRole('USER') and hasPermission(#attendee, 'createAttendee')")
	@RequestMapping(value="/attendee", method = RequestMethod.POST)
	public String processAttendee(@Valid Attendee attendee, BindingResult bindingResult, Model model) {
		
		System.out.println(attendee);
		if(bindingResult.hasErrors()){
			return "attendee";
		}
		return "redirect:/";
		
	}
	
}
