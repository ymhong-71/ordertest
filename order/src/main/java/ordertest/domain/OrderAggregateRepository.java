package ordertest.domain;

import ordertest.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "orderAggregates",
    path = "orderAggregates"
)
public interface OrderAggregateRepository
    extends PagingAndSortingRepository<OrderAggregate, Long> {}
