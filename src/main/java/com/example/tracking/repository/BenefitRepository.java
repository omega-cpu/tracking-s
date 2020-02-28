package com.example.tracking.repository;

import java.util.List;

import com.example.tracking.models.Benefit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitRepository extends JpaRepository<Benefit, Integer> {
    @Query(value = " select * from Benefit a where a.policynumber like %:keyword% or a.location like %:keyword% ", nativeQuery= true)
    List<Benefit> findByKeyword(@Param("keyword") String keyword);
}