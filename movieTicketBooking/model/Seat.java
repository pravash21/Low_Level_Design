package movieTicketBooking.model;

import movieTicketBooking.constants.SeatType;

public class Seat {
    private final Integer seatNumber;
    private final Integer price;
    private final SeatType seatType;

    public Seat(Integer seatNumber, Integer price, SeatType seatType) {
        this.seatNumber = seatNumber;
        this.price = price;
        this.seatType = seatType;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public SeatType getSeatType() {
        return seatType;
    }
}
