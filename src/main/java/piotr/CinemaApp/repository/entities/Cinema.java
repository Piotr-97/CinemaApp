package piotr.CinemaApp.repository.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cinema")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Cinema {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @OneToOne(mappedBy = "Address_id")
    private Address address;




}