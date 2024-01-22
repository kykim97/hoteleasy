package hoteleasy.domain;

import hoteleasy.PartnershipManagementApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TravelAgency_table")
@Data
//<<< DDD / Aggregate Root
public class TravelAgency {

    @Id
    private String name;

    private String email;

    public static TravelAgencyRepository repository() {
        TravelAgencyRepository travelAgencyRepository = PartnershipManagementApplication.applicationContext.getBean(
            TravelAgencyRepository.class
        );
        return travelAgencyRepository;
    }
}
//>>> DDD / Aggregate Root
