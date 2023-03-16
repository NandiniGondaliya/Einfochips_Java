package com.einfochips.abcmall.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.einfochips.abcmall.Repository.TicketRepository;
import com.einfochips.abcmall.model.Ticket;

@Service
public class TicketService {

	@Autowired
	public TicketRepository Ticketrepo;
	
	public Integer getBookedSeats(String movieName,LocalDate showDate,String showTime,String seat_Type) {
		Integer bookedSeats=Ticketrepo.countNoOfSeat(movieName, showDate, showTime, seat_Type);
		return bookedSeats!=null ? bookedSeats:0;
	}
	
	public Ticket TicketBooking(@ModelAttribute Ticket ticket) {
		return Ticketrepo.save(ticket);
	}
}
