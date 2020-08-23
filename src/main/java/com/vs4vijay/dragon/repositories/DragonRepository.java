package com.vs4vijay.dragon.repositories;

import com.vs4vijay.dragon.models.Dragon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DragonRepository extends JpaRepository<Dragon, Long> {
    
}