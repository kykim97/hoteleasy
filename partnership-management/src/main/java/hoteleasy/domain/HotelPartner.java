package hoteleasy.domain;

import hoteleasy.PartnershipManagementApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "HotelPartner_table")
@Data
//<<< DDD / Aggregate Root
public class HotelPartner {

    @Id
    private String name;

    private String email;

    public static HotelPartnerRepository repository() {
        HotelPartnerRepository hotelPartnerRepository = PartnershipManagementApplication.applicationContext.getBean(
            HotelPartnerRepository.class
        );
        return hotelPartnerRepository;
    }
}
//>>> DDD / Aggregate Root
