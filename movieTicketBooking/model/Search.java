package movieTicketBooking.model;

import java.util.List;

public interface Search {
    public List<Movie> searchByTitle(String title);
    public List<Movie> searchByLanguage(String language);
    public List<Movie> searchByGenre(String genre);
    public List<Movie> searchByCity(String cityName);
}
