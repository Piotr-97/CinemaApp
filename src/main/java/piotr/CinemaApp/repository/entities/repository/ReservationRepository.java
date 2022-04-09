package piotr.CinemaApp.repository.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import piotr.CinemaApp.repository.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
