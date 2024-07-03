package br.com.portfolio.orders_api.infrastracture.repositories;

import br.com.portfolio.orders_api.domain.repositories.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class H2Repository implements OrderRepository {

    private final Logger log = LoggerFactory.getLogger(H2Repository.class);

    @Override
    public List<?> findAll() {
        log.info("H2Repository");
        return List.of();
    }
}
