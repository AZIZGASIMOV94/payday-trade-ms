package io.github.azizgasimov94.payday.liststocks.entity;


import io.github.azizgasimov94.payday.liststocks.enums.OrderTypes;
import io.github.azizgasimov94.payday.liststocks.enums.StatusTypes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderDesc;

    private Double orderPrice;

    private OrderTypes orderTypes;

    private StatusTypes orderStatus;
}
