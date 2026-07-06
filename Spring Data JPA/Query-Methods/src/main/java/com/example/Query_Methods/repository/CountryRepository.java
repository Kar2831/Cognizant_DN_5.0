package com.example.Query_Methods.repository;

import com.example.Query_Methods.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    public List<Country> findByNameContaining(String name);
    public List<Country> findByNameContainingOrderByNameAsc(String name);
}
