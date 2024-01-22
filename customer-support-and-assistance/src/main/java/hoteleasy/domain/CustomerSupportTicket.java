package hoteleasy.domain;

import hoteleasy.CustomerSupportAndAssistanceApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "CustomerSupportTicket_table")
@Data
//<<< DDD / Aggregate Root
public class CustomerSupportTicket {

    @Id
    private User user;

    private String message;

    @PrePersist
    public void onPrePersist() {}

    public static CustomerSupportTicketRepository repository() {
        CustomerSupportTicketRepository customerSupportTicketRepository = CustomerSupportAndAssistanceApplication.applicationContext.getBean(
            CustomerSupportTicketRepository.class
        );
        return customerSupportTicketRepository;
    }
}
//>>> DDD / Aggregate Root
