package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Process_Table;

@Repository
public interface Process_Table_Repository extends JpaRepository<Process_Table,Integer> {

}
