package com.ochoomega.backendapi.domain.repository;

import com.ochoomega.backendapi.domain.entity.EvaluationSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationScheduleRepository extends JpaRepository <EvaluationSchedule,Integer> {

}
