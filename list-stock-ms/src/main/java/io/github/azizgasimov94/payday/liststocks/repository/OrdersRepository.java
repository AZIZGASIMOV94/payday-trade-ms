package io.github.azizgasimov94.payday.liststocks.repository;

import io.github.azizgasimov94.payday.liststocks.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Order, Long> {
}
