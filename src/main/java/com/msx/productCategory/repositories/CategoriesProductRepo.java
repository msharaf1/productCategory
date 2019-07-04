package com.msx.productCategory.repositories;

import com.msx.productCategory.models.CategoriesProducts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoriesProductRepo extends CrudRepository<CategoriesProducts, Long> {

    List<CategoriesProducts> findAll();

    Optional<CategoriesProducts> findById(Long id);

}
