package com.ochoomega.backendapi.domain.repository;

import com.ochoomega.backendapi.domain.entity.ActiveRetired;
import com.ochoomega.backendapi.domain.entity.FormDataPostGres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiveRetiredRepository extends JpaRepository <ActiveRetired,Long> {

}
