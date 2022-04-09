package piotr.CinemaApp.repository.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import piotr.CinemaApp.repository.entities.Screening;

@Repository
public interface ScreeningRepository extends JpaRepository<Screening,Long> {
}
