package br.com.portfolio.orders_api.infrastracture;

import br.com.portfolio.orders_api.domain.repositories.OrderRepository;
import br.com.portfolio.orders_api.domain.services.OrderServiceImp;
import br.com.portfolio.orders_api.domain.services.interfaces.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    OrderService orderService(OrderRepository orderRepository) {
        return new OrderServiceImp(orderRepository);
    }
}
