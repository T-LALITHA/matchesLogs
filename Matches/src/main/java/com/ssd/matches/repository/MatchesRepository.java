package com.ssd.matches.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssd.matches.model.Matches;

@Repository
public interface MatchesRepository extends JpaRepository<Matches,Integer>{

}
