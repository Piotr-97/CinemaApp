package piotr.CinemaApp.repository.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import piotr.CinemaApp.repository.entities.Screening;

import java.time.LocalTime;
import java.util.List;

@Repository
public interface ScreeningRepository extends JpaRepository<Screening,Long> {

    @Query(nativeQuery = true, value = "select screening.id,screening_Start, hall_id, movie from screening Join movie on screening.movie = movie.id Join  hall on screening.hall_id = hall.id Order by Screening_start asc")
    List<Screening> getAllScreeningOrderedByStart();

    @Query(nativeQuery = true, value = "select screening.id,screening_Start, hall_id, movie from screening Join movie on screening.movie = movie.id Join  hall on screening.hall_id = hall.id where title=?1  and  screening_start = ?2  Order by Screening_start asc ")
    List<Screening> getScreeningByTitileAndTime(String Title,LocalTime time);



}
