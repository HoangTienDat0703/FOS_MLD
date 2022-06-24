package com.example.demo.repo;

import com.example.demo.entities.Table_QRCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Table_QRCodeRepository extends JpaRepository<Table_QRCode,Long> {
}
