package com.example.tracking.repository;

import java.util.List;

import com.example.tracking.models.Cancellation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CancellationRepository extends JpaRepository<Cancellation, Integer> {
    @Query(value = " select * from Cancellation a where a.policy_number like %:keyword% or a.location like %:keyword% ", nativeQuery= true)
    List<Cancellation> findByKeyword(@Param("keyword") String keyword);
}