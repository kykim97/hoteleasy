package hoteleasy.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class MakeReservationCommand {

    private User user;
    private Hotel hotel;
    private String roomType;
    private Payment paymentDetails;
}
