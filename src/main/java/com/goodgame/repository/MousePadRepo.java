package com.goodgame.repository;

import com.goodgame.model.MousePad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MousePadRepo extends JpaRepository<MousePad, Integer> {
}
