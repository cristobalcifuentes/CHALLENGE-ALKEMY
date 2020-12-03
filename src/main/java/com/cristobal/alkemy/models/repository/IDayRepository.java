package com.cristobal.alkemy.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristobal.alkemy.models.entity.Day;

public interface IDayRepository extends JpaRepository<Day, Integer> {

}
