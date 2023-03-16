package com.einfochips.abcmall.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.abcmall.Repository.TicketRepository;
import com.einfochips.abcmall.model.Ticket;
import com.einfochips.abcmall.service.TicketService;

@RestController
public class MallController {

	@Autowired
	private TicketService ticketservice;
	@RequestMapping("/")
	public ModelAndView getHome()
	{
		
		return new ModelAndView("home");
	}
	
	@RequestMapping("insertticket")
	public ModelAndView bookTicket(@RequestParam int noOfSeats,@RequestParam String movieName,@RequestParam LocalDate showDate,@RequestParam String showTime,@RequestParam String seat_Type,@ModelAttribute Ticket ticket) {
		ModelAndView mv = new ModelAndView("success");
		
		int seatcount=ticketservice.getBookedSeats(movieName, showDate, showTime, seat_Type);
		
		if(seat_Type.equalsIgnoreCase("Economy Rs.150")) {
			
			int seatpresent1=300-seatcount;
			int amount=150*noOfSeats;
			
			if(noOfSeats>seatpresent1) {
				mv.addObject("error","Seat not Available");
			}
			else 
			{
				ticketservice.TicketBooking(ticket);
				mv.addObject("booked","Thanks for Booking");
				mv.addObject("noofseat","You have booked"+ noOfSeats);
				mv.addObject("Bookticket","You have paid"+amount);
			}
			
		}
		if(seat_Type.equalsIgnoreCase("Platinum Rs.250")) {
			int seatpresent2=100-noOfSeats;
			int amount=250*seatcount;
			if(noOfSeats>seatpresent2) {
				mv.addObject("error","Seat not Available");
				return mv;
			}
			else {
				ticketservice.TicketBooking(ticket);
				mv.addObject("booked","Thanks for Booking");
				mv.addObject("noofseat","You have Booked "+noOfSeats);
				mv.addObject("Bookticket","You have paid "+amount);
			}
		}
		
		
		return mv;
		
	}
	

	
	
	
	
	
}
