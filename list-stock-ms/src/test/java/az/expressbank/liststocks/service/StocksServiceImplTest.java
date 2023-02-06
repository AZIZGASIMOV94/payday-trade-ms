package az.expressbank.liststocks.service;

import az.expressbank.liststocks.dto.StocksResponseDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.mockito.Mockito.*;

@SpringBootTest(classes = StocksServiceImplTest.class)
public class StocksServiceImplTest {

    @MockBean
    StocksServiceInter stocksServiceInter;

    @Test
    public void testGetAllStocks() throws Exception {
        StocksResponseDto record_1 = new StocksResponseDto((long) 1, "AMAZON", 120D);
        StocksResponseDto record_2 = new StocksResponseDto((long) 2, "APPLE", 150D);

        when(stocksServiceInter.getAllStocks(anyInt(), anyInt())).thenReturn(List.of(record_1, record_2));

        Assertions.assertThat(stocksServiceInter.getAllStocks(anyInt(), anyInt())).hasSize(2);
        verify(stocksServiceInter, times(1)).getAllStocks(anyInt(), anyInt());
    }
}