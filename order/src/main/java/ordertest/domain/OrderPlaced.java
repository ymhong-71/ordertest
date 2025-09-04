package ordertest.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import ordertest.domain.*;
import ordertest.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private Long prodId;

    public OrderPlaced(OrderAggregate aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
