package com.phoneshopmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phoneshopmanagement.Enity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
