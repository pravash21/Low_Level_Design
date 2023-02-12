package movieTicketBooking.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cinema {
    private final String cinemaId;
    private final String name;
    private final String address;
    private final List<Hall> hallList;

    public Cinema(String name, String address) {
        this.cinemaId = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
        this.hallList = new ArrayList<>();
    }

    public String getCinemaId() {
        return cinemaId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void addHall(Hall hall) {
        this.hallList.add(hall);
    }

    public List<Hall> getHallList() {
        return hallList;
    }
}
