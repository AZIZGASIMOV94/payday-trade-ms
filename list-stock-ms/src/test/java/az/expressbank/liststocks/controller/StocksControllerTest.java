package az.expressbank.liststocks.controller;

import az.expressbank.liststocks.dto.StocksResponseDto;
import az.expressbank.liststocks.service.StocksServiceInter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.anyInt;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StocksController.class)
public class StocksControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    StocksServiceInter stocksServiceInter;

    StocksResponseDto record_1 = new StocksResponseDto((long) 1, "AMAZON", 120D);
    StocksResponseDto record_2 = new StocksResponseDto((long) 2, "APPLE", 150D);
    StocksResponseDto record_3 = new StocksResponseDto((long) 3, "MICROSOFT", 170D);


    @Test
    public void testGetAllStocks() throws Exception {
        List<StocksResponseDto> records = new ArrayList<>(List.of(record_1, record_2, record_3));

        given(stocksServiceInter.getAllStocks(anyInt(), anyInt())).willReturn(records);

        mockMvc.perform(get("/stocks")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)));
    }

    @Test
    public void shouldReturnDataOfTheFirstStock() throws Exception {
        List<StocksResponseDto> records = new ArrayList<>(List.of(record_1, record_2, record_3));

        given(stocksServiceInter.getAllStocks(anyInt(), anyInt())).willReturn(records);

        mockMvc.perform(get("/stocks")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].id", equalTo(records.get(0).getId().intValue())))
                .andExpect(jsonPath("$[0].stackName", is(records.get(0).getStackName())))
                .andExpect(jsonPath("$[0].stockPrice", is(records.get(0).getStockPrice().doubleValue())));
    }

    @Test
    public void shouldReturnDataOfTheSecondStock() throws Exception {
        List<StocksResponseDto> records = new ArrayList<>(List.of(record_1, record_2, record_3));

        given(stocksServiceInter.getAllStocks(anyInt(), anyInt())).willReturn(records);

        mockMvc.perform(get("/stocks")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[1].id", equalTo(records.get(1).getId().intValue())))
                .andExpect(jsonPath("$[1].stackName", is(records.get(1).getStackName())))
                .andExpect(jsonPath("$[1].stockPrice", is(records.get(1).getStockPrice().doubleValue())));
    }

    @Test
    public void shouldReturnDataOfTheThirdStock() throws Exception {
        List<StocksResponseDto> records = new ArrayList<>(List.of(record_1, record_2, record_3));

        given(stocksServiceInter.getAllStocks(anyInt(), anyInt())).willReturn(records);

        mockMvc.perform(get("/stocks")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[2].id", equalTo(records.get(2).getId().intValue())))
                .andExpect(jsonPath("$[2].stackName", is(records.get(2).getStackName())))
                .andExpect(jsonPath("$[2].stockPrice", is(records.get(2).getStockPrice().doubleValue())));
    }
}