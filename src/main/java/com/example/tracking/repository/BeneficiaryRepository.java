package com.example.tracking.repository;

import java.util.List;

import com.example.tracking.models.Beneficiary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Integer> {
    @Query(value = " select * from Beneficiary a where a.policynumber like %:keyword% or a.location like %:keyword% ", nativeQuery= true)
    List<Beneficiary> findByKeyword(@Param("keyword") String keyword);
}