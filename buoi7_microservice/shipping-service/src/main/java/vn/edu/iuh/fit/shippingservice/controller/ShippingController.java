package vn.edu.iuh.fit.shippingservice.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/shipping")
@RequiredArgsConstructor
public class ShippingController {

    @GetMapping("/ship")
    @CircuitBreaker(name = "shippingService", fallbackMethod = "fallback")
    @Retry(name = "shippingService")
    @TimeLimiter(name = "shippingService")
    public CompletableFuture<String> startShipping(@RequestParam String orderId) {
        return CompletableFuture.supplyAsync(() -> {
            simulateNetworkLatency();
            if (Math.random() < 0.5) {
                throw new RuntimeException("Lỗi khi vận chuyển đơn hàng!");
            }
            return "Đã bắt đầu giao hàng cho đơn: " + orderId;
        });
    }

    public CompletableFuture<String> fallback(String orderId, Throwable ex) {
        return CompletableFuture.completedFuture("Hệ thống giao hàng đang bận.");
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

