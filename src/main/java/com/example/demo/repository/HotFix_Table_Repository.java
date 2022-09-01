package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Hotfix_Table;

@Repository
public interface HotFix_Table_Repository extends JpaRepository<Hotfix_Table,Integer>{

}
