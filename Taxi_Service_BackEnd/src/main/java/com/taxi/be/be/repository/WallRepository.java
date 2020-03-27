package com.taxi.be.repository;

import com.taxi.be.parsing.Wall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WallRepository extends JpaRepository<Wall,String> {
}