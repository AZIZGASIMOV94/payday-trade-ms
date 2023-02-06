package az.expressbank.deposit.controller;

import az.expressbank.deposit.service.DepositCashAccountServiceInter;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(DepositCashController.class)
public class DepositCashControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    DepositCashAccountServiceInter depositCashAccountServiceInter;
    @InjectMocks
    DepositCashController depositCashController;


    @Test
    public void testGetAllStocks() throws Exception {

    }
}
