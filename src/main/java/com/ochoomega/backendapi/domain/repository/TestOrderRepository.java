package com.ochoomega.backendapi.domain.repository;

import com.ochoomega.backendapi.domain.entity.TestOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestOrderRepository extends JpaRepository <TestOrder,Integer> {

}
