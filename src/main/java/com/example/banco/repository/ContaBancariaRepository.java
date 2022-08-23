package com.example.banco.repository;

import com.example.banco.model.ContaBancariaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaBancariaRepository extends JpaRepository<ContaBancariaModel, Long> {
}
