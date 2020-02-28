package com.example.tracking.repository;

import java.util.List;

import com.example.tracking.models.Claim;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer> {
    @Query(value = " select * from Claim a where a.policy_number like %:keyword% or a.location like %:keyword% ", nativeQuery= true)
    List<Claim> findByKeyword(@Param("keyword") String keyword);
}