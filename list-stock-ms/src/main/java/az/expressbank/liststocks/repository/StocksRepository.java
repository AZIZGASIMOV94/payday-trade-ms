package az.expressbank.liststocks.repository;

import az.expressbank.liststocks.entity.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface StocksRepository extends JpaRepository<Stocks, Long> {

    @Modifying
    @Query(value = "update stocks s set s.stack_name=?1, s.stock_price = ?2 where s.id=?3", nativeQuery = true)
    void updateStock(String stockName, Double stockPrice, Long id);


}
