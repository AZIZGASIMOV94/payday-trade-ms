package az.expressbank.liststocks.service;

import az.expressbank.liststocks.repository.StocksRepository;
import az.expressbank.liststocks.dto.StocksResponseDto;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class StocksServiceImpl implements StocksServiceInter{

    private final StocksRepository stocksRepository;

    private final ModelMapper modelMapper;

    @Override
    public List<StocksResponseDto> getAllStocks(Integer page, Integer size) {
        return stocksRepository.findAll(PageRequest.of(page, size))
                .stream()
                .map(stock -> modelMapper.map(stock, StocksResponseDto.class))
                .collect(Collectors.toList());
    }
}
