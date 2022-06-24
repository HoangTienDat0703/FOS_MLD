package com.example.demo.repo;

import com.example.demo.entities.FeedBack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedBackRepository extends JpaRepository<FeedBack, Long> {

    FeedBack findByFeedBackId(Long id);
}
