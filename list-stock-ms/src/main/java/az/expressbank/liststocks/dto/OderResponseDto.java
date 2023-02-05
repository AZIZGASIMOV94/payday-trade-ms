package az.expressbank.liststocks.dto;

import az.expressbank.liststocks.enums.OrderTypes;
import az.expressbank.liststocks.enums.StatusTypes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OderResponseDto {

    private Long id;

    private String orderDesc;

    private Double orderPrice;

    private OrderTypes orderTypes;

    private StatusTypes orderStatus;
}
