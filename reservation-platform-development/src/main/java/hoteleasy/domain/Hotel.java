package hoteleasy.domain;

import hoteleasy.ReservationPlatformDevelopmentApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Hotel_table")
@Data
//<<< DDD / Aggregate Root
public class Hotel {

    @Id
    private String name;

    private Address location;

    private Money price;

    public static HotelRepository repository() {
        HotelRepository hotelRepository = ReservationPlatformDevelopmentApplication.applicationContext.getBean(
            HotelRepository.class
        );
        return hotelRepository;
    }
}
//>>> DDD / Aggregate Root
