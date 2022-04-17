package piotr.CinemaApp.repository.entities.dtos;


import lombok.Data;
import piotr.CinemaApp.repository.entities.Hall;
import piotr.CinemaApp.repository.entities.Movie;
import java.time.LocalTime;

@Data
public class ScreeningResponse {

    private LocalTime screeningStart;
    private Movie movie;
    private Hall hall;
    }

