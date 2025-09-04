package ordertest.domain;

import java.util.*;
import lombok.*;
import ordertest.domain.*;
import ordertest.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private Long prodId;
}
