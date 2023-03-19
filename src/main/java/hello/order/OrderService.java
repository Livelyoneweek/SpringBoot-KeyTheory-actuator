package hello.order;

import java.util.concurrent.atomic.AtomicInteger;

public interface OrderService {
    void order();
    void cancel();
    AtomicInteger getStock(); // OrderService 멀티스레드 상황에서 안전하게 값을 변화시킬수 있음
}
