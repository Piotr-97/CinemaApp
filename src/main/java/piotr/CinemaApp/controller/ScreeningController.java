package piotr.CinemaApp.controller;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import piotr.CinemaApp.repository.entities.Screening;
import piotr.CinemaApp.repository.entities.dtos.ScreeningResponse;
import piotr.CinemaApp.repository.entities.repository.ScreeningRepository;
import piotr.CinemaApp.service.ScreeningService;

import java.util.List;


@RestController
@AllArgsConstructor
public class ScreeningController {

    private ScreeningService screeningService;
    private ScreeningRepository screeningRepository;
    private ModelMapper modelMapper;

    @GetMapping("/screenings")
    public List<ScreeningResponse> getAllScreening(){
      return screeningService.getAllscreenings();
    }
}
