package hoteleasy.infra;

import hoteleasy.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomerSupportTicketHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<CustomerSupportTicket>> {

    @Override
    public EntityModel<CustomerSupportTicket> process(
        EntityModel<CustomerSupportTicket> model
    ) {
        return model;
    }
}
