package piotr.CinemaApp.repository.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "screening")
public class Screening {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "screening_start")
    private LocalTime screeningStart;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "movie")
    private Movie movie;


    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "hall_id")
    private Hall hall;
}
