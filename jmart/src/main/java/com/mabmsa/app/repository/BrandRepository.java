package com.mabmsa.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mabmsa.app.model.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
