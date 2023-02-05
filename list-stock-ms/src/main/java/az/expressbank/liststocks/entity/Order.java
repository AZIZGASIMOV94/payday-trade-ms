package az.expressbank.liststocks.entity;


import az.expressbank.liststocks.enums.OrderTypes;
import az.expressbank.liststocks.enums.StatusTypes;
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
