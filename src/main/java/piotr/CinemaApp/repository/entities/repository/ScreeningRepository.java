package piotr.CinemaApp.repository.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import piotr.CinemaApp.repository.entities.Screening;

import java.util.List;

@Repository
public interface ScreeningRepository extends JpaRepository<Screening,Long> {

    @Query(nativeQuery = true, value = "select * from screening Order by Screening_start DESC")
    List<Screening> getAllScreeningOrderedByStart();
}
