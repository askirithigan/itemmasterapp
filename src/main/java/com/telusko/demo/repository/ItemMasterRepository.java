package com.telusko.demo.repository;

import com.telusko.demo.model.itemmaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemMasterRepository extends JpaRepository<itemmaster, Long> {
}
