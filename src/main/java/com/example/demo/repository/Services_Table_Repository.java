package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Services_Table;

@Repository
public interface Services_Table_Repository extends JpaRepository<Services_Table,Integer>{

}
