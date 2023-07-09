package com.get.job.list.get_joblist_api.models.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.get.job.list.get_joblist_api.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByNameContains(String name);
}
