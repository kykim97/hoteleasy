package hoteleasy.infra;

import hoteleasy.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class HotelPartnerHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<HotelPartner>> {

    @Override
    public EntityModel<HotelPartner> process(EntityModel<HotelPartner> model) {
        return model;
    }
}
