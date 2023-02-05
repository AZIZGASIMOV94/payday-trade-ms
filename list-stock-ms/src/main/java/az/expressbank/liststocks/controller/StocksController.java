package az.expressbank.liststocks.controller;

import az.expressbank.liststocks.service.StocksServiceInter;
import az.expressbank.liststocks.dto.StocksResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/stocks")
public class StocksController {

    private final StocksServiceInter stocksServiceInter;

    @GetMapping
    public ResponseEntity<List<StocksResponseDto>> getAllStocks(
            @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
            @RequestParam(value = "size", required = false, defaultValue = "10") Integer size){
        return ResponseEntity.ok(stocksServiceInter.getAllStocks(page, size));
    }
}
