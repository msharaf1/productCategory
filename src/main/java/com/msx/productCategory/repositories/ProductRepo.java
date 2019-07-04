package com.msx.productCategory.repositories;

import com.msx.productCategory.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {

    List<Product> findAll();

    Optional<Product> findById(Long id);
}
