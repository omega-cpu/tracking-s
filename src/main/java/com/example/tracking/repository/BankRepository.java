package com.example.tracking.repository;

import java.util.List;

import com.example.tracking.models.Bank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer> {
    @Query(value = " select * from Bank a where a.policynumber like %:keyword% or a.location like %:keyword% ", nativeQuery= true)
    List<Bank> findByKeyword(@Param("keyword") String keyword);
}