package hello.controller;

import hello.order.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderController {
    public final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order")
    public String order() {
        log.info("order");
        orderService.order();
        return "order";
    }
// 예제 단순함 위해서 getMapping으로 통일
    @GetMapping("/stock")
    public int stock() {
        log.info("stock");
        return orderService.getStock().get(); //int로 꺼낼려면 get()
    }

    @GetMapping("/cancel")
    public String cancel() {
        log.info("cancel");
        orderService.cancel();
        return "cancel";
    }
}
