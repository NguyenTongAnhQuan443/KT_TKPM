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
    @CircuitBreaker(name = "paymentService", fallbackMethod = "fallback")
    @Retry(name = "paymentService")
    @TimeLimiter(name = "paymentService")
    public CompletableFuture<String> confirmPayment(@RequestParam String orderId) {
        return CompletableFuture.supplyAsync(() -> {
            simulateNetworkLatency(); // giả lập lỗi
            if (Math.random() < 0.5) {
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
            Thread.sleep(1000); // > timeout 3s → trigger TimeLimiter
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

