package br.com.portfolio.orders_api.domain.repositories;

import java.util.List;

public interface OrderRepository {

    List<?> findAll();
}
