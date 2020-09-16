package com.goodgame.repository;

import com.goodgame.model.WebCam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebCamRepo extends JpaRepository<WebCam, Integer> {
}
