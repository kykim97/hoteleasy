package hoteleasy.domain;

import hoteleasy.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "customerSupportTickets",
    path = "customerSupportTickets"
)
public interface CustomerSupportTicketRepository
    extends PagingAndSortingRepository<CustomerSupportTicket, User> {}
