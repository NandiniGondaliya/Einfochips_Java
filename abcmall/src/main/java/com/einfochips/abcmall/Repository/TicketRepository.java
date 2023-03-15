package com.einfochips.abcmall.Repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.einfochips.abcmall.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{

	@Query("select SUM(t.noOfSeats) from Ticket t where t.movieName= :movieName AND t.showDate= :showDate AND t.showTime= :showTime AND t.seat_Type= :seat_Type")
	int countNoOfSeat(String movieName,LocalDate showDate,String showTime,String seat_Type);
	
}
