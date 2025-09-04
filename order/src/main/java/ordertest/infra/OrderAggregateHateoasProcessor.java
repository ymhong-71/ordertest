package ordertest.infra;

import ordertest.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class OrderAggregateHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<OrderAggregate>> {

    @Override
    public EntityModel<OrderAggregate> process(
        EntityModel<OrderAggregate> model
    ) {
        return model;
    }
}
