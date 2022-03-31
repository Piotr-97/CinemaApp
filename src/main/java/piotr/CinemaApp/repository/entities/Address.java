package piotr.CinemaApp.repository.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "zipcode")
    private String zipCode;


}
