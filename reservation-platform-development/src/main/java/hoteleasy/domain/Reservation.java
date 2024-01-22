package hoteleasy.domain;

import hoteleasy.ReservationPlatformDevelopmentApplication;
import hoteleasy.domain.HotelSearchAndReservation;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Reservation_table")
@Data
//<<< DDD / Aggregate Root
public class Reservation {

    @Id
    private User user;

    private Hotel hotel;

    private String roomType;

    private Payment paymentDetails;

    @PostPersist
    public void onPostPersist() {
        HotelSearchAndReservation hotelSearchAndReservation = new HotelSearchAndReservation(
            this
        );
        hotelSearchAndReservation.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ReservationRepository repository() {
        ReservationRepository reservationRepository = ReservationPlatformDevelopmentApplication.applicationContext.getBean(
            ReservationRepository.class
        );
        return reservationRepository;
    }
}
//>>> DDD / Aggregate Root
