package com.example.tracking.repository;

import java.util.List;

import com.example.tracking.models.Employer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Integer> {
    @Query(value = " select * from Employer a where a.policynumber like %:keyword% or a.location like %:keyword% ", nativeQuery= true)
    List<Employer> findByKeyword(@Param("keyword") String keyword);
}