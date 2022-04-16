package piotr.CinemaApp.repository.entities.dtos;


import lombok.Data;
import piotr.CinemaApp.repository.entities.Hall;
import piotr.CinemaApp.repository.entities.Movie;
import java.time.LocalDate;
public class ScreeningResponse {




@Data
    public class Screening {

        private LocalDate screeningStart;
        private Movie movie;
        private Hall hall;
    }
}
