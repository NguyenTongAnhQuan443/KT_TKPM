package vn.edu.iuh.fit.inventoryservice.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    @GetMapping("/deduct")
    @CircuitBreaker(name = "serviceCB", fallbackMethod = "fallback")
    @Retry(name = "serviceCB")
    @TimeLimiter(name = "serviceCB")
    public CompletableFuture<String> deductStock(@RequestParam String productId) {
        return CompletableFuture.supplyAsync(() -> {
            simulateNetworkLatency();
            if (Math.random() < 0.5) {
                throw new RuntimeException("Lỗi trừ kho!");
            }
            return "Đã trừ kho sản phẩm: " + productId;
        });
    }

    public CompletableFuture<String> fallback(String productId, Throwable ex) {
        return CompletableFuture.completedFuture("Hệ thống kho đang quá tải.");
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
