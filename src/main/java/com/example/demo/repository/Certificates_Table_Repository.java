package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Certificates_Table;

@Repository
public interface Certificates_Table_Repository extends JpaRepository<Certificates_Table,Integer> {

}
