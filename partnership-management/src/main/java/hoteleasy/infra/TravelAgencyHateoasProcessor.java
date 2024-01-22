package hoteleasy.infra;

import hoteleasy.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class TravelAgencyHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<TravelAgency>> {

    @Override
    public EntityModel<TravelAgency> process(EntityModel<TravelAgency> model) {
        return model;
    }
}
