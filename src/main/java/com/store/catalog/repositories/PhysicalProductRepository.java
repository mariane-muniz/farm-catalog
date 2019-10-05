package com.store.catalog.repositories;

import com.store.catalog.models.PhysicalProduct;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource( path = "physical_product", collectionResourceRel = "physical_product" )
public interface PhysicalProductRepository extends CrudRepository<PhysicalProduct, Long> {

}