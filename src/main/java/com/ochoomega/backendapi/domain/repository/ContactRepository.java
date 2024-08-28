package com.ochoomega.backendapi.domain.repository;

import com.ochoomega.backendapi.domain.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository <Contact,Long> {

}
