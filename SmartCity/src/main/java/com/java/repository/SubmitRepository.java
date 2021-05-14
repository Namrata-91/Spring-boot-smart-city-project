package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.SubmitedData;

public interface  SubmitRepository extends JpaRepository<SubmitedData, String>{
}
