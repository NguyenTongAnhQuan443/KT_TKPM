# Họ và tên: Nguyễn Tống Anh Quân
# MSSV: 21006171

# Thực hành Docker Compose

## Phần 1: Một số lệnh Docker Compose cơ bản

### 1. `docker compose version`
> Lệnh kiểm tra phiên bản Docker Compose đã cài đặt.

![Buoi5_Docker_Compose/MinhChung/image.png](MinhChung/1.png)

---

### 2. `docker compose up`
> Khởi động các dịch vụ trong tệp `docker-compose.yml`.

![Buoi5_Docker_Compose/MinhChung/image.png](MinhChung/2.png)


---

### 3. `docker compose up -d`
> Khởi động các dịch vụ ở chế độ nền (detached mode).

![Buoi5_Docker_Compose/MinhChung/image.png](MinhChung/3.png)

---

### 4. `docker compose ps`
> Kiểm tra trạng thái các container trong Docker Compose.

![Buoi5_Docker_Compose/MinhChung/image.png](MinhChung/4.png)

---

### 5. `docker compose down`
> Dừng và xóa các container, network đã tạo bởi Docker Compose.

![Buoi5_Docker_Compose/MinhChung/image.png](MinhChung/5.png)

---

### 6. `docker compose restart`
> Khởi động lại các container trong Compose.

![Ảnh minh chứng](./images/docker-compose-restart.png)

---

### 7. `docker compose logs -f`
> Xem logs trực tiếp từ các container đang chạy.

![Ảnh minh chứng](./images/docker-compose-logs-f.png)

---

### 8. `docker compose build`
> Build lại các image theo định nghĩa trong `docker-compose.yml`.

![Ảnh minh chứng](./images/docker-compose-build.png)

---

### 9. `docker compose exec <service_name> <command>`
> Chạy một lệnh trong container đang chạy (ví dụ: bash, ls, ...).

![Ảnh minh chứng](./images/docker-compose-exec.png)

---

### 10. `docker compose down -v`
> Dừng và xóa container, network, **và volume**.

![Ảnh minh chứng](./images/docker-compose-down-v.png)

---

### 11. `docker compose run <service_name> <command>`
> Chạy một lệnh trong container mới (không cần container đang chạy).

![Ảnh minh chứng](./images/docker-compose-run.png)

---

### 12. `docker compose stop <service_name>`
> Tạm dừng container của một service cụ thể.

![Ảnh minh chứng](./images/docker-compose-stop.png)

---

### 13. `docker compose rm <service_name>`
> Xóa container của một service cụ thể (sau khi đã stop hoặc down).

![Ảnh minh chứng](./images/docker-compose-rm.png)

---

### 14. `docker compose config`
> Kiểm tra cấu hình Compose hiện tại (sau khi merge từ file yml).

![Ảnh minh chứng](./images/docker-compose-config.png)

---

### 15. `docker compose up -d --build`
> Build lại image và khởi động dịch vụ ở chế độ nền.

![Ảnh minh chứng](./images/docker-compose-up-d-build.png)
