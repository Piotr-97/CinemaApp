package piotr.CinemaApp.repository.entities;


import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Enumerated
    private TicketType ticketType;

    @ManyToOne
    private Reservation reservation;

    @ManyToOne
    private ReservedSeat reservedSeat;

    @ManyToOne
    private Screening screening;
}
