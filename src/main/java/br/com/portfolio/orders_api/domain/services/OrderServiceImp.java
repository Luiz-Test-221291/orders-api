package br.com.portfolio.orders_api.domain.services;

import br.com.portfolio.orders_api.domain.repositories.OrderRepository;
import br.com.portfolio.orders_api.domain.services.interfaces.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class OrderServiceImp implements OrderService {

    private final Logger log = LoggerFactory.getLogger(OrderServiceImp.class);

    private final OrderRepository orderRepository;

    public OrderServiceImp(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<?> findAll() {
        log.info("OrderServiceImp");
        return this.orderRepository.findAll();
    }
}
