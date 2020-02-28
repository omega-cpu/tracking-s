package com.example.tracking.repository;

import java.util.List;

import com.example.tracking.models.Assured;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AssuredRepository extends JpaRepository<Assured, Integer> {
    @Query(value = " select * from Assured a where a.policynumber like %:keyword% or a.location like %:keyword% ", nativeQuery= true)
    List<Assured> findByKeyword(@Param("keyword") String keyword);
}