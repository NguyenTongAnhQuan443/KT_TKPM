## Phần 3: Docker Compose nâng cao

### Bài tập 1: Triển khai WordPress với MySQL
**Mục tiêu:** Tạo stack WordPress kết nối với MySQL, sử dụng volumes để lưu trữ dữ liệu.  

**Yêu cầu:**  
1. Sử dụng image `wordpress:latest` (port 80).  
2. Sử dụng image `mysql:5.7` (port 3306).  
3. Volume cho database (`/var/lib/mysql`).  
4. Biến môi trường cho MySQL:  
   - `MYSQL_ROOT_PASSWORD`  
   - `MYSQL_DATABASE`  
   - `MYSQL_USER`  
   - `MYSQL_PASSWORD`  

📌 *Gợi ý:* WordPress cần khai báo `depends_on` MySQL. Sử dụng network tùy chỉnh để kết nối giữa 2 service.

![Minh chứng Bài tập 1 - WordPress + MySQL](./images/phan3-bai1-wordpress-mysql.png)

---

### Bài tập 2: Ứng dụng Node.js + MongoDB
**Mục tiêu:** Triển khai ứng dụng Node.js lưu dữ liệu vào MongoDB và sử dụng volume.  

**Yêu cầu:**  
1. Viết `Dockerfile` cho ứng dụng Node.js (ví dụ: REST API đơn giản).  
2. Sử dụng image `mongo:latest` (port 27017).  
3. Volume cho MongoDB (`/data/db`).  
4. Đảm bảo Node.js service khởi động sau MongoDB (`depends_on` + `healthcheck`).

![Minh chứng Bài tập 2 - Node.js + MongoDB](./images/phan3-bai2-node-mongo.png)

---

### Bài tập 3: Load Balancing với Nginx + Flask
**Mục tiêu:** Cân bằng tải giữa 2 instance Flask bằng Nginx reverse proxy.  

**Yêu cầu:**  
1. 2 service Flask (chạy `app.py`, port 5000).  
2. 1 service Nginx (port 8080) cấu hình làm reverse proxy.  
   - Chuyển request `/` đến các Flask instance (dùng round-robin).  
3. Tạo custom network và cấu hình Nginx riêng.

![Minh chứng Bài tập 3 - Nginx + Flask](./images/phan3-bai3-nginx-flask.png)

---

### Bài tập 4: Prometheus + Grafana Monitoring
**Mục tiêu:** Giám sát Docker containers bằng Prometheus và Grafana.  

**Yêu cầu:**  
1. Service Prometheus (port 9090) dùng file cấu hình để thu thập metrics từ Docker.  
2. Service Grafana (port 3000) kết nối đến Prometheus.  
3. Sử dụng volumes để lưu dữ liệu cho cả Prometheus và Grafana.

![Minh chứng Bài tập 4 - Prometheus + Grafana](./images/phan3-bai4-monitoring.png)
