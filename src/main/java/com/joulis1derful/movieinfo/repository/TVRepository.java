package com.joulis1derful.movieinfo.repository;

import com.joulis1derful.movieinfo.entity.TV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TVRepository extends JpaRepository<TV, Integer> {
}
