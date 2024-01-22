package hoteleasy.domain;

import hoteleasy.domain.*;
import hoteleasy.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class HotelSearchAndReservation extends AbstractEvent {

    private User user;
    private Hotel hotel;
    private String roomType;

    public HotelSearchAndReservation(Reservation aggregate) {
        super(aggregate);
    }

    public HotelSearchAndReservation() {
        super();
    }
}
//>>> DDD / Domain Event
