package piotr.CinemaApp.service;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import piotr.CinemaApp.repository.entities.Screening;
import piotr.CinemaApp.repository.entities.dtos.ScreeningResponse;
import piotr.CinemaApp.repository.entities.repository.ScreeningRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor

public class ScreeningService {

    private final ScreeningRepository screeningRepository;
    private final ModelMapper modelMapper;


    public List<ScreeningResponse> getAllscreenings(){
        List<Screening> screenings = screeningRepository.findAll();

        List<ScreeningResponse> result = new ArrayList<>();
        for (Screening screening : screenings) {
            ScreeningResponse screeningResponse = modelMapper.map(screening, ScreeningResponse.class);
            result.add(screeningResponse);
        }
        return result;
    }


}
