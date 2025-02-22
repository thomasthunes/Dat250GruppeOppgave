package no.feedapp.group2.FeedApp.repositories;

import no.feedapp.group2.FeedApp.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findByEmail(String email);

    Customer findByUserId(long userId);
}
