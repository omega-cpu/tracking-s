package com.example.tracking.repository;

import java.util.List;

import com.example.tracking.models.Trustee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TrusteeRepository extends JpaRepository<Trustee, Integer> {
    @Query(value = " select * from Trustee a where a.policynumber like %:keyword% or a.location like %:keyword% ", nativeQuery= true)
    List<Trustee> findByKeyword(@Param("keyword") String keyword);
}