package az.expressbank.liststocks.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StocksResponseDto {

    private Long id;

    private String stackName;

    private Double stockPrice;
}
