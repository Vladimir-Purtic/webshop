package com.goodgame.repository;

import com.goodgame.model.Keyboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyboardRepo extends JpaRepository<Keyboard, Integer> {
}
