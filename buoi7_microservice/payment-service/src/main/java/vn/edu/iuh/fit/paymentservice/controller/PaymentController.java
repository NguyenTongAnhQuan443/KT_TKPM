package vn.edu.iuh.fit.paymentservice.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {

    @GetMapping("/confirm")
    @CircuitBreaker(name = "serviceCB", fallbackMethod = "fallback")
    @Retry(name = "serviceCB")
    @TimeLimiter(name = "serviceCB")
    public CompletableFuture<String> confirmPayment(@RequestParam String orderId) {
        return CompletableFuture.supplyAsync(() -> {
            simulateNetworkLatency(); // giả lập lỗi
            if (Math.random() < 0.1) {
                throw new RuntimeException("Lỗi khi xác nhận thanh toán!");
            }
            return "Đã thanh toán đơn hàng: " + orderId;
        });
    }

    public CompletableFuture<String> fallback(String orderId, Throwable ex) {
        return CompletableFuture.completedFuture("Hệ thống thanh toán đang bận.");
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(3000); // > timeout 2s → trigger TimeLimiter
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

