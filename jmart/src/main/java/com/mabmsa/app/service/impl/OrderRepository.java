package com.mabmsa.app.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mabmsa.app.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {

}
