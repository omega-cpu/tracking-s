package com.example.tracking.repository;

import java.util.List;

import com.example.tracking.models.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    @Query(value = " select * from Client a where a.policynumber like %:keyword% or a.location like %:keyword% ", nativeQuery= true)
    List<Client> findByKeyword(@Param("keyword") String keyword);
}