package hoteleasy.domain;

import hoteleasy.MarketingAndAdvertisingApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MarketingCampaign_table")
@Data
//<<< DDD / Aggregate Root
public class MarketingCampaign {

    @Id
    private String name;

    private String description;

    public static MarketingCampaignRepository repository() {
        MarketingCampaignRepository marketingCampaignRepository = MarketingAndAdvertisingApplication.applicationContext.getBean(
            MarketingCampaignRepository.class
        );
        return marketingCampaignRepository;
    }
}
//>>> DDD / Aggregate Root
