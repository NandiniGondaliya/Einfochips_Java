<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Your Ticket</title>
<style type="text/css">
form {
  font-weight: bold;
  background-color:#ccff99;
 
}



input[type=submit] {
  background-color: #ff8080;
  border: none;
  border-radius: 5px;
  color: #fff;
  cursor: pointer;
  font-size: 18px;
  
  text-transform: uppercase;
  transition: background-color 0.2s ease-in-out;
}

input[type=submit]:hover {
  background-color:#ff4d4d;
}
h1{
color:darkgreen;
}

</style>
</head>
<body>
<h1>Book Your Ticket Here</h1>
<form action="insertticket">
Mobile Number:<input type="text" name="mobileNumber"><br><br>
Movie Name:<select name="movieName">
  <option value="vash">Vash</option>
  <option value="kgf">KGF</option>
  <option value="jab we met">Jab We Met</option>
  <option value="kick">Kick</option>
</select><br><br><br>
<input type="date" id="currentdate" name="bookingDate"hidden>
Show Date:<input type="date" id="date" name="showDate"></input><br><br><br>
Show Time:<select name="showTime">
  <option value="morning-10:00">morning-10:00</option>
  <option value="afternoon-14:30">afternoon-14:30</option>
  <option value="evening-18:00">evening-18:00</option>
  <option value="night-22:00">night-22:00</option>
</select><br><br><br>
Ticket Type<br>
<input type="radio" value="Economy Rs.150" name="seat_Type">Economy Rs.150<br>
<input type="radio" value="Platinum Rs.250" name="seat_Type">Platinum Rs.250<br><br>
Number Of Ticket:<input type="text" name="noOfSeats"><br><br>

<input type="submit" value="Check availability"><br><br>
Payment Type:<select id="movie" name="payment_Type">
  <option value=cash>cash</option>
  <option value="UPI">UPI</option>
  <option value="CARD">CARD</option>
</select><br><br><br>

<input type="submit" value="Book Now"><br><br>
</form>

<script>
var today = new Date().toISOString().split('T')[0];
var futureDate = new Date(new Date().getTime() + (5 * 24 * 60 * 60 * 1000)).toISOString().split('T')[0];
document.getElementById("date").setAttribute("min", today);
document.getElementById("date").setAttribute("max", futureDate);
document.getElementById("currentdate").value=today;

</script>


</body>
</html>