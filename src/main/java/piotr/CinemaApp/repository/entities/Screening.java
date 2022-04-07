package piotr.CinemaApp.repository.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "screening")
public class Screening {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "screening_start")
    private LocalDate screeningStart;

    @Column(name = "movie")
    @ManyToOne()
    private Movie movie;

    @Column(name = "hall")
    @ManyToOne
    private Hall hall;
}
