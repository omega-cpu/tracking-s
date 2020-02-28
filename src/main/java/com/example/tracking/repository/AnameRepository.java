package com.example.tracking.repository;

import java.util.List;

import com.example.tracking.models.Aname;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AnameRepository extends JpaRepository<Aname, Integer> {

    @Query(value = " select * from Aname a where a.policy_number like %:keyword% or a.location like %:keyword% ", nativeQuery= true)
    List<Aname> findByKeyword(@Param("keyword") String keyword);
    
}