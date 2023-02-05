package az.expressbank.liststocks.service;

import az.expressbank.liststocks.dto.StocksResponseDto;

import java.util.List;

public interface StocksServiceInter {

    List<StocksResponseDto> getAllStocks(Integer page, Integer size);
}
