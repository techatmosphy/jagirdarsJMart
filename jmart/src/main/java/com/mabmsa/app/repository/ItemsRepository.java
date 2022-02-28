package com.mabmsa.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mabmsa.app.model.Items;

public interface ItemsRepository extends JpaRepository<Items, Long> {

}
