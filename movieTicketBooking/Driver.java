package movieTicketBooking;

import movieTicketBooking.dao.MovieTicketBookingDao;
import movieTicketBooking.model.Booking;
import movieTicketBooking.model.City;

public class Driver {
    public static void main(String args[]) {
        MovieTicketBookingDao movieTicketBookingDao = new MovieTicketBookingDao();
        movieTicketBookingDao.addCity("Mumbai", 33.66, 77.55);
        movieTicketBookingDao.addCinema(movieTicketBookingDao.getCinemaIdToCinemaMap().get("Mumbai").getCinemaId(), "INOX", "MG Road");
        movieTicketBookingDao.addHall(movieTicketBookingDao.getCinemaIdToCinemaMap().get("Mumbai").getCinemaId());
    }
}


