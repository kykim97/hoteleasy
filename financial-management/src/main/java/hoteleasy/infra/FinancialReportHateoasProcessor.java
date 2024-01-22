package hoteleasy.infra;

import hoteleasy.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FinancialReportHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<FinancialReport>> {

    @Override
    public EntityModel<FinancialReport> process(
        EntityModel<FinancialReport> model
    ) {
        return model;
    }
}
