package com.msx.productCategory.repositories;

import com.msx.productCategory.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Long> {
//
    List<Category> findAll();

    Optional<Category> findById(Long id);

}
