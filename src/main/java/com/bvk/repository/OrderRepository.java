package com.bvk.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bvk.domain.Customer;
import com.bvk.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

	@Transactional(readOnly=true)
	Page<Order> findByCustomer(Customer customer,Pageable pageRequest);
	
}
