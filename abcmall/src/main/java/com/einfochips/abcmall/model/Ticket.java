package com.einfochips.abcmall.model;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ticketID;
	private String mobileNumber;
	private String movieName;
	private Date bookingDate;
	private LocalDate showDate;
	private String showTime;
	private int noOfSeats;
	private String seat_Type;
	private String payment_Type;
	public int getTicketID() {
		return ticketID;
	}
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public LocalDate getShowDate() {
		return showDate;
	}
	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getSeat_Type() {
		return seat_Type;
	}
	public void setSeat_Type(String seat_Type) {
		this.seat_Type = seat_Type;
	}
	public String getPayment_Type() {
		return payment_Type;
	}
	public void setPayment_Type(String payment_Type) {
		this.payment_Type = payment_Type;
	}
	public Ticket(int ticketID, String mobileNumber, String movieName, Date bookingDate, LocalDate showDate,
			String showTime, int noOfSeats, String seat_Type, String payment_Type) {
		super();
		this.ticketID = ticketID;
		this.mobileNumber = mobileNumber;
		this.movieName = movieName;
		this.bookingDate = bookingDate;
		this.showDate = showDate;
		this.showTime = showTime;
		this.noOfSeats = noOfSeats;
		this.seat_Type = seat_Type;
		this.payment_Type = payment_Type;
	}
	@Override
	public String toString() {
		return "Ticket [ticketID=" + ticketID + ", mobileNumber=" + mobileNumber + ", movieName=" + movieName
				+ ", bookingDate=" + bookingDate + ", showDate=" + showDate + ", showTime=" + showTime + ", noOfSeats="
				+ noOfSeats + ", seat_Type=" + seat_Type + ", payment_Type=" + payment_Type + "]";
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}