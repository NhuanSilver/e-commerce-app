package com.silver.productservice.product;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll(Specification<Product> productSpecification);
    List<Product> findAllByIdInOrderById(List<Long> ids);
}
