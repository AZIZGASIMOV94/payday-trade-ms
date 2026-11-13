package io.github.azizgasimov94.payday.liststocks.service;

import io.github.azizgasimov94.payday.liststocks.dto.StocksResponseDto;

import java.util.List;

public interface StocksServiceInter {

    List<StocksResponseDto> getAllStocks(Integer page, Integer size);
}
