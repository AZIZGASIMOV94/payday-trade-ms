package az.expressbank.liststocks.repository;

import az.expressbank.liststocks.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Order, Long> {
}
