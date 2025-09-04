package ordertest.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import ordertest.OrderApplication;
import ordertest.domain.OrderPlaced;

@Entity
@Table(name = "OrderAggregate_table")
@Data
//<<< DDD / Aggregate Root
public class OrderAggregate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private Long prodId;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();
    }

    public static OrderAggregateRepository repository() {
        OrderAggregateRepository orderAggregateRepository = OrderApplication.applicationContext.getBean(
            OrderAggregateRepository.class
        );
        return orderAggregateRepository;
    }
}
//>>> DDD / Aggregate Root
