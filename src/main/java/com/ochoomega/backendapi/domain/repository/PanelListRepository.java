package com.ochoomega.backendapi.domain.repository;

import com.ochoomega.backendapi.domain.entity.PanelList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanelListRepository extends JpaRepository <PanelList,Integer> {

}
