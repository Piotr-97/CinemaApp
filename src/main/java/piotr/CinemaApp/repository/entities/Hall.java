package piotr.CinemaApp.repository.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "hall")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Hall {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column (name = "name")
    private String name;

    @Column(name ="seat_limit")
    private int seatLimit;


}
