package com.taxi.sa.repository;

import com.taxi.sa.parsing.city.CityMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapRepository extends JpaRepository<CityMap, String> {
}