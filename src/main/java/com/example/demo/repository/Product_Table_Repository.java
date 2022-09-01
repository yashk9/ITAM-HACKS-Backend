package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product_Table;

@Repository
public interface Product_Table_Repository extends JpaRepository<Product_Table, Integer>{

}
