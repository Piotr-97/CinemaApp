package piotr.CinemaApp.repository.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import piotr.CinemaApp.repository.entities.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
