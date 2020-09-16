package com.goodgame.repository;

import com.goodgame.model.Mouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MouseRepo extends JpaRepository<Mouse, Integer> {
}
