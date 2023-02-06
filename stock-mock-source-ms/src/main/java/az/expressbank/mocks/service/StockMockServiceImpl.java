package az.expressbank.mocks.service;

import az.expressbank.liststocks.entity.Stocks;
import az.expressbank.liststocks.repository.StocksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class StockMockServiceImpl implements StockMockServiceInter {

    private final StocksRepository stocksRepository;

    private Random random = new Random();

    @Transactional
    @Scheduled(fixedRate = 5 * 60_000)
    @Override
    public void updateStocksJob() {

        Stocks stock1 = Stocks.builder()
                .id(1l)
                .stackName("APPLE")
                .stockPrice((double) random.nextInt(500 - 100) + 100)
                .build();

        Stocks stock2 = Stocks.builder()
                .id(2l)
                .stackName("AMAZON")
                .stockPrice((double) random.nextInt(500 - 100) + 100)
                .build();

        Stocks stock3 = Stocks.builder()
                .id(3l)
                .stackName("TESLA")
                .stockPrice((double) random.nextInt(500 - 100) + 100)
                .build();

        Stocks stock4 = Stocks.builder()
                .id(4l)
                .stackName("MICROSOFT")
                .stockPrice((double) random.nextInt(500 - 100) + 100)
                .build();

        stocksRepository.updateStock(stock1.getStackName(), stock1.getStockPrice(), stock1.getId());
        stocksRepository.updateStock(stock2.getStackName(), stock2.getStockPrice(), stock2.getId());
        stocksRepository.updateStock(stock3.getStackName(), stock3.getStockPrice(), stock3.getId());
        stocksRepository.updateStock(stock3.getStackName(), stock4.getStockPrice(), stock4.getId());

    }
}
